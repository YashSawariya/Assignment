package com.example.assignment.ui.bottomnavprofile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.assignment.R
import com.example.assignment.databinding.FragmentBottomNavProfileBinding

class BottomNavProfile : Fragment() {

    lateinit var binding:FragmentBottomNavProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentBottomNavProfileBinding.inflate(inflater, container, false)

        return binding.root
    }

}