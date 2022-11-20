package com.example.moviesredux

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.moviesredux.databinding.FragmentInnitialBinding

class InnitialFragment : Fragment() {

    private lateinit var binding: FragmentInnitialBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_innitial, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val btn = binding.buttonWelcome
        btn.setOnClickListener{
            this.findNavController().navigate(R.id.action_innitialFragment_to_moviesFragment)
        }
    }
}