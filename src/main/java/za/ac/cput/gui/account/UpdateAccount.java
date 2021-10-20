package za.ac.cput.gui.account;
/**
 * UpdateAccount.java
 * Author: Siphelele Nyathi 218334028
 * Due Date: 20/10/2021
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateAccount extends JFrame implements ActionListener {

    private JLabel lblBalance, lblRate, lblPeriod;
    private JTextField txtBalance, txtRate, txtPeriod;
    private JButton btnUpdate, btnCancel;
    public JPanel northPanel, southPanel;

    public UpdateAccount() {
        super("UPDATE ACCOUNT");

        northPanel = new JPanel();
        southPanel = new JPanel();

        lblBalance = new JLabel("Balance: ");
        lblRate = new JLabel("Interest Rate %: ");
        lblPeriod = new JLabel("Interest period: ");

        txtBalance = new JTextField(30);
        txtRate = new JTextField(30);
        txtPeriod = new JTextField(30);

        btnUpdate = new JButton("UPDATE");
        btnCancel = new JButton("BACK");
    }

    public void setGUI() {

        northPanel.setLayout(new GridLayout(0, 2));
        southPanel.setLayout(new GridLayout(1, 2));
        this.setPreferredSize(new Dimension(350, 125));

        northPanel.add(lblBalance);
        northPanel.add(txtBalance);
        northPanel.add(lblRate);
        northPanel.add(txtRate);
        northPanel.add(lblPeriod);
        northPanel.add(txtPeriod);

        southPanel.add(btnUpdate);
        southPanel.add(btnCancel);

        btnUpdate.addActionListener(this);
        btnCancel.addActionListener(this);

        this.add(northPanel, BorderLayout.NORTH);
        this.add(southPanel, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnUpdate) {
            //store(txtBalance.getText(),
            //    txtRate.getText(),
            //  txtPeriod.getText());

        } else if (e.getSource() == btnCancel) {
            AccountMenuGUI.main(null);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new UpdateAccount().setGUI();
    }

}
