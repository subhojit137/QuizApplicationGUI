package firstswingapplication;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class userScore extends JFrame implements ActionListener{
 
    String userName;
    userScore(String userName,int score) {
      this.userName=userName;  
     setBounds(400,150,750,550);
     getContentPane().setBackground(Color.WHITE);
     setLayout(null);
     
     ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
     Image i2=i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
     ImageIcon i3=new ImageIcon(i2);
     JLabel image=new JLabel(i3);
     image.setBounds(0, 200,300,250);
     add(image);
     
     JLabel heading=new JLabel("Thank you "+userName+" for playing..");
     heading.setBounds(45,30,700,30);
     heading.setFont(new Font("Tahoma",Font.PLAIN,26));
     add(heading);
     
     JLabel lblScore=new JLabel("Your Score is "+ score);
     lblScore.setBounds(350,200,300,30);
     lblScore.setFont(new Font("Tahoma",Font.PLAIN,26));
     add(lblScore);
     
     JButton submit=new JButton("Play Again");
     submit.setBounds(400,270,120,30);
     submit.setBackground(Color.BLUE);
     submit.setForeground(Color.WHITE);
     submit.addActionListener(this);
     add(submit);
     
     setVisible(true);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
public void actionPerformed(ActionEvent ae)
{
    setVisible(false);
    new LoginPage();
}
    public static void main(String args[]) {
        new userScore("user",0);
    }
}
