package com.example.fitnessapplication.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import com.example.fitnessapplication.Entities.Workout;
import com.example.fitnessapplication.Entities.userWorkoutPair;

import java.util.List;

@Dao
public interface workoutDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertWorkout(Workout workout);

    @Delete
    public void deleteWorkout(Workout workout);

    @Update
    public void updateWorkout(Workout workout);

    @Transaction
    @Query("SELECT * FROM User WHERE userId =:id")
    public List<userWorkoutPair> getUsersAndWorkouts(int id);

}
