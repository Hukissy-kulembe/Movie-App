package com.example.filme.domain.datasource

import com.example.filme.domain.model.Movie

interface MovieRemoteDataSource {
    suspend fun fetchPopularMovies(): List<Movie>

    suspend fun fetchUpcomingMovies(): List<Movie>

    suspend fun fetchNowPlayingMovies(): List<Movie>

    suspend fun fetchMovieById(id: Int): Movie

    suspend fun fetchMoviesByQuery(query: String): List<Movie>
}