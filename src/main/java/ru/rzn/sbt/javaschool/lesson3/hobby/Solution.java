package ru.rzn.sbt.javaschool.lesson3.hobby;

public class Solution {
    /**
     * Хобби
     * <p>
     * Реализуйте метод detect таким образом, чтобы определить из входного массива students количество
     * студентов, занимающихся музыкой {@link Rockstar}, студентов, увлекающихся мотоциклами {@link Biker} и студентов
     * без хобби {@link Student} (такие студенты не должны быть ни {@link Rockstar}, ни {@link Biker}), и разместите
     * результат в виде объекта класса {@link DetectionResult} с заполненными соответствующими полями.
     * Случаи с null-ссылкой на массив и null-элементами массива следует обрабатывать.
     */
    public static DetectionResult detect(Object[] students) {
        DetectionResult detectionResult = new DetectionResult();
        if (students == null) return detectionResult;
        int rockstarsCount = 0;
        int bikersCount = 0;
        int pureStudentsCount = 0;
        for (Object student : students) {
            if (student == null) continue;
            if (student instanceof Rockstar) {
                rockstarsCount++;
            } else {
                if (student instanceof Biker) {
                    bikersCount++;
                } else {
                    pureStudentsCount++;
                }
            }
        }
        detectionResult.setPureStudentsCount(pureStudentsCount);
        detectionResult.setRockstarsCount(rockstarsCount);
        detectionResult.setBikersCount(bikersCount);

        return detectionResult;
    }
}
