package com.cmu.as.entities.doctor;

import java.util.ArrayList;

/**
 * Created by Tina on 14-4-15.
 */
public class DoctorInterface {

    private ArrayList<Doctor> data ;

    //constructor
    public DoctorInterface(ArrayList<Doctor> doc) {
        this.data = doc;
    }
    //get doctor by the index
    public Doctor getDoc(int ind) {
        return this.data.get(ind);
    }
    //get doctor ID by index
    public int getDocID(int ind) {
        return this.data.get(ind).getDocID();
    }
    //get department ID by index
    public int getDepID(int ind) {
        return this.data.get(ind).getDepID();
    }
    //get doctor name by index
    public String getDocName(int ind) {
        return this.data.get(ind).getDocName();
    }
    //get doctor phone by index
    public String getDocPhone(int ind) {
        return this.data.get(ind).getDocPhone();
    }
    //get doctor's speciality by index
    public String getDocSpeciality(int ind) {
        return this.data.get(ind).getDocSpeciality();
    }
//
//    public void setDocID(int ind, int docId) {
//        this.data.get(ind).setDocID(docId);
//    }
//    public void setDepID(int ind, int depId) {
//        this.data.get(ind).setDepID(depId);
//    }
//    public void setDocName(int ind, String docName) {
//        this.data.get(ind).setDocName(docName);
//    }
//    public void setDocPhone(int ind, String docPhone) {
//        this.data.get(ind).setDocName(docPhone);
//    }
//    public void setDocSpeciality(int ind, String docSpeciality) {
//        this.data.get(ind).setDocSpeciality(docSpeciality);
//    }

}
