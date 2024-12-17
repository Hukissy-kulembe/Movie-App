package com.example.filme.data.remote

import com.example.filme.data.remote.models.MovieDto
import com.example.filme.data.remote.models.NetworkMovieResponse
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

const val MOVIE_API_KEY = "Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJjZjNjYmY2ZGNkZDNiZTMyZDI1ZjY1YWE3NzhmOTU3MyIsIm5iZiI6MTczNDQyNDQ1Ny42ODYsInN1YiI6IjY3NjEzNzg5MTU0OGQ4N2E2Y2NiZTNlNiIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.gYeHYZ1WxQTprD_-JsYBHM4Lk-bEXY5viJF02n-xJHQ"

interface MovieApiService {
    @Headers(MOVIE_API_KEY)
    @GET("discover/movie?include_adult=false&include_video=false&language=pt-BR&page=1&sort_by=popularity.desc")
    suspend fun getPopularMovies(): NetworkMovieResponse

    @Headers(MOVIE_API_KEY)
    @GET("movie/upcoming?language=pt-BR&page=1")
    suspend fun getUpcomingMovies(): NetworkMovieResponse

    @Headers(MOVIE_API_KEY)
    @GET("movie/now_playing?language=pt-BR&page=1")
    suspend fun getNowPlayingMovies(): NetworkMovieResponse

    @Headers(MOVIE_API_KEY)
    @GET("movie/{movieId}")
    suspend fun getMovieById(@Path("movieId") id: Int): MovieDto

    @Headers(MOVIE_API_KEY)
    @GET("search/movie?include_adult=false&language=pt-BR&page=1")
    suspend fun searchMovieByQuery(@Query("query") query: String): NetworkMovieResponse

    companion object {
        const val IMAGE_URL = "https://image.tmdb.org/t/p/original"
        const val IMDB_URL = "https://www.imdb.com/title/"
    }
}