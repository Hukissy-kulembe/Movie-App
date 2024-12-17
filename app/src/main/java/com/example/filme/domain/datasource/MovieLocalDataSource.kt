package com.example.filme.domain.datasource

import com.example.filme.data.local.entities.MovieEntity
import com.example.filme.domain.model.Movie
import kotlinx.coroutines.flow.Flow

interface MovieLocalDataSource {

    fun getMovieByCategoryStream(category: String): Flow<List<Movie>>

    suspend fun saveMovies(movies: List<MovieEntity>)

    suspend fun getMovieById(id: Int): Movie?
}