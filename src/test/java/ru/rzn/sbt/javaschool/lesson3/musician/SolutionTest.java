package ru.rzn.sbt.javaschool.lesson3.musician;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SolutionTest {
    @Test
    public void getVocalist() {
        String[] expectedData = {
                "Take me to the magic of the moment",
                "on a glory night",
                "Where the children of tomorrow dream away",
                "In the Wind of Change"
        };

        Musician musician = Solution.getVocalist();

        assertNotNull(musician);
        for (int i = 0; i < 12; i++) {
            String rock = musician.rock();
            assertEquals(expectedData[i % expectedData.length], rock);
        }
    }

    @Test
    public void getGuitarPlayer() {
        String[] expectedData = {
                "C G Dm G",
                "C G",
                "Dm G Am",
                "Am/F G"

        };

        Musician musician = Solution.getGuitarPlayer();

        assertNotNull(musician);
        for (int i = 0; i < 12; i++) {
            String rock = musician.rock();
            assertEquals(expectedData[i % expectedData.length], rock);
        }
    }

    @Test
    public void getFrontMan() {
        String[] expectedData = {
                "C# G# F#-Take advantage while",
                "C# G# F#-You hang me out to dry",
                "Em E A5 C-But I can't see you every night",
                "Em G Em G-Free I do"
        };

        Musician musician = Solution.getFrontMan();

        assertNotNull(musician);
        for (int i = 0; i < 12; i++) {
            String rock = musician.rock();
            assertEquals(expectedData[i % expectedData.length], rock);
        }
    }
}
