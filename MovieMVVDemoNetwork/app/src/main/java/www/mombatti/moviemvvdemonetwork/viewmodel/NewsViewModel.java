package www.mombatti.moviemvvdemonetwork.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.support.annotation.NonNull;

import www.mombatti.moviemvvdemonetwork.database.entity.NewEntity;
import www.mombatti.moviemvvdemonetwork.remote.RestApiFactory;

public class NewsViewModel extends AndroidViewModel {
         private MutableLiveData<NewEntity> entityMutableLiveData;
         private Context context;
     public NewsViewModel(@NonNull Application application) {
         super(application);




     }


 }
