package com.example.pokeapp.api.model

import com.example.pokeapp.domain.Pokemon
import com.example.pokeapp.domain.PokemonType

data class PokemonsApiResult(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<PokemonResult>
)

data class PokemonResult (
    val name: String,
    val url: String
)

data class PokemonApiResult (
    val id: Int,
    val name: String,
    val types: List<PokemonTypeSlot>
)
data class PokemonTypeSlot(
    val slot: Int,
    val type: PokemonType
)


