package com.myself223.mvvm.ui.fragments.episode

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.myself223.mvvm.R
import com.myself223.mvvm.databinding.FragmentEpisodeBinding
import com.myself223.mvvm.ui.fragments.location.LocationFragment


class EpisodeFragment : Fragment() {
    private val binding:FragmentEpisodeBinding by lazy {
        FragmentEpisodeBinding.inflate(layoutInflater)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root
    }
    companion object{
        @JvmStatic
        fun newInstance()=EpisodeFragment
    }

}