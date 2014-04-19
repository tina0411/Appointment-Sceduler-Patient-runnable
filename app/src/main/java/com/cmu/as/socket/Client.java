//package com.cmu.apointmentscedulerpatient.app.ws.remote;
//
//import java.net.*;
//import java.io.*;
//
///**
// * Created by Tina on 14-4-15.
// */
//public class Client extends Thread implements SocketClientInterface, SocketClientConstants {
//    private ObjectOutputStream out;
//    private ObjectInputStream in;
//    private Socket sock;
//    private String strHost;
//    private int iPort;
//
//    public Client(String strHost, int iPort) {
//        setPort (iPort);
//        setHost (strHost);
//    }//constructor
//
//    public void run(){
//        if (openConnection()){
//            handleSession();
//            closeSession();
//        }
//    }//run
//
//    public boolean openConnection(){
//
//        return true;
//    }
//
//    public void handleSession(){
//
//    }
//
//
//    public void closeSession(){
//
//    }
//
//    public void setHost(String strHost){  //set Host
//        this.strHost = strHost;
//    }
//
//    public void setPort(int iPort){  //set Port
//        this.iPort = iPort;
//    }
//}
