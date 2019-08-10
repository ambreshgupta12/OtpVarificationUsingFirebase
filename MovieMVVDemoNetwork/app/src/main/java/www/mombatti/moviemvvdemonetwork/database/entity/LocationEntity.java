package www.mombatti.moviemvvdemonetwork.database.entity;

import com.google.gson.annotations.SerializedName;

public class LocationEntity {
    @SerializedName("street")
    private String street;
    @SerializedName("city")
    private String city;
    @SerializedName("state")
    private String state;
    @SerializedName("postcode")
    private int postcode;

    @SerializedName("coordinates")
    private CoordinatesEntity coordinatesEntity;

    @SerializedName("timezone")
    private TimezoneEntity timezoneEntity;

    public LocationEntity(String street, String city, String state, int postcode, CoordinatesEntity coordinatesEntity, TimezoneEntity timezoneEntity) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postcode = postcode;
        this.coordinatesEntity = coordinatesEntity;
        this.timezoneEntity = timezoneEntity;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public CoordinatesEntity getCoordinatesEntity() {
        return coordinatesEntity;
    }

    public void setCoordinatesEntity(CoordinatesEntity coordinatesEntity) {
        this.coordinatesEntity = coordinatesEntity;
    }

    public TimezoneEntity getTimezoneEntity() {
        return timezoneEntity;
    }

    public void setTimezoneEntity(TimezoneEntity timezoneEntity) {
        this.timezoneEntity = timezoneEntity;
    }
}
