package com.cmu.as.socket;

public interface SocketClientInterface {
	boolean openConnection();
    void handleSession();
    void closeSession();
}
