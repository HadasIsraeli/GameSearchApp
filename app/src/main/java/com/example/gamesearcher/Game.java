package com.example.gamesearcher;

import com.example.gamesearcher.recyleviewgames.DataModel;

import java.util.AbstractCollection;
import java.util.ArrayList;

public class Game {
    String Company;
    String GameName;
    String GameTrailer;
    String Genre;
    String Image;
    String LaunchDate;
    String Platform;
    String WebSite;


    public Game(String company, String gameName, String gameTrailer, String genre, String image, String launchDate, String platform, String webSite) {
        Company = company;
        GameName = gameName;
        GameTrailer = gameTrailer;
        Genre = genre;
        Image = image;
        LaunchDate = launchDate;
        Platform = platform;
        WebSite = webSite;
    }
    public Game(){}

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getGameName() {
        return GameName;
    }

    public void setGameName(String gameName) {
        GameName = gameName;
    }

    public String getGameTrailer() {
        return GameTrailer;
    }

    public void setGameTrailer(String gameTrailer) {
        GameTrailer = gameTrailer;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getLaunchDate() {
        return LaunchDate;
    }

    public void setLaunchDate(String launchDate) {
        LaunchDate = launchDate;
    }

    public String getPlatform() {
        return Platform;
    }

    public void setPlatform(String platform) {
        Platform = platform;
    }

    public String getWebSite() {
        return WebSite;
    }

    public void setWebSite(String webSite) {
        WebSite = webSite;
    }


}
