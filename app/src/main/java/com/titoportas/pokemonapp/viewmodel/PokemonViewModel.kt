package com.titoportas.pokemonapp.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.titoportas.pokemonapp.services.networking.PokemonApi
import kotlinx.coroutines.launch

class PokemonViewModel: ViewModel() {

    private var _status: MutableLiveData<String> = MutableLiveData("")
    val status: LiveData<String> = _status
    fun getPokemonList() {
        viewModelScope.launch {
            try {
                val listResult = PokemonApi.pokemonService.getPokemons()
                _status.value = listResult.toString()
            } catch (e: Exception) {
                Log.e("Pokemon", e.message!!)
            }

        }
    }
}