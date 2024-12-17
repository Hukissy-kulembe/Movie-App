package com.example.filme.di

import android.content.Context
import com.example.filme.data.local.AppDatabase
import com.example.filme.data.local.MovieLocalDataSourceImpl
import com.example.filme.data.remote.MovieApiService
import com.example.filme.data.remote.MovieRemoteDataSourceImpl
import com.example.filme.data.repository.MovieRepositoryImpl
import com.example.filme.domain.datasource.MovieLocalDataSource
import com.example.filme.domain.datasource.MovieRemoteDataSource
import com.example.filme.domain.repository.MovieRepository
import com.example.filme.domain.repository.WorkManagerRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideApiService(): MovieApiService {
        return Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/3/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MovieApiService::class.java)
    }


    @Provides
    fun provideRemoteDataSource(apiService: MovieApiService): MovieRemoteDataSource {
        return MovieRemoteDataSourceImpl(apiService)
    }


    @Provides
    fun provideLocalDataSource(@ApplicationContext context: Context): MovieLocalDataSource {
        return MovieLocalDataSourceImpl(
            AppDatabase.getDatabase(context).moviesDao()
        )
    }

    @Provides
    fun provideMovieRepository(
        movieRemoteDataSource: MovieRemoteDataSource,
        movieLocalDataSource: MovieLocalDataSource
    ): MovieRepository {
        return MovieRepositoryImpl(movieRemoteDataSource, movieLocalDataSource)
    }

}