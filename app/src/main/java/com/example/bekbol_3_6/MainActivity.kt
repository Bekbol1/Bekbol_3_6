package com.example.bekbol_3_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.manager.SupportRequestManagerFragment
import com.example.bekbol_3_6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.poster_Fragment,PosterAlbum()).commit()
        supportFragmentManager.beginTransaction().add(R.id.music_container,SongsOfAlbum()).commit()

    }


}