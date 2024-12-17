package com.example.filme.presentation.home

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.filme.data.local.entities.MovieCategory
import com.example.filme.domain.model.Movie
import com.example.filme.domain.repository.MovieRepository
import com.example.filme.domain.repository.WorkManagerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class HomeViewModel @Inject constructor (
     movieRepository: MovieRepository,
): ViewModel() {

    var popularMovies: MutableStateFlow<List<Movie>> = MutableStateFlow(emptyList())

    var playingNowMovies: MutableStateFlow<List<Movie>> = MutableStateFlow(emptyList())

    var upcomingMovies: MutableStateFlow<List<Movie>> = MutableStateFlow(emptyList())

    init {
        viewModelScope.launch {
            popularMovies.value = movieRepository.fetchRemotePopularMovies()
            upcomingMovies.value = movieRepository.fetchRemoteUpcomingMovies()
            playingNowMovies.value = movieRepository.fetchRemoteNowPlayingMovies()
        }
    }
}
