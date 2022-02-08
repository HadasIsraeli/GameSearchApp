package com.example.gamesearcher.recyleviewgames;

import com.example.gamesearcher.R;

public class DataModel {

    String company, gameName, gameTrailer, genre, image, launchDate, platform, webSite;

    public DataModel() {
    }

    public DataModel(String company, String gameName, String gameTrailer, String genre, String image, String launchDate, String platform, String webSite) {
        this.company = company;
        this.gameName = gameName;
        this.gameTrailer = gameTrailer;
        this.genre = genre;
        this.image = image;
        this.launchDate = launchDate;
        this.platform = platform;
        this.webSite = webSite;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameTrailer() {
        return gameTrailer;
    }

    public void setGameTrailer(String gameTrailer) {
        this.gameTrailer = gameTrailer;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(String launchDate) {
        this.launchDate = launchDate;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
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