package com.example.neusoftfood_17110100219gcy.listener;

public interface RetrofitListener<T> {
    public void onSuccess(T t, int flag);
    public void onFail();
}

