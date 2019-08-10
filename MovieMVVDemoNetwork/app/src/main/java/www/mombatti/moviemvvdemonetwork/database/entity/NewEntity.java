package www.mombatti.moviemvvdemonetwork.database.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

import java.util.List;
/*
@Entity(tableName = "NEW_TABLE")
*/
public class NewEntity {
   /* @PrimaryKey(autoGenerate = true)
    private  int id;*/
    @SerializedName("results")
    List<ResultEntity> newEntityList;
    public NewEntity(List<ResultEntity> newEntityList) {
        this.newEntityList = newEntityList;
    }

    public List<ResultEntity> getNewEntityList() {
        return newEntityList;
    }

    public void setNewEntityList(List<ResultEntity> newEntityList) {
        this.newEntityList = newEntityList;
    }

   /* public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }*/
}
