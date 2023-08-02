package com.example.test2

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "306768c1e6549ed7dc24e5c3c8469705",
        @Query("page") page: Int
    ): Call<GetMovieResponse>

}