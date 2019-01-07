package ru.rzn.sbt.javaschool.lesson3.flowers;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void regionsTest() {
        Region[] regions = Solution.regions();

        assertNotNull(regions);
        assertEquals(3, regions.length);
        String[] expectedNames = {"Rose", "Jasmine", "Tulip"};
        for (int i = 0; i < regions.length; i++) {
            assertEquals(expectedNames[i], regions[i].yourNationalFlower().whatIsYourName());
        }
    }
}