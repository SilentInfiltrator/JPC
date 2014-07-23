/*
 * Created by JFormDesigner on Mon Jul 21 15:51:17 BST 2014
 */

package Main.Frames;
import Main.Main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Chris London
 */
public class MainWindow extends JFrame {
    public MainWindow() {
        initComponents();
    }

    private void thisWindowClosed(WindowEvent e) {
        new Main().shutDown();
    }

    private void thisWindowClosing(WindowEvent e) {
        new Main().shutDown();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Chris London
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        menuItem1 = new JMenuItem();
        menuItem2 = new JMenuItem();
        menu2 = new JMenu();
        menu3 = new JMenu();
        chatscroll = new JScrollPane();
        chatoutput = new JTextPane();
        inputfield = new JTextField();
        sendbutton = new JButton();

        //======== this ========
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                thisWindowClosing(e);
            }
        });
        Container contentPane = getContentPane();

        //======== menuBar1 ========
        {

            //======== menu1 ========
            {
                menu1.setText("Connection");

                //---- menuItem1 ----
                menuItem1.setText("New");
                menu1.add(menuItem1);

                //---- menuItem2 ----
                menuItem2.setText("Disconnect");
                menu1.add(menuItem2);
            }
            menuBar1.add(menu1);

            //======== menu2 ========
            {
                menu2.setText("Settings");

                //======== menu3 ========
                {
                    menu3.setText("View");
                }
                menu2.add(menu3);
            }
            menuBar1.add(menu2);
        }
        setJMenuBar(menuBar1);

        //======== chatscroll ========
        {

            //---- chatoutput ----
            chatoutput.setEditable(false);
            chatscroll.setViewportView(chatoutput);
        }

        //---- sendbutton ----
        sendbutton.setText("Send");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(chatscroll, GroupLayout.DEFAULT_SIZE, 917, Short.MAX_VALUE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(inputfield, GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(sendbutton, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(chatscroll, GroupLayout.PREFERRED_SIZE, 397, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(inputfield, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(sendbutton, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                    .addContainerGap(97, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Chris London
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenuItem menuItem1;
    private JMenuItem menuItem2;
    private JMenu menu2;
    private JMenu menu3;
    private JScrollPane chatscroll;
    private JTextPane chatoutput;
    private JTextField inputfield;
    private JButton sendbutton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
