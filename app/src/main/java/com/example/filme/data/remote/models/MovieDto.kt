package com.example.filme.data.remote.models

import com.example.filme.domain.model.Movie
import com.google.gson.annotations.SerializedName


data class NetworkMovieResponse(
    val page: Int,
    val results: List<MovieDto>,
)

data class MovieDto(
    val adult: Boolean ,
    @SerializedName("backdrop_path")
    val backdropPath: String?,
    val id: Int ,
    @SerializedName("imdb_id")
    val imdbId: String,
    @SerializedName("original_title")
    val title: String,
    val overview: String ,
    @SerializedName("poster_path")
    val posterPath: String?,
    @SerializedName("release_date")
    val releaseDate: String ,
    val runtime: Int ,
    val status: String? ,
    val video: Boolean ,
    @SerializedName("vote_average")
    val voteAverage: Double ,
    @SerializedName("vote_count")
    val voteCount: Int
)

fun MovieDto.asDomain() = Movie(
    adult ,
    backdropPath ?: "unknown" ,
    id ,
    imdbId,
    title,
    overview,
    posterPath ?: "unknown" ,
    releaseDate,
    runtime,
    status ?: "null",
    voteAverage ,
    voteCount
)
