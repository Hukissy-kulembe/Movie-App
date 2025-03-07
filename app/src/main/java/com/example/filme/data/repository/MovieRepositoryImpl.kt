package com.example.filme.data.repository

import com.example.filme.data.local.entities.MovieEntity
import com.example.filme.domain.datasource.MovieLocalDataSource
import com.example.filme.domain.datasource.MovieRemoteDataSource
import com.example.filme.domain.model.Movie
import com.example.filme.domain.repository.MovieRepository
import kotlinx.coroutines.flow.Flow


class MovieRepositoryImpl(
    private val movieRemoteDataSource: MovieRemoteDataSource,
    private val movieLocalDataSource: MovieLocalDataSource
): MovieRepository {
    override suspend fun fetchRemotePopularMovies(): List<Movie> {
        return movieRemoteDataSource.fetchPopularMovies()
    }

    override suspend fun fetchRemoteUpcomingMovies(): List<Movie> {
        return movieRemoteDataSource.fetchUpcomingMovies()
    }

    override suspend fun fetchRemoteNowPlayingMovies(): List<Movie> {
        return movieRemoteDataSource.fetchNowPlayingMovies() }

    override suspend fun fetchRemoteMovieById(id: Int): Movie {
        return movieRemoteDataSource.fetchMovieById(id)
    }

    override suspend fun fetchMoviesByQuery(query: String): List<Movie> {
        return movieRemoteDataSource.fetchMoviesByQuery(query)
    }

    override fun getLocalMovieByCategoryStream(category: String): Flow<List<Movie>> {
        return movieLocalDataSource.getMovieByCategoryStream(category)
    }

    override suspend fun saveLocalMovies(movies: List<MovieEntity>) {
        movieLocalDataSource.saveMovies(movies)
    }

    override suspend fun getLocalMovieByID(id: Int): Movie? {
        return movieLocalDataSource.getMovieById(id)
    }
}