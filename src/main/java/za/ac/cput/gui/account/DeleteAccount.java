package za.ac.cput.gui.account;
/**
DeleteAccount.java
 * Author: Siphelele Nyathi 218334028
 * Due Date: 20/10/2021
 * */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteAccount extends JFrame implements ActionListener {
    private JFrame frame;
    private JPanel panelNorth, panelSouth, panelEast, panelWest, panelCenter;
    private JLabel lblHeading, lblBalance, lblRate, lblPeriod;
    private JButton btnDelete, btnCancel;
    private JLabel Filler1, Filler2, Filler3, Filler4, Filler5;
    private Font fnt1;
    private JTextField txtBalance, txtRate, txtPeriod;

    Color btnColor = Color.WHITE;


    public DeleteAccount() {

        fnt1 = new Font("Arial", Font.BOLD, 30);
        frame = new JFrame("DELETE USER ACCOUNT");

        panelNorth = new JPanel();
        panelSouth = new JPanel();
        panelEast = new JPanel();
        panelWest = new JPanel();
        panelCenter = new JPanel();

        panelNorth.setBackground(Color.LIGHT_GRAY);
        panelEast.setBackground(Color.LIGHT_GRAY);
        panelSouth.setBackground(Color.LIGHT_GRAY);
        panelWest.setBackground(Color.LIGHT_GRAY);
        panelCenter.setBackground(Color.LIGHT_GRAY);

        lblHeading = new JLabel("REMOVE ACCOUNT", JLabel.CENTER);
        lblBalance = new JLabel("Balance", JLabel.CENTER);
        lblRate = new JLabel("Interest Rate (%)", JLabel.CENTER);
        lblPeriod = new JLabel("Interest Period (months)", JLabel.CENTER);

        txtBalance = new JTextField(" ", JTextField.CENTER);
        txtRate = new JTextField(" ", JTextField.CENTER);
        txtPeriod = new JTextField(" ", JTextField.CENTER);

        Filler1 = new JLabel("=====");
        Filler1.setForeground(Color.LIGHT_GRAY);
        Filler2 = new JLabel("=====");
        Filler2.setForeground(Color.LIGHT_GRAY);
        Filler3 = new JLabel("================================");
        Filler3.setForeground(Color.LIGHT_GRAY);
        Filler4 = new JLabel("================================");
        Filler4.setForeground(Color.LIGHT_GRAY);
        Filler5 = new JLabel("================================");

        Filler5.setForeground(Color.LIGHT_GRAY);

        btnDelete = new JButton("DELETE");
        btnDelete.setBackground(btnColor);
        btnCancel = new JButton("BACK");
        btnCancel.setBackground(btnColor);
    }

    public void setGUI() {

        panelNorth.setLayout(new GridLayout(2, 1));
        panelEast.setLayout(new GridLayout(5, 1));
        panelSouth.setLayout(new GridLayout(1, 3));
        panelWest.setLayout(new GridLayout(5, 1));
        panelCenter.setLayout(new GridLayout(10, 1));

        lblHeading.setFont(fnt1);

        panelNorth.add(Filler5);
        panelNorth.add(lblHeading);

        panelWest.add(Filler1);
        panelEast.add(Filler2);

        panelCenter.add(Filler3);
        panelCenter.add(lblBalance);
        panelCenter.add(txtBalance);
        panelCenter.add(lblRate);
        panelCenter.add(txtRate);
        panelCenter.add(lblPeriod);
        panelCenter.add(txtPeriod);

        panelSouth.add(btnDelete);
        panelSouth.add(btnCancel);

        btnDelete.addActionListener(this);
        btnCancel.addActionListener(this);

        frame.add(panelNorth, BorderLayout.NORTH);
        frame.add(panelSouth, BorderLayout.SOUTH);
        frame.add(panelEast, BorderLayout.EAST);
        frame.add(panelCenter, BorderLayout.CENTER);
        frame.add(panelWest, BorderLayout.WEST);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("DELETE")) {

        } else if (e.getActionCommand().equals("BACK")) {
            AccountMenuGUI.main(null);
            this.setVisible(false);

        }
    }

    public static void main(String[] args) {
        new DeleteAccount().setGUI();
    }

}
