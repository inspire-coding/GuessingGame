package com.inspirecoding.guessinggame.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.navGraphViewModels
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

import com.inspirecoding.guessinggame.R
import com.inspirecoding.guessinggame.databinding.FragmentChangePlayerDialogBinding
import com.inspirecoding.guessinggame.viewmodel.PlayerViewModel

class ChangePlayerDialogFragment : BottomSheetDialogFragment()
{
    private lateinit var binding: FragmentChangePlayerDialogBinding
    private val playerViewModel by navGraphViewModels<PlayerViewModel>(R.id.navigation_graph)

    override fun onCreateView(layoutInflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_change_player_dialog, container, false)
        binding.lifecycleOwner = this
        binding.playerViewModel = playerViewModel

        binding.btnDialogClose.setOnClickListener {
            dismiss()
        }

        return binding.root
    }
}
