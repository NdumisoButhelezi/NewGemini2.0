package com.example.newgemini;

public interface ResponseCallBack {

    void onResponse(String response);

    void onError(Throwable throwable);
}
