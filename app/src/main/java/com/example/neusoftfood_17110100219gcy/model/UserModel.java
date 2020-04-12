package com.example.neusoftfood_17110100219gcy.model;


import com.example.neusoftfood_17110100219gcy.beans.UserBean;
import com.example.neusoftfood_17110100219gcy.listener.RetrofitListener;
import com.example.neusoftfood_17110100219gcy.service.UserService;

import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.neusoftfood_17110100219gcy.common.Constants.BASE_URL;

public class UserModel
{
    private UserService service;
    private Retrofit retrofit;
    public UserModel() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        service = retrofit.create(UserService.class);
    }
    public void userLogin(String username, String password, final RetrofitListener listener) {
        retrofit2.Call call=service.login(username,password);
        Callback<UserBean> callback = new Callback<UserBean>() {
            @Override
            public void onResponse(retrofit2.Call<UserBean> call, Response<UserBean> response) {
                listener.onSuccess(response.body(),1);
            }
            @Override
            public void onFailure(retrofit2.Call<UserBean> call, Throwable t) {
                listener.onFail();
            }
        };
        call.enqueue(callback);
    }
}
