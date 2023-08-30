package com.dheereshagrwal.portfolio.work;

import com.dheereshagrwal.portfolio.icon.Icon;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.Year;

@Entity
public class WorkExperience {
    private String companyName;
    private Icon companyIcon;
    private String role;
    private String duration;
    private Year startYear;
    @Id
    @GeneratedValue
    private int id;

    public String getCompanyName() {
        return companyName;
    }

    public Icon getCompanyIcon() {
        return companyIcon;
    }

    public String getRole() {
        return role;
    }

    public String getDuration() {
        return duration;
    }

    public Year getStartYear() {
        return startYear;
    }

    public int getId() {
        return id;
    }
}
