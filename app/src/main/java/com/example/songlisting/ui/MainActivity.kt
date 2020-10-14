package com.example.songlisting.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.songlisting.R
import com.example.songlisting.adapter.SongsAdapter
import com.example.songlisting.listeners.SongsListeners
import com.example.songlisting.presenter.SongsPresenter

class MainActivity : AppCompatActivity(),SongsListeners {

    var songsRecyclerView : RecyclerView ? = null
    var songsPresenter : SongsPresenter ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        songsRecyclerView = findViewById(R.id.recyclerView)
        songsPresenter = SongsPresenter(this,this)
        songsPresenter!!.getSongsList()
    }

    override fun getSongs(adapter: SongsAdapter?) {
        songsRecyclerView!!.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        songsRecyclerView!!.adapter = adapter
    }


}