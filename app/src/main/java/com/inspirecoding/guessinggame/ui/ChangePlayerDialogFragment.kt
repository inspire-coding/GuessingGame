package com.inspirecoding.guessinggame.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

import com.inspirecoding.guessinggame.R
import com.inspirecoding.guessinggame.databinding.FragmentChangePlayerDialogBinding

class ChangePlayerDialogFragment : BottomSheetDialogFragment()
{
    private lateinit var binding: FragmentChangePlayerDialogBinding

    override fun onCreateView(layoutInflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_change_player_dialog, container, false)
        binding.lifecycleOwner = this

        binding.btnDialogClose.setOnClickListener {
            dismiss()
        }

        return binding.root
    }
}
