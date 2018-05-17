package com.aavdeev.carscapitalmusic;

import java.util.ArrayList;
import java.util.List;

public class BandFactory {

    private BandFactory() {

    }

    static List<String> getBandFactory(String style) {
        List<String> bands = new ArrayList<>();
        switch (style) {
            case "ROCK":
                bands.add("AC/DC");
                bands.add("3 DoorsDown");
                bands.add("Kiss");
                break;
            case "POP":
                bands.add("Filip Kirkorov");
                bands.add("Nikola Baskov");
                bands.add("Nyousha");
                break;
            case "CLASSIC":
                bands.add("Bach");
                bands.add("Mozzart");
                bands.add("Bethowen");
                break;
            default:
                break;
        }
        return bands;
    }

}
