package ru.rzn.sbt.javaschool.lesson3.flowers;

public class England implements Region {
    @Override
    public Flower yourNationalFlower() {
        return new Rose();
    }
}
