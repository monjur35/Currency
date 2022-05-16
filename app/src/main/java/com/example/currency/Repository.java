package com.example.currency;
import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import retrofit2.Call;
import retrofit2.Callback;

public class Repository {

    public Repository(ApiService apiService) {
        this.apiService = apiService;
    }

    ApiService apiService=RetrofitService.Companion.abc();
    public MutableLiveData<Response> fetch(){
        MutableLiveData<Response> responseMutableLiveData=new MutableLiveData<>();
        apiService.callApi().enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                if (response.isSuccessful()){
                    responseMutableLiveData.postValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {
                Log.e("TAG", "onFailure: Repository::" + t.getLocalizedMessage());
            }
        });
        return responseMutableLiveData;
    }
}