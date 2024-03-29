package www.mombatti.moviemvvdemonetwork.database.entity;

import com.google.gson.annotations.SerializedName;

public class IdEntity {
    @SerializedName("name")
    private String name;


    @SerializedName("value")
    private String value;

    public IdEntity(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
