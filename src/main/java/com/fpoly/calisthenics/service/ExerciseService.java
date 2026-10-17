package com.fpoly.calisthenics.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fpoly.calisthenics.model.Exercises;

@Service
public class ExerciseService {

    public List<Exercises> getAllExercises() {

        List<Exercises> exercises = new ArrayList<>();

        exercises.add(new Exercises("Push-up","Ngực, vai và tay sau","Cơ bản"));

        exercises.add(new Exercises("Pull-up","Lưng và tay trước","Trung bình"));

        exercises.add(new Exercises("Squat","Đùi và mông","Cơ bản"));

        exercises.add(new Exercises("Dips","Ngực và tay sau","Trung bình"));
        
        exercises.add(new Exercises("plank","bụng core","Cơ bản"));
        
        return exercises;
    }
}
