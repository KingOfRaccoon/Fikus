package com.kingofraccoon.fikus

import retrofit2.Retrofit
import retrofit2.converter.simplexml.SimpleXmlConverterFactory

object RetrofitClient {
    var retrofit : Retrofit? = null
    get(){
        if (field == null)
            field = Retrofit.Builder()
                .baseUrl("https://www.cbr.ru/scripts/")
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .build()
        return field
    }


}