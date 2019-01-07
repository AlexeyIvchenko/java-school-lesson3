package ru.rzn.sbt.javaschool.lesson3.army;

/**
 * Тип оружия
 */
public enum  WeaponType {
    SWORD("Меч"),
    SPEAR("Копьё"),
    BOW("Лук");

    private String description;

    WeaponType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
