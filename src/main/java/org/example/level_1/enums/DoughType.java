package org.example.level_1.enums;

public enum DoughType {
    STUFFED_CRUST("Bordes rellenos de queso"),
    CRUSTY("Crujiente"),
    THIN("Fina");

    private String description;

    DoughType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}