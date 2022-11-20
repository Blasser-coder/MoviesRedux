package com.example.moviesredux

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.entregajesuitas_recycleview.MyAdapter
import com.example.moviesredux.databinding.FragmentMoviesBinding
import data.data_source

class MoviesFragment : Fragment() {
    private lateinit var binding: FragmentMoviesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_movies, container, false)
        val myDataset = data_source().loadPelicula()
        binding.RecicleView.adapter = MyAdapter(this, myDataset)
        return binding.root
    }

}