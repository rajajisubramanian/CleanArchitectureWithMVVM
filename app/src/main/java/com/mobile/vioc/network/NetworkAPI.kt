package com.mobile.vioc.network;

import com.mobile.vioc.data.model.response.SignupResponseModel
import okhttp3.Response
import retrofit2.http.POST

interface NetworkAPI {
    @POST
    ("<<requestMethodName>>")
    suspend fun signupRequest(): ApiResponse<SignupResponseModel>
}
