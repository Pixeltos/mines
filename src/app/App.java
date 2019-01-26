package app;

import javax.swing.*;
import java.awt.event.*;

import board.board;


public class App implements ActionListener {
    //init frames and buttons
    JButton start;
    JFrame home;

    public static void main(String[] args) {
        App gui = new App();
        gui.menu();
    }

    public void menu() {
        App board = new App();
        
        //Init Vars
    
        //Create Objects
        home = new JFrame();
        start = new JButton("Start");
        
        //Code is here
        start.addActionListener(this);

        //Define Frame Layout
        home.getContentPane().add(start);
        home.setSize(800,800);
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        home.setVisible(false);
        board.game();
    }
}