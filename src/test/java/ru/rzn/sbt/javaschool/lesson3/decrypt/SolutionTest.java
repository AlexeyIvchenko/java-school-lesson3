package ru.rzn.sbt.javaschool.lesson3.decrypt;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void decrypt() {
        Object[][] expectedData = {
                {null, null},
                {"", ""},
                {"jklmnopqrstuvxyzabcdefghi", "abcdefghijklmopqrstuvwxyz"},
                {"JKLMNOPQRSTUVWXYZABCDEFGHI", "ABCDEFGHIJKLMNOPQRSTUVWXYZ"},
                {"Qnuux, fqjc rb hxda wjvn?", "Hello, what is your name?"},
                {"Привет, как тебя зовут?", "Привет, как тебя зовут?"},
        };

        for(Object[] test: expectedData) {
            String encryptedString = (String)test[0];
            String decryptedString = (String)test[1];
            assertEquals(decryptedString, Solution.decrypt(encryptedString));
        }
    }
}