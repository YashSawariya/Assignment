package com.example.assignment.ui.logout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.assignment.R
import com.example.assignment.databinding.FragmentLogoutBinding

class LogoutFragment : Fragment() {

    lateinit var binding:FragmentLogoutBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
         binding=FragmentLogoutBinding.inflate(inflater, container, false)

        return binding.root
    }

}