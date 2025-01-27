package com.srchezz.androidmaster.superheroapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("/api/8753243fdf3b34adf28fcdded1741dd1/search/{name}")
    suspend fun getSuperheroes(@Path("name") superheroName:String): Response<SuperHeroDataResponse>

    @GET("/api/8753243fdf3b34adf28fcdded1741dd1/{id}")
    suspend fun getSuperheroDetail (@Path("id") superheroId:String): Response<SuperheroDetailResponse>
}