package com.example.mobileapplication32.home.homeFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mobileapplication32.databinding.FragmentReelsBinding

class ReelsFragment : Fragment() {
    private lateinit var binding: FragmentReelsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentReelsBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {
        fun newInstance() = ReelsFragment()
    }
}