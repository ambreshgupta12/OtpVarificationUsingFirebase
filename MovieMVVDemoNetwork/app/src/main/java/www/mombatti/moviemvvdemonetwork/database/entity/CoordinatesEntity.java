package www.mombatti.moviemvvdemonetwork.database.entity;

import com.google.gson.annotations.SerializedName;

public class CoordinatesEntity {
    @SerializedName("latitude")
    private String latitude;


    @SerializedName("longitude")
    private String longitude;

    public CoordinatesEntity(String latitude, String longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
