package com.example.fitnessapplication.Entities;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

public class userWeights {
    @Embedded private User user;
    @Relation(
            parentColumn = "userId",
            entityColumn = "weightId"
    )
    private List<Weight> weights;
}
