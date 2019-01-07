package ru.rzn.sbt.javaschool.lesson3.musician;

public class FrontMan extends Musician {
    private static final String[] SONG = new String[]{
            "Take advantage while",
            "You hang me out to dry",
            "But I can't see you every night",
            "Free I do"
    };
    private static final String[] GUITAR_SONG = new String[]{
            "C# G# F#",
            "C# G# F#",
            "Em E A5 C",
            "Em G Em G"
    };
    private int songRowNumber = 0;
    private int guitarSongRowNumber = 0;

    @Override
    protected String playGuitar() {
        if (guitarSongRowNumber >= GUITAR_SONG.length) {
            guitarSongRowNumber = 0;
        }
        return GUITAR_SONG[guitarSongRowNumber++];
    }

    @Override
    protected String sing() {
        if (songRowNumber >= SONG.length) {
            songRowNumber = 0;
        }
        return SONG[songRowNumber++];
    }
}
