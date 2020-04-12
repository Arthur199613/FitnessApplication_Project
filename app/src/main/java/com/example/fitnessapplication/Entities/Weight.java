package com.example.fitnessapplication.Entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Weight {

    @PrimaryKey(autoGenerate = true)
    int weightId;

    public Weight(double weight, double weightGoal, double calorieGoal, double height) {
        this.weight = weight;
        this.weightGoal = weightGoal;
        this.calorieGoal = calorieGoal;
        this.height = height;
    }

    public int getWeightId() {
        return weightId;
    }

    public void setWeightId(int weightId) {
        this.weightId = weightId;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeightGoal() {
        return weightGoal;
    }

    public void setWeightGoal(double weightGoal) {
        this.weightGoal = weightGoal;
    }

    public double getCalorieGoal() {
        return calorieGoal;
    }

    public void setCalorieGoal(double calorieGoal) {
        this.calorieGoal = calorieGoal;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    double weight;
    double weightGoal;
    double calorieGoal;
    double height;

}
