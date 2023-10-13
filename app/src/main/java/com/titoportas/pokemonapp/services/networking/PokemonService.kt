package com.titoportas.pokemonapp.services.networking

import com.titoportas.pokemonapp.services.model.Pagination
import com.titoportas.pokemonapp.services.model.Pokemon
import retrofit2.http.GET


interface PokemonService {
    @GET("pokemon")
    suspend fun getPokemons(): Pagination<Pokemon>
}