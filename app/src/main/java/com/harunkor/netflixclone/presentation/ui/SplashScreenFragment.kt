package com.harunkor.netflixclone.presentation.ui

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.harunkor.netflixclone.R
import com.harunkor.netflixclone.databinding.FragmentSplashScreenBinding

class SplashScreenFragment : Fragment() {

    private lateinit var fragmentSplashScreenBinding: FragmentSplashScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        fragmentSplashScreenBinding = FragmentSplashScreenBinding.inflate(inflater)
        splash()
        return fragmentSplashScreenBinding.root

        }

    fun splash(){
        Handler(Looper.myLooper()!!).postDelayed({
            findNavController().navigate(R.id.action_splashScreenFragment_to_userFragment)
        }, 5000)
    }
}