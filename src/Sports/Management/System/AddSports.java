package Sports.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddSports extends JFrame implements ActionListener {
    JTextField t2,t4;
    JComboBox t3,t5,t6;
    JButton b1,b2;
    AddSports(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,875,490);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JLabel l1 = new JLabel("Add Sports");
        l1.setBounds(194,10,160,22);
        l1.setFont(new Font("Tahoma", Font.BOLD,22));
        l1.setForeground(Color.WHITE);
        panel.add(l1);

        JLabel l2 = new JLabel("Sports Name");
        l2.setBounds(64,110,152,22);
        l2.setFont(new Font("Tahoma", Font.BOLD, 14));
        l2.setForeground(Color.WHITE);
        panel.add(l2);
        t2 =new JTextField();
        t2.setBounds(200,110,156,20);
        t2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t2.setForeground(Color.WHITE);
        t2.setBackground(new Color(16,108,115));
        panel.add(t2);


        JLabel l4 = new JLabel("Price");
        l4.setBounds(64,150,152,22);
        l4.setFont(new Font("Tahoma", Font.BOLD, 14));
        l4.setForeground(Color.WHITE);
        panel.add(l4);

        t4 =new JTextField();
        t4.setBounds(200,150,156,20);
        t4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t4.setForeground(Color.WHITE);
        t4.setBackground(new Color(16,108,115));
        panel.add(t4);


        JLabel l5 = new JLabel("Status");
        l5.setBounds(64,190,152,22);
        l5.setFont(new Font("Tahoma", Font.BOLD, 14));
        l5.setForeground(Color.WHITE);
        panel.add(l5);

        t5 =new JComboBox(new String[]{"Available", "Unavailable"});
        t5.setBounds(200,190,156,20);
        t5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t5.setForeground(Color.WHITE);
        t5.setBackground(new Color(16,108,115));
        panel.add(t5);


        b1 = new JButton("Add");
        b1.setBounds(64,321,111,33);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        panel.add(b1);

        b2 = new JButton("Back");
        b2.setBounds(198,321,111,33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        panel.add(b2);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/pngwing.com (4).png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500,60,300,300);
        panel.add(label);



        setUndecorated(true);
        setLocation(20,200);
        setLayout(null);
        setSize(885,500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1){
            try{
                connection c = new connection();
                String sports = t2.getText();
//                String ava = (String) t3.getSelectedItem();
                String status = (String)  t5.getSelectedItem();
                String price = t4.getText();
//                String type =  (String) t6.getSelectedItem();

                String q = "insert into sports values('"+sports+"', '"+status+"', '"+price+"')";
                c.statement.executeUpdate(q);

                JOptionPane.showMessageDialog(null,"Sports Successfully Added");
                setVisible(false);

            }catch (Exception E){
                E.printStackTrace();
            }
        }else {
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new AddSports();
    }
}
