package com.example.ledapptwo01;
import android.app.Application;
import android.bluetooth.BluetoothSocket;

import java.io.OutputStream;

public class BTBridge extends Application {
    private BluetoothSocket bluetoothSocket;
    private OutputStream outputStream;

    public BluetoothSocket getBluetoothSocket() {
        return bluetoothSocket;
    }

    public void setBluetoothSocket(BluetoothSocket bluetoothSocket) {
        this.bluetoothSocket = bluetoothSocket;
    }

    public OutputStream getOutputStream() {
        return outputStream;
    }

    public void setOutputStream(OutputStream outputStream) {
        this.outputStream = outputStream;
    }
}