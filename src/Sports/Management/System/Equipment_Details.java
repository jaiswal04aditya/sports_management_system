package Sports.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Equipment_Details extends JFrame {
    Equipment_Details(){

        JPanel panel = new JPanel();
        panel.setBackground(new Color(3,45,48));
        panel.setBounds(5,5,790,590);
        panel.setLayout(null);
        add(panel);

        JLabel pus = new JLabel("Equipment Details");
        pus.setBounds(90,11,200,25);
        pus.setForeground(Color.WHITE);
        pus.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel.add(pus);

        JLabel TOC = new JLabel("Sports Field");
        TOC.setBounds(32,97,89,14);
        TOC.setForeground(Color.WHITE);
        TOC.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(TOC);

        Choice c = new Choice();
        c.setBounds(123,94,150,25);
        panel.add(c);

        try{
            connection C = new connection();
            ResultSet resultSet = C.statement.executeQuery("select * from equipment");
            while (resultSet.next()){
                c.add(resultSet.getString("spfield"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        JTable table = new JTable();
        table.setBounds(10,233,800,250);
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try{
            connection C = new connection();
            String q = "select * from equipment";
            ResultSet resultSet = C.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            e.printStackTrace();
        }

        JLabel name = new JLabel("Equipment Name");
        name.setBounds(20,208,100,14);
        name.setForeground(Color.WHITE);
        panel.add(name);

        JLabel age = new JLabel("No. of Items");
        age.setBounds(175,208,100,14);
        age.setForeground(Color.WHITE);
        panel.add(age);


        JLabel company = new JLabel("Company");
        company.setBounds(500,208,100,14);
        company.setForeground(Color.WHITE);
        panel.add(company);

        JLabel Carname = new JLabel("Sports Category");
        Carname.setBounds(660,208,100,14);
        Carname.setForeground(Color.WHITE);
        panel.add(Carname);


        JLabel loacation = new JLabel("Price");
        loacation.setBounds(345,208,100,14);
        loacation.setForeground(Color.WHITE);
        panel.add(loacation);

        JButton display = new JButton("Display");
        display.setBounds(200,500,120,30);
        display.setBackground(Color.BLACK);
        display.setForeground(Color.WHITE);
        panel.add(display);
        display.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String q = "select * from equipment where spfield = '"+c.getSelectedItem()+"'";
                try{
                    connection c = new connection();
                    ResultSet resultSet = c.statement.executeQuery(q);
                    table.setModel(DbUtils.resultSetToTableModel(resultSet));
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });



        JButton Back = new JButton("Back");
        Back.setBounds(420,500,120,30);
        Back.setBackground(Color.BLACK);
        Back.setForeground(Color.WHITE);
        panel.add(Back);
        Back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });


        setLayout(null);
        setSize(800,600);
        setLocation(500,100);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Equipment_Details();
    }
}

