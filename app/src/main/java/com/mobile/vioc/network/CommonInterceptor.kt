package com.mobile.vioc.network

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class CommonInterceptor(private val customHeaders: Map<String, String>) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        // Get the original request from the chain
        val originalRequest: Request = chain.request()

        // Modify the request if needed
        val modifiedRequest = originalRequest.newBuilder().apply {
            // Add custom headers from the map
            for ((headerName, headerValue) in customHeaders) {
                addHeader(headerName, headerValue)
            }
        }.build()

        // Proceed with the modified request
        val response = chain.proceed(modifiedRequest)

        // You can also modify the response if needed
        // val modifiedResponse = response.newBuilder()...

        return response // Return the modified or original response
    }
}