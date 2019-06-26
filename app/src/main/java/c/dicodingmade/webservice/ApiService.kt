package c.dicodingmade.webservice

import c.dicodingmade.model.MovieData
import c.dicodingmade.model.TvShowData
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("discover/movie")
    suspend fun getMovieList(
        @Query("api_key") apiKey: String,
        @Query("language") language: String
    ): Response<MovieData>

    @GET("discover/tv")
    suspend fun getTvShowList(
        @Query("api_key") apiKey: String,
        @Query("language") language: String
    ): Response<TvShowData>
}