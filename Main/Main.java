package Main;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryonet.*;
import Main.Packets.*;
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
    public boolean startServer(){
        try{
            serverthread.run();
            return true;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error starting Server");
            return false;
        }

    }
    public boolean startClient(){
        try{
            clientthread.run();
            return true;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error starting Client");
            return false;
        }

    }
    //---------


    //Stops all threads, if they are running and then exits main thread
    public void shutDown(){
        guithread.setRun(false);

        if(serverthread.isRunning()) serverthread.setRun(false);

        if(clientthread.isRunning()) clientthread.setRun(false);
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
    }

    public void startConnection(String ip, int tcpport, int udpport) {
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
}


class GuiThread implements Runnable{
    private boolean run;
    private NewConnection newconnection;
    @Override
    public void run() {
        newconnection = new NewConnection();
        this.run = true;

        while (run) {
            newconnection.setVisible(true);
        }
    }

    public NewConnection getNewConWindow() {
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