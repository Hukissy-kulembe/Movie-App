package com.example.filme.domain.repository

import com.example.filme.data.local.entities.MovieEntity
import com.example.filme.domain.model.Movie
import kotlinx.coroutines.flow.Flow

interface MovieRepository {
    suspend fun fetchRemotePopularMovies(): List<Movie>

    suspend fun fetchRemoteUpcomingMovies(): List<Movie>

    suspend fun fetchRemoteNowPlayingMovies(): List<Movie>

    suspend fun fetchRemoteMovieById(id: Int): Movie

    suspend fun fetchMoviesByQuery(query: String): List<Movie>

    fun getLocalMovieByCategoryStream(category: String): Flow<List<Movie>>

    suspend fun saveLocalMovies(movies: List<MovieEntity>)

    suspend fun getLocalMovieByID(id: Int): Movie?
}

