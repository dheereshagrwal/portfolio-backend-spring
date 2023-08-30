package com.dheereshagrwal.portfolio.project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
    private final ProjectRepository repository;

    public ProjectController(ProjectRepository repository) {
        this.repository = repository;
    }
    @GetMapping("/projects")
    public Iterable<Project> getProjects() {
        return repository.findAll();
    }
}
