package com.fpoly.calisthenics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fpoly.calisthenics.service.ExerciseService;

@Controller
public class ExerciseController {

	private final ExerciseService exerciseService;

	public ExerciseController(ExerciseService exerciseService) {
		this.exerciseService = exerciseService;
	}

	@GetMapping("/exercises")
	public String exercises(Model model) {

		model.addAttribute("exercises", exerciseService.getAllExercises());

		return "exercises.html";
	}
}
