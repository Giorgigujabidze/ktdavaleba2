package com.example.mobileapplication32.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.mobileapplication32.adapters.VpAdapter
import com.example.mobileapplication32.databinding.FragmentHomeBinding
import com.example.mobileapplication32.home.homeFragments.HomeMainFragment
import com.example.mobileapplication32.home.homeFragments.ReelsFragment

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewPager()
    }

    private fun setupViewPager() {
        val homeMainFragment = HomeMainFragment()
        val reelsFragment = ReelsFragment()

        val fragments = listOf(homeMainFragment, reelsFragment)

        binding.viewPager.apply {
            adapter = VpAdapter(requireActivity(), fragments)
            orientation = ViewPager2.ORIENTATION_HORIZONTAL
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}