package ru.rzn.sbt.javaschool.lesson3.cards;

/**
 * Колода
 */
public interface Deck {
    Card getCard(int suit, int rank);
}
