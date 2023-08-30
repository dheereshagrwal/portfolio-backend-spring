package com.dheereshagrwal.portfolio.project;


import com.dheereshagrwal.portfolio.tech.TechStack;
import jakarta.persistence.*;
import org.hibernate.validator.constraints.URL;

import java.util.List;


@Entity public class Project {
    @Id private String name;
    @URL private String imageUri;

    private String description;

    @URL private String githubLink;
    @URL private String liveLink;

    @ManyToMany private List<TechStack> techStacks;

    public List<TechStack> getTechStacks() {
        return techStacks;
    }
   public String getGithubLink() {
        return githubLink;
    }

    public String getLiveLink() {
        return liveLink;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    public String getImageUri() {
        return imageUri;
    }
}
