import com.sun.media.sound.WaveFloatFileReader;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Using FlowLayout and Label Output

public class TemperatureConverter {

    public TemperatureConverter() {
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel FLabel = new JLabel("F");
        frame.add(FLabel);
        JTextField fField = new JTextField(10);
        frame.add(fField);
        JButton fButton = new JButton("Convert to C");
        frame.add(fButton);

        JLabel CLabel = new JLabel("C");
        frame.add(CLabel);
        JTextField cField = new JTextField(10);
        frame.add(cField);
        JButton cButton = new JButton("Convert to F");
        frame.add(cButton);

        //Converts to C
        fButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double fDub = Double.parseDouble(fField.getText());
                cField.setText("" + ((fDub - 32) * 5/9));
            }
        });
        //Converts to F
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double cDub = Double.parseDouble(cField.getText());
                fField.setText("" + ((cDub * 9/5) + 32));
            }
        });


        frame.setSize(600, 70);
        frame.setVisible(true);
    }

    public static void main(String args[]){
        TemperatureConverter tc = new TemperatureConverter();
    }
}
