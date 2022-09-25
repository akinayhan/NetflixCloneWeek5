package com.harunkor.netflixclone.presentation.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.harunkor.netflixclone.R
import com.harunkor.netflixclone.databinding.FragmentTVShowsBinding

class TVShowsFragment : Fragment() {

    private lateinit var fragmentTVShowsBinding: FragmentTVShowsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentTVShowsBinding = FragmentTVShowsBinding.inflate(inflater)
        return fragmentTVShowsBinding.root
    }

}