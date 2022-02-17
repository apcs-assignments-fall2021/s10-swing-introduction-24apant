// List any classmates you talked to about this
// assignment (if any):
//
//
// List any outside sources you looked at (if any):
//
//

import sun.security.util.ByteArrayTagOrder;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorldUser {
    public HelloWorldUser() {
        // 1. Create the frame (the window that will pop up)
        JFrame frame = new JFrame("Hello World");
        frame.setLayout(new BorderLayout());

        // 2. Choose what happens when you click the exit button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 3. Create components and put them in the frame
        JLabel label1 = new JLabel("Please Type In Your Name:");
        frame.add(label1, BorderLayout.NORTH);

        JTextField field1 = new JTextField(10);
        frame.add(field1, BorderLayout.SOUTH);

        JButton button1 = new JButton("Click Here!");
        frame.add(button1, BorderLayout.EAST);

        JLabel label2 = new JLabel();
        frame.add(label2, BorderLayout.CENTER);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                label2.setText("Hi " + field1.getText() + "!");
            }
        });

        // 4. Size the frame
        frame.setSize(300, 300);

        // 5. Show the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        HelloWorldUser h = new HelloWorldUser();
    }
}
