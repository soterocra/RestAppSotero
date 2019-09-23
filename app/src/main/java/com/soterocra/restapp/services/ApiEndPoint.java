package com.soterocra.restapp.services;

import java.util.List;

import com.soterocra.restapp.entities.Post;
import com.soterocra.restapp.entities.User;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiEndPoint {
    @GET("users")
    Call<List<User>> obterUsuarios();

    @POST("posts")
    Call<Post> createPost(@Body Post post);
}
