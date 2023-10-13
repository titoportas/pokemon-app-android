package com.titoportas.pokemonapp.services.model

data class Pagination<T>(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<T>
)

data class Pokemon(
    val name: String,
    val url: String
)