package com.dheereshagrwal.portfolio.work;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController public class WorkExperienceController {
    private final WorkExperienceRepository repository;

    public WorkExperienceController(WorkExperienceRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/works")
    public Iterable<WorkExperience> getWorks() {
        return repository.findAll();
    }

}
