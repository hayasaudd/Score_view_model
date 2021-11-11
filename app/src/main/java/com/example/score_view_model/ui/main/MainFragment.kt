package com.example.score_view_model.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import com.example.score_view_model.R
import androidx.fragment.app.viewModels

class MainFragment : Fragment() {
 private val viewmodel1 : MainViewModel by viewModels()
    private lateinit var binding: MainFragment
    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       // binding = MainFragment.inflater.inflate(R.layout.main_fragment, container, false)
        return inflater.inflate(R.layout.main_fragment, container, false)
       // return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
    }




}