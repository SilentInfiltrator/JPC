package Main.Frames;

import javax.swing.*;

/**
 * Created by Chris on 20/07/2014.
 */
public  abstract class Frame extends JFrame {
    public Frame(int x, int y, String title){
        super(title);
        setSize(x,y);
    }
}
