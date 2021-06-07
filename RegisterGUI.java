package za.ac.cput.UI;

import za.ac.cput.UI.CustomUI.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterGUI extends JFrame implements ActionListener {
    private JPanel panelWest, panelCenter;
    private JLabel lblTitle, lblFullName, lblDOB, lblEmail, lblNumber, lblAddress, lblFoodPreference, lblPassword, lblConfirmPassword;
    private RoundJTextField txtFullName, txtDOB, txtEmail, txtNumber, txtAddress, txtFoodPreference, txtPassword, txtConfirmPassword;
    private RoundJButton btnCreateAccount;
    private Color colorBackground, colorButton;

    public RegisterGUI() {
        super("Register System");

        colorBackground = new Color(255,244,244);
        colorButton = new Color(23, 186, 75);

        //Title
        lblTitle = new JLabel("Sign Up");
        lblTitle.setFont(new Font("Serif", Font.PLAIN, 28));
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);

        //Headings
        lblFullName = new JLabel("Full Name");
        lblFullName.setHorizontalAlignment(SwingConstants.CENTER);
        lblDOB = new JLabel("Date Of Birth");
        lblDOB.setHorizontalAlignment(SwingConstants.CENTER);
        lblEmail = new JLabel("Email Address");
        lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
        lblNumber = new JLabel("Contact Number");
        lblNumber.setHorizontalAlignment(SwingConstants.CENTER);
        lblAddress = new JLabel("Address");
        lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
        lblFoodPreference = new JLabel("Food Preference");
        lblFoodPreference.setHorizontalAlignment(SwingConstants.CENTER);
        lblPassword = new JLabel("Password");
        lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
        lblConfirmPassword = new JLabel("Confirm Password");
        lblConfirmPassword.setHorizontalAlignment(SwingConstants.CENTER);

        // Text Fields
        txtFullName = new RoundJTextField(1);
        txtFullName.setHorizontalAlignment(SwingConstants.CENTER);
        txtFullName.setFont(new Font("Serif", Font.PLAIN, 20));

        txtDOB = new RoundJTextField(1);
        txtDOB.setHorizontalAlignment(SwingConstants.CENTER);
        txtDOB.setFont(new Font("Serif", Font.PLAIN, 20));

        txtEmail = new RoundJTextField(1);
        txtEmail.setHorizontalAlignment(SwingConstants.CENTER);
        txtEmail.setFont(new Font("Serif", Font.PLAIN, 20));

        txtNumber = new RoundJTextField(1);
        txtNumber.setHorizontalAlignment(SwingConstants.CENTER);
        txtNumber.setFont(new Font("Serif", Font.PLAIN, 20));

        txtAddress = new RoundJTextField(1);
        txtAddress.setHorizontalAlignment(SwingConstants.CENTER);
        txtAddress.setFont(new Font("Serif", Font.PLAIN, 20));

        txtFoodPreference = new RoundJTextField(1);
        txtFoodPreference.setHorizontalAlignment(SwingConstants.CENTER);
        txtFoodPreference.setFont(new Font("Serif", Font.PLAIN, 20));

        txtPassword = new RoundJTextField(1);
        txtPassword.setHorizontalAlignment(SwingConstants.CENTER);
        txtPassword.setFont(new Font("Serif", Font.PLAIN, 20));

        txtConfirmPassword = new RoundJTextField(1);
        txtConfirmPassword.setHorizontalAlignment(SwingConstants.CENTER);
        txtConfirmPassword.setFont(new Font("Serif", Font.PLAIN, 20));

        //Button
        btnCreateAccount = new RoundJButton("Create Account");
        btnCreateAccount.setBackground(colorButton);

        //Center Panel

        panelWest = new JPanel(new GridLayout(0, 1));
        panelWest.setBorder(BorderFactory.createEmptyBorder(0, 90, 90, 90));
        panelWest.setBackground(Color.WHITE);

        panelWest.add(lblTitle);
        panelWest.add(lblFullName);
        panelWest.add(txtFullName);
        panelWest.add(lblDOB);
        panelWest.add(txtDOB);
        panelWest.add(lblEmail);
        panelWest.add(txtEmail);
        panelWest.add(lblNumber);
        panelWest.add(txtNumber);
        panelWest.add(lblAddress);
        panelWest.add(txtAddress);
        panelWest.add(lblFoodPreference);
        panelWest.add(txtFoodPreference);
        panelWest.add(lblPassword);
        panelWest.add(txtPassword);
        panelWest.add(lblConfirmPassword);
        panelWest.add(txtConfirmPassword);
        panelWest.add(new JLabel());
        panelWest.add(btnCreateAccount);

        //West Panel
        panelCenter = new JPanel(new BorderLayout(0, 1));
        panelCenter.setBackground(Color.WHITE);
        JLabel background;
        ImageIcon iconBackground = new ImageIcon("images/background.png");

        background = new JLabel("",iconBackground,JLabel.CENTER);

        panelCenter.add(background);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(1, 1));
        add(panelCenter, BorderLayout.CENTER);
        add(panelWest, BorderLayout.WEST);
        setTitle("REGISTER SYSTEM ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.WHITE);
        setSize(950, 700);
        setResizable(false);
        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e)
    {

        }
}


