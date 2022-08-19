package com.example.assignment.ui.posts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.assignment.databinding.FragmentPostsBinding

class PostsFragment : Fragment() {

    private var _binding: FragmentPostsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        _binding = FragmentPostsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.textPosts.setText("Fragment Posts")

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}