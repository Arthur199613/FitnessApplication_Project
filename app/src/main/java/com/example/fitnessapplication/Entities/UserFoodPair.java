package com.example.fitnessapplication.Entities;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import java.util.List;

public class UserFoodPair {
    @Embedded private User user;
    @Relation(
            parentColumn = "userId",
            entityColumn = "foodId",
            associateBy = @Junction(UserFoodLog.class)
    )
    public List<Food>foods;
}
