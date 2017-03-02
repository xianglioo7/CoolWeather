package com.xiangli.coolweather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Administrator on 2017/2/23.
 */

public interface RequestSerice {
   @POST("add/index.html")
   @GET("WWW")
   Call<User> getName(@Path("NAME")String userName);
    Call<String> getString(@Query("userName")String userName,@Query("password")String password);
}
