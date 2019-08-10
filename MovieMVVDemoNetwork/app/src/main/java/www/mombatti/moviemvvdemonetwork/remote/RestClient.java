package www.mombatti.moviemvvdemonetwork.remote;

import android.content.Context;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import www.mombatti.moviemvvdemonetwork.database.entity.NewEntity;
import www.mombatti.moviemvvdemonetwork.remote.callbacks.GenericCallback;

public class RestClient {
    private Context context;
    private GenericCallback genericCallback;
    private static final String TAG = "RestClient";

    public RestClient(GenericCallback genericCallback, Context context) {
        this.context = context;
        this.genericCallback = genericCallback;
    }

    public void callApi(int page) {
        RestApi restApi = RestApiFactory.getClient().create(RestApi.class);
        Call<NewEntity> call = restApi.fetchAllNews(page);
        call.enqueue(new Callback<NewEntity>() {
            @Override
            public void onResponse(Call<NewEntity> call, Response<NewEntity> response) {
                Log.e(TAG, "onResponse: " + response.body().getNewEntityList().size());
            }

            @Override
            public void onFailure(Call<NewEntity> call, Throwable t) {
            }
        });
    }
}
