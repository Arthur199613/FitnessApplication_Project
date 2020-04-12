package com.example.fitnessapplication.Entities;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import java.util.List;

public class WorkoutExercisePair {
    @Embedded public Workout workout;
    @Relation(
            parentColumn = "workoutId",
            entityColumn = "exerciseId",
            associateBy = @Junction(WorkoutExercises.class)
    )
    List<Exercise>exercises;
}
