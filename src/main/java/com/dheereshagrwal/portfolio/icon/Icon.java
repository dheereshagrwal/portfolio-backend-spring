package com.dheereshagrwal.portfolio.icon;

import jakarta.persistence.Embeddable;

@Embeddable
public class Icon {
    private String iconName;
    private String iconStyle;

    public String getIconName() {
        return iconName;
    }

    public String getIconStyle() {
        return iconStyle;
    }
}