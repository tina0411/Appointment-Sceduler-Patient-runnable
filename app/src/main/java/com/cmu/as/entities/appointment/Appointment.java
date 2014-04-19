package com.cmu.as.entities.appointment;

/**
 * Created by Tina on 14-4-15.
 */
public class Appointment implements java.io.Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    //        db.execSQL("CREATE TABLE appointment (AppID INTEGER PRIMARY KEY, DocID INTEGER, PatID INTEGER" +
    //    "AppDate VARCHAR, AppTime VARCHAR, AppAvailability INTEGER)");

    private int AppID;
    private int DocID;
    private int PatID;
    private String AppDate;
    private String AppTime;
    private int AppAvailability;


    public int getAppID() {
        return AppID;
    }

    public void setAppID(int appID) {
        AppID = appID;
    }

    public int getDocID() {
        return DocID;
    }

    public void setDocID(int docID) {
        DocID = docID;
    }

    public int getPatID() {
        return PatID;
    }

    public void setPatID(int patID) {
        PatID = patID;
    }

    public String getAppDate() {
        return AppDate;
    }

    public void setAppDate(String appDate) {
        AppDate = appDate;
    }

    public String getAppTime() {
        return AppTime;
    }

    public void setAppTime(String appTime) {
        AppTime = appTime;
    }

    public int getAppAvailability() {
        return AppAvailability;
    }

    public void setAppAvailability(int appAvailability) {
        AppAvailability = appAvailability;
    }

}
