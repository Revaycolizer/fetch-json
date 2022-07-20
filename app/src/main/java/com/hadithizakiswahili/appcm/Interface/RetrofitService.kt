package com.hadithizakiswahili.appcm.Interface

import com.hadithizakiswahili.appcm.Model.User
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitService{
    @GET ("users")
    fun getNameList(value: String): Call<MutableList<User>>
}