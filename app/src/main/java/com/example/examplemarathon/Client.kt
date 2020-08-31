package com.example.examplemarathon

import okhttp3.OkHttpClient
import okhttp3.Request
//Singleton class
object Client {
//    creating the client
    private val okHttpClient = OkHttpClient()

    // getting the url
    private val request =  Request.Builder()
        .url("https://api.covid19india.org/data.json")
        .build()
    // Calling the api
    val api = okHttpClient.newCall(request)
}