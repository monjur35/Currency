package com.example.currency;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

public class ViewModelss extends AndroidViewModel {

    public Repository repository;
    public ApiService apiInterface;
    public ViewModelss(@NonNull Application application) {
        super(application);
        apiInterface = RetrofitService.Companion.abc();
        repository = new Repository(apiInterface);


    }

    public MutableLiveData<Response>getData(){
        return repository.fetch();
    }
}
