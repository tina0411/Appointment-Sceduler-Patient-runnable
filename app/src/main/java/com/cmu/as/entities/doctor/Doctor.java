package com.cmu.as.entities.doctor;

/**
 * Created by Tina on 14-4-15.
 */
public class Doctor implements java.io.Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private int DocID;
    private int DepID;
    private String DocName;
    private String DocPhone;
    private String DocSpeciality;

    public int getDocID() {
        return DocID;
    }

    public int getDepID() {
        return DepID;
    }

    public String getDocName() {
        return DocName;
    }

    public String getDocPhone() {
        return DocPhone;
    }

    public String getDocSpeciality() {
        return DocSpeciality;
    }




}