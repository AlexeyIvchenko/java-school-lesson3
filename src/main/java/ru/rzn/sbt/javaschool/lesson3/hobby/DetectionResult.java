package ru.rzn.sbt.javaschool.lesson3.hobby;

import java.util.Objects;

/**
 * Результат проверки
 */
final public class DetectionResult {
    /**
     * Количество студенов без хобби
     */
    private int pureStudentsCount;

    /**
     * Количество студентов, занимающихся музыкой
     */
    private int rockstarsCount;

    /**
     * Количество студентов, увлекающихся мотоциклами
     */
    private int bikersCount;

    public DetectionResult() {
        this(0, 0, 0);
    }

    public DetectionResult(int pureStudentsCount, int rockstarsCount, int bikersCount) {
        this.pureStudentsCount = pureStudentsCount;
        this.rockstarsCount = rockstarsCount;
        this.bikersCount = bikersCount;
    }

    public int getPureStudentsCount() {
        return pureStudentsCount;
    }

    public void setPureStudentsCount(int pureStudentsCount) {
        this.pureStudentsCount = pureStudentsCount;
    }

    public int getRockstarsCount() {
        return rockstarsCount;
    }

    public void setRockstarsCount(int rockstarsCount) {
        this.rockstarsCount = rockstarsCount;
    }

    public int getBikersCount() {
        return bikersCount;
    }

    public void setBikersCount(int bikersCount) {
        this.bikersCount = bikersCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DetectionResult that = (DetectionResult) o;
        return pureStudentsCount == that.pureStudentsCount &&
                rockstarsCount == that.rockstarsCount &&
                bikersCount == that.bikersCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pureStudentsCount, rockstarsCount, bikersCount);
    }
}
