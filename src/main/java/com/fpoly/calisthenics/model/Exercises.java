package com.fpoly.calisthenics.model;

public class Exercises {

    private String name;
    private String muscleGroup;
    private String difficulty;

    public Exercises(String name, String muscleGroup, String difficulty) {
        this.name = name;
        this.muscleGroup = muscleGroup;
        this.difficulty = difficulty;
    }

    public String getName() {
        return name;
    }

    public String getMuscleGroup() {
        return muscleGroup;
    }

    public String getDifficulty() {
        return difficulty;
    }
}
