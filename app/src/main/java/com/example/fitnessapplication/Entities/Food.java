package com.example.fitnessapplication.Entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.sql.Date;
@Entity
public class Food {

    public int getFoodId() {
        return foodId;
    }

    public Food(String name, double calories, double fat, double carbohydrates, double fibre, double protein,
                double portionSize,String type) {
        this.name = name;
        this.calories = calories;
        this.fat = fat;
        this.carbohydrates = carbohydrates;
        this.fibre = fibre;
        this.protein = protein;
        this.portionSize=portionSize;
        this.type=type;

    }

    public void setFoodId(int foodId) {

        this.foodId = foodId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public double getFibre() {
        return fibre;
    }

    public void setFibre(double fibre) {
        this.fibre = fibre;
    }


    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }
@PrimaryKey(autoGenerate = true)
    private int foodId;
    private String name;
    private double calories;
    private double fat;
    private double carbohydrates;
    private double fibre;
    private double protein;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String type;

    public double getPortionSize() {
        return portionSize;
    }

    public void setPortionSize(double portionSize) {
        this.portionSize = portionSize;
    }

    private double portionSize;




}
