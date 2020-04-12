package com.example.fitnessapplication.Entities;

import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Relation;

import java.util.List;
@Entity(primaryKeys = "exerciseId, workoutId")
public class WorkoutExercises {
    private int exerciseId;
    private int workoutId;

}
