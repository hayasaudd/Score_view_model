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

        binding.addone.setOnClickListenir()
        score++

    }

    fun subtow(){
        binding.subtow.setOnClickListenir()
        score = score -2
    }

    fun addfour(){
        binding.addfour.setOnClickListenir()
        score = score +4
    }





}