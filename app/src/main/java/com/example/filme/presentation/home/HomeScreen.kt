package com.example.filme.presentation.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.filme.domain.model.Movie
import com.example.filme.presentation.navigateToDetail
import com.example.filme.presentation.util.components.ExtendedMovieCard
import com.example.filme.presentation.util.components.NowPlayingMovieList
import com.example.filme.presentation.util.components.StickyHeader
import com.example.filme.presentation.util.components.UpcomingMovieList
import com.example.filme.ui.theme.FilmeTheme

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = hiltViewModel(),
    navController: NavHostController,

    ) {
     HomeContent(
         modifier = modifier,
         upcomingMovies = viewModel.upcomingMovies.collectAsState().value,
         popularMovies = viewModel.popularMovies.collectAsState().value,
         playingNowMovies = viewModel.playingNowMovies.collectAsState().value,
         onMovieClick = { id ->
             navController.navigateToDetail(id)
         },
     )
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeContent(
    modifier: Modifier = Modifier,
    upcomingMovies: List<Movie>,
    popularMovies: List<Movie>,
    playingNowMovies: List<Movie>,
    onMovieClick: (Int) -> Unit,
) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(12.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp),
    ) {
        stickyHeader { StickyHeader(title = "Upcoming") }
        item {
            UpcomingMovieList(
                movies = upcomingMovies,
                onMovieClick = { movie ->
                    onMovieClick(movie.id)
                }
            )
        }
        stickyHeader { StickyHeader(title = "Now Playing") }

        item {
            NowPlayingMovieList(
                movies = popularMovies,
                onMovieClick = { movie ->
                    onMovieClick(movie.id)
                }
            )
        }

        stickyHeader { StickyHeader(title = "Popular") }
        items(playingNowMovies, { movie -> movie.id }){ movie ->
            ExtendedMovieCard(
                modifier = Modifier.padding(bottom = 16.dp),
                movie = movie,
                onClick = {
                    onMovieClick(movie.id)
                }
            )
        }
    }
}

@Composable
@Preview
private fun HomePreview() {
    FilmeTheme() {
    }
}