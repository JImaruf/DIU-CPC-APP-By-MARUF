package com.example.diucpc.Models;

public class Slider_model_ongoing {

    int image;
    String title,DAYS,HOURS,MINUTES,SECONDS;

    public Slider_model_ongoing(int image, String title) {
        this.image = image;
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDAYS() {
        return DAYS;
    }

    public void setDAYS(String DAYS) {
        this.DAYS = DAYS;
    }

    public String getHOURS() {
        return HOURS;
    }

    public void setHOURS(String HOURS) {
        this.HOURS = HOURS;
    }

    public String getMINUTES() {
        return MINUTES;
    }

    public void setMINUTES(String MINUTES) {
        this.MINUTES = MINUTES;
    }

    public String getSECONDS() {
        return SECONDS;
    }

    public void setSECONDS(String SECONDS) {
        this.SECONDS = SECONDS;
    }
}
