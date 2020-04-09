package com.inspirecoding.guessinggame.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController

import com.inspirecoding.guessinggame.R
import com.inspirecoding.guessinggame.databinding.FragmentGameBinding

class GameFragment : Fragment()
{
    private lateinit var binding: FragmentGameBinding

    override fun onCreateView(layoutInflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_game, container, false)
        binding.lifecycleOwner = this

        binding.tvPlayer.setOnClickListener {
            showDialog(it)
        }
        binding.ivChangePlayer.setOnClickListener {
            showDialog(it)
        }

        return binding.root
    }

    fun showDialog(view: View)
    {
        view.findNavController().navigate(R.id.action_gameFragment_to_changePlayerDialogFragment)
    }
}
