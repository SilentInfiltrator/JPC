/*
 * Created by JFormDesigner on Mon Jul 21 22:14:26 BST 2014
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
public class NewConnection extends JFrame {
    public NewConnection() {
        initComponents();
    }

    private void startButtonClicked(MouseEvent e) {
        if(getConnectto().is)
    }

    public JRadioButton getConnectto() {
        return connectto;
    }

    public JRadioButton getServerstart() {
        return serverstart;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Chris London
        ServerStartPanel = new JPanel();
        serverstart = new JRadioButton();
        tcpport = new JTextField();
        label3 = new JLabel();
        label4 = new JLabel();
        udpport = new JTextField();
        checkBox1 = new JCheckBox();
        panel1 = new JPanel();
        connectto = new JRadioButton();
        ipaddr = new JTextField();
        label1 = new JLabel();
        label2 = new JLabel();
        tcpportonhost = new JTextField();
        udpportonhost = new JTextField();
        label5 = new JLabel();
        button1 = new JButton();

        //======== this ========
        setTitle("New Connection");
        Container contentPane = getContentPane();

        //======== ServerStartPanel ========
        {

            // JFormDesigner evaluation mark
            ServerStartPanel.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), ServerStartPanel.getBorder())); ServerStartPanel.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


            //---- serverstart ----
            serverstart.setText("Set Up Server");

            //---- label3 ----
            label3.setText("TCP Port:");

            //---- label4 ----
            label4.setText("UDP Port:");

            //---- checkBox1 ----
            checkBox1.setText("Log Chat");

            GroupLayout ServerStartPanelLayout = new GroupLayout(ServerStartPanel);
            ServerStartPanel.setLayout(ServerStartPanelLayout);
            ServerStartPanelLayout.setHorizontalGroup(
                ServerStartPanelLayout.createParallelGroup()
                    .addGroup(ServerStartPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ServerStartPanelLayout.createParallelGroup()
                            .addComponent(serverstart)
                            .addGroup(ServerStartPanelLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(ServerStartPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addGroup(ServerStartPanelLayout.createSequentialGroup()
                                        .addComponent(label3)
                                        .addGap(18, 18, 18)
                                        .addComponent(tcpport, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ServerStartPanelLayout.createSequentialGroup()
                                        .addComponent(label4)
                                        .addGap(18, 18, 18)
                                        .addGroup(ServerStartPanelLayout.createParallelGroup()
                                            .addComponent(checkBox1, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(udpport, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(393, Short.MAX_VALUE))
            );
            ServerStartPanelLayout.setVerticalGroup(
                ServerStartPanelLayout.createParallelGroup()
                    .addGroup(ServerStartPanelLayout.createSequentialGroup()
                        .addComponent(serverstart)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ServerStartPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label3)
                            .addComponent(tcpport, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ServerStartPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(udpport, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkBox1)
                        .addContainerGap(83, Short.MAX_VALUE))
            );
        }

        //======== panel1 ========
        {

            //---- connectto ----
            connectto.setText("Connect to");

            //---- label1 ----
            label1.setText("IP Address:");

            //---- label2 ----
            label2.setText("TCP Port:");

            //---- label5 ----
            label5.setText("UDP Port:");

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(label2)
                                        .addGap(26, 26, 26)
                                        .addComponent(tcpportonhost, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(label1)
                                        .addGap(18, 18, 18)
                                        .addComponent(ipaddr, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(label5)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(udpportonhost, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(connectto)))
                        .addContainerGap(399, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(connectto)
                        .addGap(12, 12, 12)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label1)
                            .addComponent(ipaddr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(tcpportonhost, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label5)
                            .addComponent(udpportonhost, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(36, Short.MAX_VALUE))
            );
        }

        //---- button1 ----
        button1.setText("Start");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                startButtonClicked(e);
            }
        });

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ServerStartPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(0, 515, Short.MAX_VALUE)
                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ServerStartPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
        );
        pack();
        setLocationRelativeTo(getOwner());

        //---- connect_or_setup ----
        ButtonGroup connect_or_setup = new ButtonGroup();
        connect_or_setup.add(serverstart);
        connect_or_setup.add(connectto);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Chris London
    private JPanel ServerStartPanel;
    private static JRadioButton serverstart;
    private JTextField tcpport;
    private JLabel label3;
    private JLabel label4;
    private JTextField udpport;
    private JCheckBox checkBox1;
    private JPanel panel1;
    private static JRadioButton connectto;
    private JTextField ipaddr;
    private JLabel label1;
    private JLabel label2;
    private JTextField tcpportonhost;
    private JTextField udpportonhost;
    private JLabel label5;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
