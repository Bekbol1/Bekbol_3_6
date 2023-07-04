package com.example.bekbol_3_6

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.bekbol_3_6.databinding.ItemSongsBinding

class SongAdapter(
    val list: ArrayList<Song>, val onClick: (position:Int)->Unit
) : Adapter<SongAdapter.ViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    return ViewHolder(ItemSongsBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.bind()
    }



    inner class ViewHolder(private val binding: ItemSongsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            val item = list [adapterPosition]

            binding.poryadok.text = item.orderSong
            binding.nameSongs.text = item.nameSong
            binding.timeSong.text = item.timeSong

            itemView.setOnClickListener { onClick(adapterPosition) }
        }

    }
}