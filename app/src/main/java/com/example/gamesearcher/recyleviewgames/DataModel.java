package com.example.gamesearcher.recyleviewgames;

import com.example.gamesearcher.R;

public class DataModel {

    String Company, GameName, GameTrailer, Genre, Image, LaunchDate, Platform, WebSite;

    public DataModel() {
    }

    public DataModel(String company, String gameName, String gameTrailer, String genre, String image, String launchDate, String platform, String webSite) {
        Company = company;
        GameName = gameName;
        GameTrailer = gameTrailer;
        Genre = genre;
        Image = image;
        LaunchDate = launchDate;
        Platform = platform;
        WebSite = webSite;
    }

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
//    String name;
//    String version;
//    int id_;
//    int image;
//
//    public DataModel(String name, String version, int id_, int image) {
////    public DataModel(int id_, int image) {
//        this.name = name;
//        this.version = version;
//        this.id_ = id_;
//        this.image = image;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getVersion() {
//        return version;
//    }
//
//    public int getImage() {
//        return image;
//    }
//
//    public int getId() {
//        return id_;
//    }
}