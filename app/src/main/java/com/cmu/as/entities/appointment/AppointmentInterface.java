package com.cmu.as.entities.appointment;

import java.util.ArrayList;

/**
 * Created by Tina on 14-4-15.
 */
public class AppointmentInterface {

    private ArrayList<Appointment> data ;

    //constructor
    public AppointmentInterface(ArrayList<Appointment> app) {
        this.data = app;
    }
    //get appointment by the index
    public Appointment getApp(int ind) {
        return this.data.get(ind);
    }
    //get appointment ID by index
    public int getAppID(int ind) {
        return this.data.get(ind).getAppID();
    }
    //get doctor ID by index
    public int getDocID(int ind) {
        return this.data.get(ind).getDocID();
    }
    //get patient ID by index
    public int getPatID(int ind) {
        return this.data.get(ind).getPatID();
    }
    //get appointment date by index
    public String getAppDate(int ind) {
        return this.data.get(ind).getAppDate();
    }
    //get appointment time by index
    public String getAppTime(int ind) {
        return this.data.get(ind).getAppTime();
    }
    //get date and time availability by index
    public int getAppAvailability(int ind) {
        return this.data.get(ind).getAppAvailability();
    }
    public void setAppID(int ind, int newAppInd) {
        this.data.get(ind).setAppID(newAppInd);
    }
    public void setDocID(int ind, int newDocInd) {
        this.data.get(ind).setDocID(newDocInd);
    }
    public void setPatID(int ind, int newPatInd) {
        this.data.get(ind).setPatID(newPatInd);
    }
    public void setAppDate(int ind, String newAppDate) {
        this.data.get(ind).setAppDate(newAppDate);
    }
    public void setAppTime(int ind, String newAppTime) {
        this.data.get(ind).setAppTime(newAppTime);
    }
    public void setAppAvailability(int ind, int newAvailability) {
        this.data.get(ind).setAppAvailability(newAvailability);
    }


}
