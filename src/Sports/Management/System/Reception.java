package Sports.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {
    Reception(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(280,5,1238,820);
        panel.setBackground(new Color(110,189,230));
        add(panel);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5,5,270,820);
        panel1.setBackground(new Color(110,189,230));
        add(panel1);

        ImageIcon i111 = new ImageIcon(ClassLoader.getSystemResource("icon/Sports.gif"));
        Image i22 = i111.getImage().getScaledInstance(600,400, Image.SCALE_DEFAULT);
        ImageIcon imageIcon111 = new ImageIcon(i22);
        JLabel label11 = new JLabel(imageIcon111);
        label11.setBounds(300,20,800,800);
        panel.add(label11);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/admin Logo.gif"));
        Image i2 = i11.getImage().getScaledInstance(250,250, Image.SCALE_DEFAULT);
        ImageIcon imageIcon11 = new ImageIcon(i2);
        JLabel label1 = new JLabel(imageIcon11);
        label1.setBounds(5,530,250,250);
        panel1.add(label1);

        JButton btnNCF = new JButton("New Player Form");
        btnNCF.setBounds(30,70,200,30);
        btnNCF.setBackground(Color.BLACK);
        btnNCF.setForeground(Color.WHITE);
        panel1.add(btnNCF);
        btnNCF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new NewPlayer();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnDepartment = new JButton("Department");
        btnDepartment.setBounds(30,110,200,30);
        btnDepartment.setBackground(Color.BLACK);
        btnDepartment.setForeground(Color.WHITE);
        panel1.add(btnDepartment);
        btnDepartment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Department();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnAEI = new JButton("All Employee Info");
        btnAEI.setBounds(30,150,200,30);
        btnAEI.setBackground(Color.BLACK);
        btnAEI.setForeground(Color.WHITE);
        panel1.add(btnAEI);
        btnAEI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Employee();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnCI = new JButton("Player Info");
        btnCI.setBounds(30,190,200,30);
        btnCI.setBackground(Color.BLACK);
        btnCI.setForeground(Color.WHITE);
        panel1.add(btnCI);
        btnCI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Player_Info();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnMI = new JButton("Manager Info");
        btnMI.setBounds(30,230,200,30);
        btnMI.setBackground(Color.BLACK);
        btnMI.setForeground(Color.WHITE);
        panel1.add(btnMI);
        btnMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new ManagerInfo();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnCO = new JButton("Withdraw");
        btnCO.setBounds(30,270,200,30);
        btnCO.setBackground(Color.BLACK);
        btnCO.setForeground(Color.WHITE);
        panel1.add(btnCO);
        btnCO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Withdraw();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnUC = new JButton("Update Player Details");
        btnUC.setBounds(30,310,200,30);
        btnUC.setBackground(Color.BLACK);
        btnUC.setForeground(Color.WHITE);
        panel1.add(btnUC);
        btnUC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new UpdateCheck();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnPUS = new JButton("Equipment Details");
        btnPUS.setBounds(30,350,200,30);
        btnPUS.setBackground(Color.BLACK);
        btnPUS.setForeground(Color.WHITE);
        panel1.add(btnPUS);
        btnPUS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Equipment_Details();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton logout = new JButton("Logout");
        logout.setBounds(30,470,95,30);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        panel1.add(logout);
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    System.exit(500);
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton back = new JButton("Back");
        back.setBounds(140,470,95,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel1.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    setVisible(false);
                    new Dashboard();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(1950,1090);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Reception();
    }
}
