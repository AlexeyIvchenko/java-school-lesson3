package ru.rzn.sbt.javaschool.lesson3.musician;

public class GuitarPlayer extends Musician {
    private static final String[] GUITAR_SONG = new String[]{
            "C G Dm G",
            "C G",
            "Dm G Am",
            "Am/F G"
    };
    private int songRowNumber;

    @Override
    protected String playGuitar() {
        if (songRowNumber >= GUITAR_SONG.length) {
            songRowNumber = 0;
        }
        return GUITAR_SONG[songRowNumber++];
    }

    @Override
    protected String sing() {
        return null;
    }
}
