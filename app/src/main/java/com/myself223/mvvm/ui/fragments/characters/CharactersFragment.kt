package com.myself223.mvvm.ui.fragments.characters

import android.os.Bundle
import android.renderscript.ScriptGroup
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.myself223.mvvm.R
import com.myself223.mvvm.core.BaseFragment
import com.myself223.mvvm.databinding.FragmentCharactersBinding
import com.myself223.mvvm.ui.fragments.location.LocationFragment


class CharactersFragment : BaseFragment<FragmentCharactersBinding>() {


    override fun getViewBinding() = FragmentCharactersBinding.inflate(layoutInflater)
    companion object{
        @JvmStatic
        fun newInstance()= CharactersFragment
    }

}
