package com.example.fitnessapplication.Entities;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import java.util.List;

public class userWorkoutPair {
    @Embedded public Workout workout;
    @Relation(
            parentColumn = "userId",
            entityColumn = "workoutId",
            associateBy = @Junction(UserWorkouts.class)
    )
       public List<Workout>workouts;

}
