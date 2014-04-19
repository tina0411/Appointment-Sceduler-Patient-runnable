package com.cmu.as.socket;

import android.app.Application;

import com.cmu.as.entities.patient.Patient;
import com.cmu.as.entities.patient.PatientInterface;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by Tina on 14-4-18.
 */
public class PatSocket extends Application {
    private PatientInterface patInerface = null;
    private Socket sock = null;
    private ObjectOutputStream out;
    private ObjectInputStream in;
    String strHost = null;
    private static final boolean DEBUG = true;

    public Socket getSock(){
        return sock;
    }

    public PatientInterface getPatInerface(){
        return this.patInerface;
    }

    public void onCreate(){

        try {
            strHost = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            if (DEBUG) System.err.println("Unable to get host name ");
        }
        try {
//            sock = new Socket("128.237.169.139", 8888);
            sock = new Socket("128.237.168.117", 8888);
        } catch (IOException e) {
            if (DEBUG) System.err.println("Unable to connect to " + strHost);
        }
        try {
            in = new ObjectInputStream(sock.getInputStream());  //get info from server with ObjectInputStream
            out = new ObjectOutputStream(sock.getOutputStream());  //send info to server with ObjectOutputStream
        } catch (IOException e) {
            if (DEBUG) System.err.println("Unable to obtain stream to/from " + strHost);
        }

    }

    public void creatPatient (Patient pat) {
        patInerface = new PatientInterface(pat);
    }

    public Object getInput(){
        try {
            return (in.readObject());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void sendOutput(Object outObj){
        try {
            out.writeObject(outObj);  //send info to server using ObjectOutputStream
        }
        catch (IOException e){
            if (DEBUG) System.out.println("Error writing to " + strHost);
        }
    }

    public void closeSession(){
        try {
            in.close();
            out.close();
        } catch (IOException e) {
            if (DEBUG) System.out.println("Error when closing");
        }

    }

    public void onTerminate(){
        try {
            sock.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

