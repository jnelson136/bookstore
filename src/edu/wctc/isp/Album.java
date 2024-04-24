package edu.wctc.isp;

import java.time.Duration;
import java.time.LocalDate;

public interface Album {
    String getArtist();
    double getCost();

    String getFormattedReleaseDate();
    Duration getPlayingTime();

    int getQuantityOnHand();

    LocalDate getReleaseDate();

    String getTitle();

    void order(int quantity);

}
