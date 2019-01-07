package ru.rzn.sbt.javaschool.lesson3.musician;

public class Vocalist extends Musician {
    private static final String[] SONG = new String[]{
            "Take me to the magic of the moment",
            "on a glory night",
            "Where the children of tomorrow dream away",
            "In the Wind of Change"
    };
    private int songRowNumber = 0;

    @Override
    protected String playGuitar() {
        return null;
    }

    @Override
    protected String sing() {
        if (songRowNumber >= SONG.length) {
            songRowNumber = 0;
        }
        return SONG[songRowNumber++];
    }
}
