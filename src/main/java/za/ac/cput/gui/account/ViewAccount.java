package za.ac.cput.gui.account;
/**
 * ViewAccount.java
 * Author: Siphelele Nyathi 218334028
 * Due Date: 20/10/2021
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewAccount extends JFrame implements ActionListener {

    private JFrame frame;
    private JPanel panelNorth, panelSouth, panelEast, panelWest, panelCenter;
    private JLabel lblHeading;
    private JButton btnViewBalance, btnViewRate, btnViewPeriod, btnBack;
    private JLabel Filler1, Filler2, Filler3, Filler4, Filler5;
    private Font fnt;
    Color btnColor = Color.WHITE;

    public ViewAccount() {

        fnt = new Font("Arial", Font.BOLD, 30);

        frame = new JFrame("VIEW ACCOUNT");
        lblHeading = new JLabel("ACCOUNT DETAILS", JLabel.CENTER);

        panelNorth = new JPanel();
        panelNorth.setBackground(Color.LIGHT_GRAY);

        panelEast = new JPanel();
        panelEast.setBackground(Color.LIGHT_GRAY);

        panelWest = new JPanel();
        panelWest.setBackground(Color.LIGHT_GRAY);

        panelCenter = new JPanel();
        panelCenter.setBackground(Color.LIGHT_GRAY);

        panelSouth = new JPanel();
        panelSouth.setBackground(Color.LIGHT_GRAY);

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

        btnViewBalance = new JButton("Balance: ");
        btnViewBalance.setBackground(btnColor);
        btnViewRate = new JButton("Interest rate (%): ");
        btnViewRate.setBackground(btnColor);
        btnViewPeriod = new JButton("Interest Period (months): ");
        btnViewPeriod.setBackground(btnColor);
        btnBack = new JButton("BACK");
        btnBack.setBackground(btnColor);
    }

    public void setGUI() {

        panelNorth.setLayout(new GridLayout(2, 1));
        panelEast.setLayout(new GridLayout(5, 1));
        panelSouth.setLayout(new GridLayout(1, 3));
        panelWest.setLayout(new GridLayout(5, 1));
        panelCenter.setLayout(new GridLayout(7, 1));

        panelNorth.add(Filler5);
        panelNorth.add(lblHeading);

        panelWest.add(Filler1);
        panelEast.add(Filler2);

        panelCenter.add(Filler3);
        panelCenter.add(btnViewBalance);
        panelCenter.add(btnViewRate);
        panelCenter.add(btnViewPeriod);
        panelCenter.add(Filler4);

        panelSouth.add(btnBack);

        btnViewBalance.addActionListener(this);
        btnViewRate.addActionListener(this);
        btnViewPeriod.addActionListener(this);
        btnBack.addActionListener(this);

        frame.add(panelNorth, BorderLayout.NORTH);
        frame.add(panelSouth, BorderLayout.SOUTH);
        frame.add(panelEast, BorderLayout.EAST);
        frame.add(panelCenter, BorderLayout.CENTER);
        frame.add(panelWest, BorderLayout.WEST);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setSize(350, 350);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("BACK")) {
            AccountMenuGUI.main(null);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new ViewAccount().setGUI();
    }
}
