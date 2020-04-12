package com.example.neusoftfood_17110100219gcy.service;


import com.example.neusoftfood_17110100219gcy.beans.Result;
import com.example.neusoftfood_17110100219gcy.beans.UserBean;
import com.example.neusoftfood_17110100219gcy.beans.UserInfo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface UserService {
        @GET("userLogin.do")
        Call<UserBean> login(
                @Query("username") String username,
                @Query("userpass") String userpass
        );
    @GET("userRegister.do")
    Call<Result> register(
            @Query("username") String username,
            @Query("userpass") String userpass,
            @Query("mobilenum") String mobilenum,
            @Query("address") String address,
            @Query("comment") String comment
    );
}
