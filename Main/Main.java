package Main;
import com.esotericsoftware.kryonet.*;
import Main.Frames.*;

import javax.swing.*;
import java.io.IOException;

/**
 * Created by Chris on 20/07/2014.
 */
public class Main {
    public static GuiThread guithread;
    public static ServerThread serverthread;
    public static ClientThread clientthread;
    public static void main(String[] args) throws IOException {
        guithread = new GuiThread();
        serverthread = new ServerThread();
        clientthread = new ClientThread();

        guithread.run();

    }

    //---------Start server or client threads
    public static void startServer(){
        try{
            serverthread.run();

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error starting Server");

        }

    }

    public static void startClient(String ip, int tcpport, int udpport) {
        try {
            clientthread.setIp(ip);
            clientthread.setTcp(tcpport);
            clientthread.setUdp(udpport);
            clientthread.run();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error starting Client");

        }

    }
    //---------


    //Stops all threads, if they are running and then exits main thread
    public void shutDown(){

        if(serverthread.isRunning()) serverthread.setRun(false);

        if(clientthread.isRunning()) clientthread.setRun(false);

        guithread.setRun(false);
        System.exit(1);
    }
}


//Classes for threads
class ServerThread implements Runnable{
    private boolean run;
    @Override

    public void run() {
        this.run = true;
    }

    public boolean isRunning(){
        if(this.run = true) return true;
        else return false;
    }

    public void setRun(boolean value){
        if(value = true) this.run = true;
        else this.run = false;
    }
}


class ClientThread implements Runnable{
    private boolean run;
    private String ip;
    private int tcpport;
    private int udpport;
    private Client client;

    @Override
    public void run() {
        this.run = true;
        startConnection();

    }

    public void startConnection() {
        client = new Client();
        client.start();
        try {
            client.connect(5000, ip, tcpport, udpport);
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error Starting Client!");
        }
    }
    public boolean isRunning(){
        if(this.run = true) return true;
        else return false;
    }

    public void setRun(boolean value){
        if(value = true) this.run = true;
        else this.run = false;
    }

    public void setUdp(int udp) {
        this.udpport = udp;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setTcp(int tcp){
        this.tcpport = tcp;
    }
}


class GuiThread implements Runnable{
    private boolean run;
    private NewConnectionWindow newconnection;
    @Override
    public void run() {
        this.run = true;
        newconnection = new NewConnectionWindow();
        newconnection.setVisible(true);

        while (run) {

        }
    }

    //returns the New Connnection Window object to retrieve input
    public NewConnectionWindow getNewConWindow() {
        return this.newconnection;

    }


    public boolean isRunning(){
        if(this.run = true) return true;
        else return false;
    }

    public void setRun(boolean value){
        if(value = true) this.run = true;
        else this.run = false;
    }

    public void startMainWindow(){

    }
}