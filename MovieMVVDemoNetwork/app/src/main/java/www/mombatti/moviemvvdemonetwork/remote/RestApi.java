package www.mombatti.moviemvvdemonetwork.remote;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import www.mombatti.moviemvvdemonetwork.database.entity.NewEntity;
public interface RestApi {
    @GET("api/")
    Call<NewEntity> fetchAllNews(
            @Query("results") int  page);

}
