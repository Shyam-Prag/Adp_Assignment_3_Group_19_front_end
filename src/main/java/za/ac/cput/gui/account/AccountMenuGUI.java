package za.ac.cput.gui.account;
/**
 * AccountMenuGUI.java
 * Author: Siphelele Nyathi 218334028
 * Due Date: 20/10/2021
 */

import za.ac.cput.App;
import za.ac.cput.gui.main.HomeGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccountMenuGUI extends JFrame implements ActionListener {

    private JButton btnView, btnAdd, btnUpdate, btnDelete, btnBack;
    private JLabel lblHeading;
    private JPanel northPanel, centerPanel, southPanel;
    private Font fnt1;


    public AccountMenuGUI() {

        super("Account Menu");

        northPanel = new JPanel();
        centerPanel = new JPanel();
        southPanel = new JPanel();

        btnView = new JButton("View Account");
        btnAdd = new JButton("Add New Account");
        btnUpdate = new JButton("Update Account");
        btnDelete = new JButton("Delete Account");
        btnBack = new JButton("BACK TO MAIN MENU");

        lblHeading = new JLabel("Accounts", SwingConstants.CENTER);

        fnt1 = new Font("Arial", Font.BOLD, 30);
    }

    public void setGUI() {

        northPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        northPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        centerPanel.setLayout(new GridLayout(4, 1));
        southPanel.setLayout(new GridLayout(1, 1));

        this.setPreferredSize(new Dimension(300, 300));

        lblHeading.setFont(fnt1);

        northPanel.add(lblHeading);

        centerPanel.add(btnView);
        centerPanel.add(btnAdd);
        centerPanel.add(btnUpdate);
        centerPanel.add(btnDelete);

        southPanel.add(btnBack);

        btnView.addActionListener(this);
        btnAdd.addActionListener(this);
        btnUpdate.addActionListener(this);
        btnDelete.addActionListener(this);
        btnBack.addActionListener(this);

        this.add(northPanel, BorderLayout.NORTH);
        this.add(centerPanel, BorderLayout.CENTER);
        this.add(southPanel, BorderLayout.SOUTH);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {

            case "Add New Account":
                CreateAccount.main(null);
                this.setVisible(false);
                break;

            case "View Account":
                ViewAccount.main(null);
                this.setVisible(false);
                break;

            case "Delete Account":
                DeleteAccount.main(null);
                this.setVisible(false);
                break;

            case "Update Account":
                UpdateAccount.main(null);
                this.setVisible(false);
                break;

            case "BACK TO MAIN MENU":
                App.main(null);
                this.setVisible(false);
                break;
        }
    }

    public static void main(String[] args) {
        new AccountMenuGUI().setGUI();
    }

}
