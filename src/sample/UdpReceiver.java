
package sample;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpReceiver implements Runnable {
    private boolean running = true;
    private DatagramSocket socket;
    private Controller controller;
    int udpPort = 7000;

    public UdpReceiver(Controller controller) {
        this.controller = controller;

        try {
            socket = new DatagramSocket(udpPort);
        } catch (SocketException e) {
            e.printStackTrace();
        }

    }

    public void run() {
        while (isRunning()) {
            byte[] bytes = new byte[25];
            DatagramPacket packetToReceive = new DatagramPacket(bytes, bytes.length);

            //wait and receive packet
            try {
                socket.receive(packetToReceive);
            } catch (IOException e) {
                e.printStackTrace();
            }

            //print packet content
            String message = new String(packetToReceive.getData());
            message.substring(0,packetToReceive.getLength()); // deletes unnecessary data
            controller.movement(message);

            /*            System.out.println(message); */
        }
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
}
