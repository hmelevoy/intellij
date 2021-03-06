package main.java.mainPackage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static class TestActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Привет");
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        int sizeWidth = 1200;
        int sizeHeight = 800;
        int locationX = (sizeWidth-600) / 2;
        int locationY = (sizeHeight-600) / 2;
        frame.setBounds(locationX, locationY, 200, 200);
        JPanel contents = new JPanel();
        ActionListener actionListener = new TestActionListener();
        JButton button1 = new JButton("Button 1");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        frame.setContentPane(contents);
        contents.add(button1);
        JButton button2 = new JButton("Button 2");
        contents.add(button2);
        frame.setVisible(true);
        JOptionPane.showMessageDialog(null, "Hello");

    }
}
