package com.hadithizakiswahili.appcm

import android.content.res.Resources
import retrofit2.Call

class APIService2Impl : APIService2 {
    override val position: Any
        get() = TODO("Not yet implemented")

    override fun getAllData(): Call<List<Property>> {
        return when(position){
            0 -> { getAllData() }
            1 -> { getAllData() }
            2 -> {getAllData() }
            else -> { throw Resources.NotFoundException("Position Not Found") }

        }
    }
}