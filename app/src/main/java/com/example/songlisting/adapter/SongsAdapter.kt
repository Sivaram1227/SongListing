package com.example.songlisting.adapter

import android.content.Context
import android.media.Image
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.songlisting.R
import com.example.songlisting.model.SongsResponse

class SongsAdapter(val songsList : List<SongsResponse.Featured>, val context: Context ,val imagePath : String):RecyclerView.Adapter<SongsAdapter.MyViewHolder>()
{

    class MyViewHolder(view : View): RecyclerView.ViewHolder(view) {
        var songImage : ImageView = view.findViewById(R.id.songImage)
        var songTitle : TextView = view.findViewById(R.id.songTitle)
        var songDescription : TextView = view.findViewById(R.id.songDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.songs_item,parent,false)
        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
       return  songsList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.songTitle.text = songsList[position].channelName
        holder.songDescription.text = songsList[position].description
        val imageUrl = imagePath+songsList[position].logo
      //  Log.e("Image Name","------->"+imageUrl)

        Glide.with(context).load(imageUrl).into(holder.songImage)
    }

}