package com.example.fitnessapplication.DAO;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import com.example.fitnessapplication.Entities.Food;
import com.example.fitnessapplication.Entities.User;
import com.example.fitnessapplication.Entities.UserFoodPair;

import java.util.List;

public interface foodDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void addFood(Food food);

    @Delete
    public void deleteFood(Food food);

    @Update
    public void updateFood(Food food);

    @Transaction
    @Query("SELECT * FROM User WHERE userId =:id")
    public List<UserFoodPair> getUsersAndFoods(int id);

}
