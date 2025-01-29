package Sports.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addEquipments extends JFrame implements ActionListener {
    JTextField nameText, ageText,carCText,carNText,locText;
    JComboBox comboBox, comboBox1;
    JButton add, back;
    addEquipments(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,490);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JLabel label = new JLabel("ADD EQUIPMENTS");
        label.setBounds(194,10,250,22);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Tahoma", Font.BOLD, 22));
        panel.add(label);

        JLabel name = new JLabel("EQUIPMENT");
        name.setBounds(64,70,102,22);
        name.setFont(new Font("Tahoma", Font.BOLD,14));
        name.setForeground(Color.WHITE);
        panel.add(name);
        nameText = new JTextField();
        nameText.setBounds(190,70,156,20);
        nameText.setForeground(Color.WHITE);
        nameText.setFont(new Font("Tahoma",Font.BOLD,14));
        nameText.setBackground(new Color(16,108,115));
        panel.add(nameText);

        JLabel age = new JLabel("NO. OF ITEMS");
        age.setBounds(64,110,102,22);
        age.setFont(new Font("Tahoma", Font.BOLD,14));
        age.setForeground(Color.WHITE);
        panel.add(age);
        ageText = new JTextField();
        ageText.setBounds(190,110,156,20);
        ageText.setForeground(Color.WHITE);
        ageText.setFont(new Font("Tahoma",Font.BOLD,14));
        ageText.setBackground(new Color(16,108,115));
        panel.add(ageText);


        JLabel carC = new JLabel("COMPANY NAME");
        carC.setBounds(64,190,140,22);
        carC.setFont(new Font("Tahoma", Font.BOLD,14));
        carC.setForeground(Color.WHITE);
        panel.add(carC);
        carCText = new JTextField();
        carCText.setBounds(190,190,156,20);
        carCText.setForeground(Color.WHITE);
        carCText.setFont(new Font("Tahoma",Font.BOLD,14));
        carCText.setBackground(new Color(16,108,115));
        panel.add(carCText);

        JLabel carN = new JLabel("SPORTS FIELD");
        carN.setBounds(64,230,140,22);
        carN.setFont(new Font("Tahoma", Font.BOLD,14));
        carN.setForeground(Color.WHITE);
        panel.add(carN);
        carNText = new JTextField();
        carNText.setBounds(190,230,156,20);
        carNText.setForeground(Color.WHITE);
        carNText.setFont(new Font("Tahoma",Font.BOLD,14));
        carNText.setBackground(new Color(16,108,115));
        panel.add(carNText);

        JLabel loc = new JLabel("PRICE");
        loc.setBounds(64,150,102,22);
        loc.setFont(new Font("Tahoma", Font.BOLD,14));
        loc.setForeground(Color.WHITE);
        panel.add(loc);
        locText = new JTextField();
        locText.setBounds(190,150,156,20);
        locText.setForeground(Color.WHITE);
        locText.setFont(new Font("Tahoma",Font.BOLD,14));
        locText.setBackground(new Color(16,108,115));
        panel.add(locText);

        add = new JButton("ADD");
        add.setBounds(64,380,111,33);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("BACK");
        back.setBounds(198,380,111,33);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        panel.add(back);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/sports-equipment-and-gear.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label1 = new JLabel(imageIcon1);
        label1.setBounds(500,60,300,300);
        panel.add(label1);

        setUndecorated(true);
        setLocation(20,200);
        setLayout(null);
        setSize(900,500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add){
            String name = nameText.getText();
            String noofitems = ageText.getText();
//            String gender = (String) comboBox.getSelectedItem();
            String company = carCText.getText();
            String spfield = carNText.getText();
//            String available =(String)  comboBox1.getSelectedItem();
            String price = locText.getText();

            try{
                connection c = new connection();
                String q = "insert into equipment values('"+name+"','"+noofitems+"', '"+price+"', '"+company+"', '"+spfield+"')";
                c.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Equipment Added");
                setVisible(false);

            }catch (Exception E){
                E.printStackTrace();
            }

        }else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new addEquipments();
    }
}
