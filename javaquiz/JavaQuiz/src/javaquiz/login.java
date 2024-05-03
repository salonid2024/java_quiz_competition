package javaquiz;

import javax.swing.*;
import java.awt.*;

public class login extends JFrame{
    
    login() {
        
        setLayout(null);
        
       JLabel background;
      
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Photos/2.jpg"));
      JLabel image = new JLabel(i1);
      add(image);       
        
        setSize(1200,600);
        setLocation(100,100);
        
        
        
        
        setVisible(true);
        
        
        
        
        
        
        
        
    }
    
    public static void main(String[] args){
            new login();
    }
}
