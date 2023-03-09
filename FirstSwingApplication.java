package firstswingapplication;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class LoginPage extends JFrame implements ActionListener {

    JButton start, back;
    JTextField tfname;

    LoginPage() {
        super("Welcome!");
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 900, 800);
        add(image);

        JLabel heading = new JLabel("Simple Programming Minds!");
        heading.setBounds(920, 200, 500, 50);
        heading.setFont((new Font("Viner Hand ITC", Font.BOLD, 35)));
        heading.setForeground(Color.BLACK);
        add(heading);

        JLabel name = new JLabel("Enter your  name:");
        name.setBounds(1000, 300, 300, 40);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 30));
        name.setForeground(Color.BLACK);
        add(name);

        tfname = new JTextField();
        tfname.setBounds(1000, 360, 350, 40);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 25));
        tfname.setForeground(Color.BLACK);
        add(tfname);

        start = new JButton("Start");
        start.setBounds(1000, 420, 100, 30);
        start.setBackground(Color.BLUE);
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        back = new JButton("Back");
        back.setBounds(1250, 420, 100, 30);
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        setBounds(0, 0, 1440, 850);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz("user");
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }
}

public class FirstSwingApplication {

    public static void main(String[] args) {
        new LoginPage();

    }

}
