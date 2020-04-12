package com.example.fitnessapplication.Entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Workout {

    public Workout(String name, int duration, String description, String workoutType) {
        this.name = name;
        this.duration = duration;
        this.description = description;
        this.workoutType = workoutType;
    }


    public int getWorkoutId() {
        return workoutId;
    }

    public void setWorkoutId(int workoutId) {
        this.workoutId = workoutId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWorkoutType() {
        return workoutType;
    }

    public void setWorkoutType(String workoutType) {
        this.workoutType = workoutType;
    }
    @PrimaryKey(autoGenerate = true)
    private int workoutId;

    private String name;
    private int duration;
    private String description;
    private String workoutType;

}
