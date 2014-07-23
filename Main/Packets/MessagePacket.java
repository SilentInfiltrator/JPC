package Main.Packets;

/**
 * Created by Chris on 20/07/2014.
 */
public class MessagePacket extends Packet {
    private String text;

    public MessagePacket(int length, int time){
        super(length, time);

    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
