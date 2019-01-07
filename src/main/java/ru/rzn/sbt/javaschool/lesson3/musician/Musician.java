package ru.rzn.sbt.javaschool.lesson3.musician;

import java.util.ArrayList;
import java.util.List;

/**
 * Музыкант
 */
public abstract class Musician {
    final String rock(){
        StringBuilder result = new StringBuilder("");

        String chord = playGuitar();
        String text = sing();

        List<String> output = new ArrayList<>();
        if (chord != null && chord.length() > 0) {
            result.append(chord);
        }
        if (text != null && text.length() > 0) {
            if (result.length() > 0) {
                result.append("-");
            }
            result.append(text);
        }
        return result.toString();
    }

    protected abstract String playGuitar();

    protected abstract String sing();
}
