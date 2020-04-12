package com.example.fitnessapplication.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.fitnessapplication.Entities.User;

@Dao
public interface userDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertUsers(User...users);

    @Update
    public void updateUsers(User...users);

    @Delete
    public void deleteUser(User user);

    @Query("DELETE FROM user")
    void deleteAllUsers();
}
