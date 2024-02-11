package com.mobile.vioc.network

import com.mobile.vioc.utils.Constants.BASE_URL
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkAPIservice {
    operator fun invoke(): NetworkAPI {
        val commonInterceptor = CommonInterceptor(mapOf("Authorization" to "Bearer token123"))

        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(commonInterceptor)
            // Add other interceptors or configurations as needed
            .build()

        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(NetworkAPI::class.java)

    }

}