package www.mombatti.moviemvvdemonetwork.database.entity;

import com.google.gson.annotations.SerializedName;

public class RegisteredEntity {
    @SerializedName("date")
    private String date;

    @SerializedName("age")
    private int age;

    public RegisteredEntity(String date, int age) {
        this.date = date;
        this.age = age;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
