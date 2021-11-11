package com.example.score_view_model.ui.main

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private var _score = 0
    val score : Int
        get() = _score

    /*

    private fun ubdatescore() {
        binding.
    } */

    //functions calcoulate
    fun addone(){


        score++

    }

    fun subtow(){

        score = score -2
    }

    fun addfour(){

        score = score +4
    }





}