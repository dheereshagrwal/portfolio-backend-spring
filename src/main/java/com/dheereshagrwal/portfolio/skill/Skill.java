package com.dheereshagrwal.portfolio.skill;

import com.dheereshagrwal.portfolio.icon.Icon;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;




@Entity
public class Skill {
    @Id
    private String name;
    private Icon icon;
    public String getName() {
        return name;
    }

    public Icon getIcon() {
        return icon;
    }

}
