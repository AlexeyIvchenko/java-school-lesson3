package ru.rzn.sbt.javaschool.lesson3.flowers;

public class Hungary implements Region {
    @Override
    public Flower yourNationalFlower() {
        return new Tulip();
    }
}
