package com.example.bekbol_3_6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bekbol_3_6.databinding.FragmentInfoSongBinding

private lateinit var binding: FragmentInfoSongBinding
private lateinit var dataFromMainFragment: Song
class InfoSong : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentInfoSongBinding.inflate(layoutInflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataFromMainFragment = arguments?.getSerializable("key") as Song
        binding.apply {
            nameSongs.text = dataFromMainFragment.nameSong
            timeSong.text = dataFromMainFragment.timeSong
            poryadok.text = dataFromMainFragment.orderSong }
        }
    }

