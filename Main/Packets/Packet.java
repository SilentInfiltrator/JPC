package Main.Packets;


/**
 * Created by Chris on 20/07/2014.
 */
public abstract class Packet {
    int length_in_bytes; // size of the packet in bytes
    int time_sent; //time the packet was sent

    public Packet(int length, int time){
        this.length_in_bytes = length;
        this.time_sent = time;



    }


}
