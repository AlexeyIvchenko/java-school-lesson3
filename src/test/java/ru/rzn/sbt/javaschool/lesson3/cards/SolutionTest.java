package ru.rzn.sbt.javaschool.lesson3.cards;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void getDeck() {
        String[][] expectedData = new String[][]{
            {
                "туз бубны",
                "шестёрка бубны",
                "семёрка бубны",
                "восьмёрка бубны",
                "девятка бубны",
                "десятка бубны",
                "валет бубны",
                "дама бубны",
                "король бубны"
            }, {
                "туз трефы",
                "шестёрка трефы",
                "семёрка трефы",
                "восьмёрка трефы",
                "девятка трефы",
                "десятка трефы",
                "валет трефы",
                "дама трефы",
                "король трефы"
            }, {
                "туз червы",
                "шестёрка червы",
                "семёрка червы",
                "восьмёрка червы",
                "девятка червы",
                "десятка червы",
                "валет червы",
                "дама червы",
                "король червы"
            }, {
                "туз пики",
                "шестёрка пики",
                "семёрка пики",
                "восьмёрка пики",
                "девятка пики",
                "десятка пики",
                "валет пики",
                "дама пики",
                "король пики"
            }
        };

        Deck deck = Solution.getDeck();

        assertNotNull(deck);
        for (int suitCode = 0; suitCode <= 3; suitCode++) {
            for (int rankCode = 0; rankCode <= 8; rankCode++) {
                assertEquals(expectedData[suitCode][rankCode], deck.getCard(suitCode, rankCode).toString());
            }
        }
    }
}