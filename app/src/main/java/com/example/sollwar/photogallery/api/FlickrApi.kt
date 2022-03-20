package com.example.sollwar.photogallery.api
import retrofit2.Call
import retrofit2.http.GET

/**
 * Интерфейс Retrofit
 */
interface FlickrApi {
    @GET("/")
    fun fetchContents(): Call<String>

    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=7e2d2d39488248226b2bcd7058868002" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    fun fetchPhotos(): Call<FlickrResponse>
}