package com.harunkor.netflixclone.presentation.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.harunkor.netflixclone.R
import com.harunkor.netflixclone.databinding.FragmentUserBinding

class UserFragment : Fragment() {

    private lateinit var fragmentUserBinding: FragmentUserBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentUserBinding = FragmentUserBinding.inflate(inflater)
        return fragmentUserBinding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentUserBinding.apply {
            userButtonEmenalo.setOnClickListener {
                findNavController().navigate(R.id.action_userFragment_to_homeFragment)
            }
            userButtonOnyeka.setOnClickListener {
                findNavController().navigate(R.id.action_userFragment_to_homeFragment)
            }
            userButtonThelma.setOnClickListener {
                findNavController().navigate(R.id.action_userFragment_to_homeFragment)
            }
            userButtonKids.setOnClickListener {
                findNavController().navigate(R.id.action_userFragment_to_homeFragment)
            }
        }
    }

}