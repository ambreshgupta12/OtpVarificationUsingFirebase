package www.mombatti.moviemvvdemonetwork.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import www.mombatti.moviemvvdemonetwork.R;
import www.mombatti.moviemvvdemonetwork.database.entity.NewEntity;
import www.mombatti.moviemvvdemonetwork.remote.RestClient;
import www.mombatti.moviemvvdemonetwork.remote.callbacks.GenericCallback;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       new RestClient(new GenericCallback() {
           @Override
           public void failure(Object msg) {

           }

           @Override
           public void success(Object obj) {
               NewEntity newEntity=(NewEntity)obj;
               Log.d(TAG, "success: "+newEntity.getNewEntityList().size());

           }
       },MainActivity.this).callApi(10);
    }
}