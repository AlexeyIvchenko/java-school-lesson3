package ru.rzn.sbt.javaschool.lesson3.flowers;

public class Solution {
    /**
     * Цветы
     * <p>
     * 1. Напишите классы Jasmine, Tulip, Rose, реализующие интерфейс {@link Flower} и при вызове метода
     * {@link Flower#whatIsYourName()} возвращающие одноимённую строку "Jasmine", "Tulip", "Rose" соответственно.
     * <p>
     * 2. Напишите классы WestBengal, Hungary, England, реализующие интерфейс {@link Region} и при вызове метода
     * {@link Region#yourNationalFlower()} возвращающие экземпляры классов WestBengal - Jasmine, Hungary - Tulip,
     * England - Rose соответственно. Метод {@link Region#yourNationalFlower()} следует переопределять таким образом,
     * чтобы тип возвращаемого значения был не {@link Flower}, а Jasmine, Tulip, Rose соответственно.
     * <p>
     * 3. Перепишите тело метода {@link Solution#regions()} так, чтобы он возвращал массив из трех объектов классов:
     * England, WestBengal, Hungary (именно в таком порядке)
     */
    public static Region[] regions() {
        Region[] regions = new Region[]{new England(), new WestBengal(), new Hungary()};
        return regions;
    }

}
