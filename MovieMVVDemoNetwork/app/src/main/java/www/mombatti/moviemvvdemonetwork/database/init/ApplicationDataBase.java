package www.mombatti.moviemvvdemonetwork.database.init;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import www.mombatti.moviemvvdemonetwork.database.entity.NewEntity;

/*

@Database(entities = { NewEntity.class }, version = 1, exportSchema = false)
public abstract class ApplicationDataBase extends RoomDatabase {
    private static final String DB_NAME = "MY_DB";
    private static ApplicationDataBase instance;

    public static synchronized ApplicationDataBase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(), ApplicationDataBase.class, DB_NAME)
                    .fallbackToDestructiveMigration()
                    //.addCallback(roomCallback)
                    .build();
        }
        return instance;
    }
*/



//}
