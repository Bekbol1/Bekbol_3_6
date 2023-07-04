package com.example.bekbol_3_6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.bekbol_3_6.databinding.FragmentSongsOfAlbumBinding

class SongsOfAlbum : Fragment() {

    private lateinit var binding: FragmentSongsOfAlbumBinding
    private var resultFragment:InfoSong = InfoSong()
    private var bundle:Bundle = Bundle()
    private val songList = arrayListOf(Song("Shoot To Thrill","5:18","1"),
        Song("Givin The Dog A Bone", "3:32", "2"),
        Song("Shake A Leg","4:05","3"),
        Song("Let Me Put My Love into You","4:15","4"),
    Song("What Do You Do For Honey", "3:35","5"),
        Song("Hells Bells","5:12","6"),
        Song("Rock and Roll Ain t Noise", "4:14","7"),
        Song("You Shook Me All Night","3:30","8"),
        Song("Back In Black","4:16","9"),
        Song("Highway to Hell", "4:45","10")
        )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
    binding = FragmentSongsOfAlbumBinding.inflate(layoutInflater)
    return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = SongAdapter(songList, this::onClick)
        binding.rvSongs.adapter = adapter
    }

    private fun onClick(position:Int){
        bundle.putSerializable("key",songList[position])
        resultFragment.arguments = bundle
        requireActivity().supportFragmentManager.beginTransaction().replace(R.id.container,resultFragment).addToBackStack(null).commit()
    }

}