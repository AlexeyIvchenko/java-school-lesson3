package ru.rzn.sbt.javaschool.lesson3.hobby;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void count() {
        Object[][] expectedData = {
                {null, new DetectionResult(0, 0, 0)},
                {new Student[]{}, new DetectionResult(0, 0, 0)},
                {new Student[]{new Student(), new Student()}, new DetectionResult(2, 0, 0)},
                {new Student[]{new Student(), new Student(), new Rockstar()}, new DetectionResult(2, 1, 0)},
                {new Student[]{new Biker(), new Student(), new Student(), new Rockstar(), new Biker()}, new DetectionResult(2, 1, 2)},
                {new Student[]{new Biker(), new Student(), null, new Rockstar(), new Biker()}, new DetectionResult(1, 1, 2)},
        };

        for(Object[] test: expectedData) {
            assertEquals(test[1], Solution.detect((Student[]) test[0]));
        }
    }
}