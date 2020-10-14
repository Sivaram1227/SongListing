package com.example.songlisting.presenter

import android.content.Context
import android.util.Log
import com.example.songlisting.adapter.SongsAdapter
import com.example.songlisting.listeners.SongsListeners
import com.example.songlisting.model.SongsResponse
import com.example.songlisting.network.ApiClient
import com.example.songlisting.network.ApiInterface
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SongsPresenter(val context: Context,val songsListeners: SongsListeners)
{

    var songsList : List<SongsResponse.Featured> = ArrayList()


    fun getSongsList()
    {
        val apiCall : ApiInterface = ApiClient.client!!.create(ApiInterface::class.java)

        val jsonObject = JsonObject()
        jsonObject.addProperty("app_type","app1")
        jsonObject.addProperty("channel_type","radio")
        jsonObject.addProperty("language_id","")
        jsonObject.addProperty("tag","")
        jsonObject.addProperty("user_id","")


        apiCall.getSongList(jsonObject).enqueue(object : Callback<SongsResponse>
        {
            override fun onFailure(call: Call<SongsResponse>?, t: Throwable?) {
                Log.e("Error in SongList","---------------->"+t!!.localizedMessage)
            }

            override fun onResponse(
                call: Call<SongsResponse>?,
                response: Response<SongsResponse>?
            ) {
                if(response!!.isSuccessful)
                {
                    if(response.body().message.equals("success"))
                    {
                        songsList = response.body().data.featured
                        val adapter = SongsAdapter(songsList,context,response.body().data.imagePath)
                        songsListeners.getSongs(adapter)
                    }
                }
            }

        })
    }

}