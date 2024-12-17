package com.example.filme.data.local

import com.example.filme.data.local.dao.MovieDao
import com.example.filme.data.local.entities.MovieEntity
import com.example.filme.data.local.entities.asDomain
import com.example.filme.domain.datasource.MovieLocalDataSource
import com.example.filme.domain.model.Movie
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map


class MovieLocalDataSourceImpl(
    private val movieDao: MovieDao,
): MovieLocalDataSource {

    override fun getMovieByCategoryStream(category: String): Flow<List<Movie>> {
        return movieDao.getMovieByCategory(category).map { it.map { movieEntity -> movieEntity.asDomain() } }
    }

    override suspend fun saveMovies(movies: List<MovieEntity>) {
        movieDao.insertAll(movies)
    }

    override suspend fun getMovieById(id: Int): Movie? {
       return movieDao.getMovieById(id)?.asDomain()
    }
}