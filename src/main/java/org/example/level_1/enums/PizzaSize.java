package org.example.level_1.enums;

public enum PizzaSize {
    SMALL("Pequeña"),
    MEDIUM("Mediana"),
    BIG("Grande"),
    JUMBO3XL("Demasié grande");

    private String description;

    PizzaSize(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}