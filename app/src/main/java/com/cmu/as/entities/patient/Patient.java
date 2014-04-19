package com.cmu.as.entities.patient;

/**
 * Created by Tina on 14-4-15.
 */
public class Patient implements java.io.Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String PatID;
    private String PatName;
    private String PatAge;
    private String PatGender;
    private String PatInsurance;


    public String getPatID() {
        return PatID;
    }

    public void setPatID(String patID) {
        PatID = patID;
    }

    public String getPatName() {
        return PatName;
    }

    public void setPatName(String patName) {
        PatName = patName;
    }

    public String getPatAge() {
        return PatAge;
    }

    public void setPatAge(String patAge) {
        PatAge = patAge;
    }

    public String getPatGender() {
        return PatGender;
    }

    public void setPatGender(String patGender) {
        PatGender = patGender;
    }

    public String getPatInsurance() {
        return PatInsurance;
    }

    public void setPatInsurance(String patInsurance) {
        PatInsurance = patInsurance;
    }

}
