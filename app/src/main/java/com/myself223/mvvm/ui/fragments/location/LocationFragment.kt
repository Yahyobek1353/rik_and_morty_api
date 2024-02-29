package com.myself223.mvvm.ui.fragments.location

import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.myself223.mvvm.R
import com.myself223.mvvm.databinding.FragmentLocationBinding

class LocationFragment : Fragment() {
    private val binding:FragmentLocationBinding by lazy {
        FragmentLocationBinding.inflate(layoutInflater)
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
        fun newInstance()= LocationFragment
    }

}