package com.dheereshagrwal.portfolio.skill;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SkillController {
    private final SkillRepository repository;

    public SkillController(SkillRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/skills")
    public Iterable<Skill> getSkills() {
        return repository.findAll();
    }
}
