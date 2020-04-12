package com.example.fitnessapplication.Entities;

import androidx.room.Entity;

import java.util.Date;

@Entity(primaryKeys = {"workoutId","userId"})
public class UserWorkouts {

    private int userId;
    private int workoutId;

    public int getWorkoutId() {
        return workoutId;
    }

    public void setWorkoutId(int workoutId) {
        this.workoutId = workoutId;
    }

    public Date getWorkoutCompletionDate() {
        return workoutCompletionDate;
    }

    public void setWorkoutCompletionDate(Date workoutCompletionDate) {
        this.workoutCompletionDate = workoutCompletionDate;
    }

    private Date workoutCompletionDate;

}
