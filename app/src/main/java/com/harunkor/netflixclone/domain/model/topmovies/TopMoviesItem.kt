package com.harunkor.netflixclone.domain.model.topmovies


import com.google.gson.annotations.SerializedName

data class TopMoviesItem(
    @SerializedName("crew")
    val crew: String,
    @SerializedName("fullTitle")
    val fullTitle: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("imDbRating")
    val imDbRating: String,
    @SerializedName("imDbRatingCount")
    val imDbRatingCount: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("rank")
    val rank: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("year")
    val year: String
)