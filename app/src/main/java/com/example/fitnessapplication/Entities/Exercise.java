package com.example.fitnessapplication.Entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Exercise {


    public Exercise(String name, String description, String muscleTarget) {
        this.name = name;
        this.description = description;
        this.muscleTarget = muscleTarget;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public String getMuscleTarget() {
        return muscleTarget;
    }

    public void setMuscleTarget(String muscleTarget) {
        this.muscleTarget = muscleTarget;
    }

    @PrimaryKey(autoGenerate = true)
    private int exerciseId;
    private String name;
    private String muscleTarget;
    private String description;

    public int getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(int exerciseId) {
        this.exerciseId = exerciseId;
    }






}
