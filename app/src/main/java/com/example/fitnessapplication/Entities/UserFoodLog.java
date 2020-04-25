package com.example.fitnessapplication.Entities;

import androidx.room.Entity;

import java.util.Date;

@Entity(primaryKeys = {"userId","foodId"})
public class UserFoodLog {

    private int userId;
    private int foodId;
    private Date dateOfConsumed;
    private double caloriesConsumed;

    public Date getDateOfConsumed() {
        return dateOfConsumed;
    }

    public void setDateOfConsumed(Date dateOfConsumed) {
        this.dateOfConsumed = dateOfConsumed;
    }

    public double getCaloriesConsumed() {
        return caloriesConsumed;
    }

    public void setCaloriesConsumed(double caloriesConsumed) {
        this.caloriesConsumed = caloriesConsumed;
    }




}
