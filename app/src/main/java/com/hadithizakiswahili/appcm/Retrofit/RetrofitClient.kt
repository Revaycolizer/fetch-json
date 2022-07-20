package com.hadithizakiswahili.appcm.Retrofit

import retrofit2.Retrofit

object RetrofitClient {
    private var retrofit : Retrofit? = null

    fun getClient(baseUrl : String) : Retrofit {
        if (retrofit ==null)(
                retrofit = Retrofit.Builder()
                    .baseUrl (baseUrl)
                    .addConverrterFactory(GaonConverterFactory.create() )
                    .build()
    }
    return retrofit !!
}
}