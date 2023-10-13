package com.titoportas.pokemonapp.services.networking

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

private const val BASE_URL = "https://pokeapi.co/api/v2/"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

object PokemonApi {

    val pokemonService: PokemonService by lazy {
        retrofit.create(PokemonService::class.java)
    }
}