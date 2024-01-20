package com.practice;

import java.util.Date;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyWindow extends JFrame {
    private JLabel heading;
    private JLabel clockLabel;
    private Font font = new Font("",Font.BOLD,35);
     MyWindow() {
         super();
         super.setTitle("Digital Clock");
         super.setSize(400, 400);
         super.setLocation(300, 50);
         this.createGUI();
         this.startClock();
         super.setVisible(true);
     }

     public void createGUI()
     {
//         gui
         heading=new JLabel("Digital-Clock");
         clockLabel=new JLabel("clock");

         heading.setFont(font);
         clockLabel.setFont(font);


         this.setLayout(new GridLayout(2,1));
         this.add(heading);
         this.add(clockLabel);


     }
     public void startClock()
     {
       Timer timer=new Timer(1000,new ActionListener()
       {
           public void actionPerformed (ActionEvent e){
               String dateTime = new Date().toLocaleString();
               clockLabel.setText(dateTime);
           }
       });
       timer.start();
     }
}


// This code of Digital clock has made by Dhiraj Kumar Chougale
