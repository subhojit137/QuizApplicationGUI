package firstswingapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener {

    JButton next, submit, lifeline;
    String question[][] = new String[15][5];    // Here i am using 2D Array for storing my questions and answer...
    String answer[][] = new String[15][1];
    String userAnswer[][] = new String[15][1];
    JLabel qno, questions;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupOptions;
    public static int timer = 15;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;
    String userName;

    Quiz(String userName) {
        super("Quiz Started...");
        this.userName=userName;
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
        JLabel image = new JLabel(i2);
        image.setBounds(0, 0, 1440, 392);
        add(image);

        qno = new JLabel();         // Question number creation..it will increase dynamically
        qno.setBounds(100, 450, 50, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(qno);

        questions = new JLabel();
        questions.setBounds(150, 450, 900, 30);
        questions.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(questions);

        question[0][0] = "Which one is platfrom independent programming language?";
        question[0][1] = "Java.";
        question[0][2] = "C++.";
        question[0][3] = "C lang.";
        question[0][4] = "None of above.";

        question[1][0] = "Which one is use to find and fix bugs in the java programs?";
        question[1][1] = "JVM.";
        question[1][2] = "JDK.";
        question[1][3] = "JRE.";
        question[1][4] = "JDB.";

        question[2][0] = "An Interface with no fields or methods is known as?";
        question[2][1] = "Runnable Interface.";
        question[2][2] = "Marker Interface.";
        question[2][3] = "Abstract Interface.";
        question[2][4] = "Consequence Interface.";

        question[3][0] = "Abstract is  used for acheiving?";
        question[3][1] = "Polymorphism.";
        question[3][2] = "Inheritance";
        question[3][3] = "Both";
        question[3][4] = "None of above.";

        question[4][0] = "Which one is the mutable class in java?";
        question[4][1] = "java.lang.String.";
        question[4][2] = "java.lang.Byte.";
        question[4][3] = "java.lang.StringBuilder.";
        question[4][4] = "java.lang.Short.";

        question[5][0] = "Which of the following option leads to the the portability and security of java?";
        question[5][1] = "Dynamic binding between objects.";
        question[5][2] = "The applet makes java code secure and potable.";
        question[5][3] = "Byte code is executed by java.";
        question[5][4] = "Use of Exception handling.";

        question[6][0] = "What is the return type of the hashcode() method in the object class?";
        question[6][1] = "int";
        question[6][2] = "Object";
        question[6][3] = "long";
        question[6][4] = "void.";

        question[7][0] = "When a recursive function will pass parameter as a recursive call the it will be?";
        question[7][1] = "Tree Recursion.";
        question[7][2] = "Nested Recursion.";
        question[7][3] = "Indirect Recursion.";
        question[7][4] = "Head Recursion.";

        question[8][0] = " Which one of the following is more time consuming operation?";
        question[8][1] = "inserting an element before head in a Singly LinkedList.";
        question[8][2] = "inserting an element before head in a Doubly Circular LinkedList.";
        question[8][3] = "inserting an element before head in a Singly Circular LinkedList";
        question[8][4] = "All of above take same amount of time.";

        question[9][0] = "Parenthesis matching application is a application of?";
        question[9][1] = "Queue.";
        question[9][2] = "Stack";
        question[9][3] = "Array";
        question[9][4] = "LinkedList.";

        question[10][0] = "What is the PostFix form of '-a+b*logn!'?";
        question[10][1] = "a-bnlog*!+";
        question[10][2] = "a-bn!log*+";
        question[10][3] = "a+b-n*log!";
        question[10][4] = "a-b+logn*!.";

        question[11][0] = "Which traversal gives us an sorted order of elements in Binary Seach Tree?";
        question[11][1] = "PreOrder.";
        question[11][2] = "InOrder";
        question[11][3] = "PostOrder";
        question[11][4] = "LevelOrder.";

        question[12][0] = "Associativity and Precedure are meant for?";
        question[12][1] = "which one is executing first.";
        question[12][2] = "parenthesisation.";
        question[12][3] = "both.";
        question[12][4] = "None of above.";

        question[13][0] = "In TCP/IP model http(hyper text transfer protocol) belongs from?";
        question[13][1] = "Network Access Layer.";
        question[13][2] = "Transport Layer.";
        question[13][3] = "Application Layer.";
        question[13][4] = "Network Layer.";

        question[14][0] = "Which one of the following is not a Data Description Language?";
        question[14][1] = "Create.";
        question[14][2] = "Rename.";
        question[14][3] = "Alter.";
        question[14][4] = "Update.";

        answer[0][0] = "Java.";
        answer[1][0] = "JDB.";
        answer[2][0] = "Marker Interface.";
        answer[3][0] = "Both";
        answer[4][0] = "java.lang.StringBuilder.";
        answer[5][0] = "Byte code is executed by java.";
        answer[6][0] = "int";
        answer[7][0] = "Nested Recursion.";
        answer[8][0] = "inserting an element before head in a Singly Circular LinkedList";
        answer[9][0] = "Stack";
        answer[10][0] = "a-bn!log*+";
        answer[11][0] = "InOrder";
        answer[12][0] = "parenthesisation.";
        answer[13][0] = "Application Layer.";
        answer[14][0] = "Update.";

        opt1 = new JRadioButton();       // Creating option button..
        opt1.setBounds(150, 500, 900, 25);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt1.setBackground(Color.WHITE);
        add(opt1);
        opt2 = new JRadioButton();
        opt2.setBounds(150, 530, 900, 25);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt2.setBackground(Color.WHITE);
        add(opt2);
        opt3 = new JRadioButton();
        opt3.setBounds(150, 560, 900, 25);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt3.setBackground(Color.WHITE);
        add(opt3);
        opt4 = new JRadioButton();
        opt4.setBounds(150, 590, 900, 25);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt4.setBackground(Color.WHITE);
        add(opt4);

        groupOptions = new ButtonGroup();  //now we can select any one radio button at a time....
        groupOptions.add(opt1);
        groupOptions.add(opt2);
        groupOptions.add(opt3);
        groupOptions.add(opt4);

        next = new JButton("NEXT");                                                // Adding 3 buttons for acccess....
        next.setBounds(1100, 500, 150, 40);
        next.setFont(new Font("Tahoma", Font.PLAIN, 15));
        next.setBackground(Color.BLUE);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        lifeline = new JButton("50-50 LifeLine");
        lifeline.setBounds(1100, 560, 150, 40);
        lifeline.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lifeline.setBackground(Color.BLUE);
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this);
        add(lifeline);
        submit = new JButton("SUBMIT");
        submit.setBounds(1100, 620, 150, 40);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 15));
        submit.setBackground(Color.BLUE);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);

        setBounds(0, 0, 1440, 850);
        start(count);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) // Setting the actions performed in buttons
    {
        if (ae.getSource() == next) {                         // What happen when next button clicked
            repaint();
            ans_given = 1;
            if (groupOptions.getSelection() == null) {
                userAnswer[count][0] = "";
            } else {
                userAnswer[count][0] = groupOptions.getSelection().getActionCommand();
            }
            if (count == 13) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            count += 1;
            start(count);
        }
        if (ae.getSource() == lifeline) {                             // What happen when lifeline button clicked

        } else if (ae.getSource() == submit) {                // What happen when submit button clicked
            if (groupOptions.getSelection() == null) {
                userAnswer[count][0] = "";
            } else {
                userAnswer[count][0] = groupOptions.getSelection().getActionCommand();
            }
            for (int i = 0; i < userAnswer.length; i++) {
                if (userAnswer[i][0].equals(answer[i][0])) {
                    score += 1;
                }
            }
            setVisible(false);
            new userScore(userName,score);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        String time = "Time left: " + timer + " seconds";
        g.setColor(Color.red);
        g.setFont(new Font("Tahoma", Font.BOLD, 15));
        if (timer > 0) {
            g.drawString(time, 1100, 500);
        } else {
            g.drawString("Times up!!", 1100, 500);
        }
        timer -= 1;
        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (ans_given == 1) {
            ans_given = 0;
            timer = 15;
        } else if (timer < 0) {
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            if (count == 13) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 14) {
                if (groupOptions.getSelection() == null) {
                    userAnswer[count][0] = "";
                } else {
                    userAnswer[count][0] = groupOptions.getSelection().getActionCommand();
                }
                for (int i = 0; i < userAnswer.length; i++) {
                    if (userAnswer[i][0].equals(answer[i][0])) {
                        score += 1;
                    }
                }
                setVisible(false);
                new userScore(userName,score);
            } else {
                if (groupOptions.getSelection() == null) {
                    userAnswer[count][0] = "";
                } else {
                    userAnswer[count][0] = groupOptions.getSelection().getActionCommand();
                }
                count += 1;
                start(count);
            }
        }

    }

    public void start(int count) {
        qno.setText("" + (count + 1) + ". ");
        questions.setText(question[count][0]);
        opt1.setText(question[count][1]);
        opt1.setActionCommand(question[count][1]);
        opt2.setText(question[count][2]);
        opt2.setActionCommand(question[count][2]);
        opt3.setText(question[count][3]);
        opt3.setActionCommand(question[count][3]);
        opt4.setText(question[count][4]);
        opt4.setActionCommand(question[count][4]);
        groupOptions.clearSelection();
    }

    public static void main(String args[]) {
        new Quiz("user");
    }
}
