/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package billing;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author HP
 */
public class Home2 extends JFrame {
   Home2()
   {
//       setVisible(true);
//       setExtendedState(JFrame.MAXIMIZED_BOTH);
//       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("add.png"));
//        Image i2 = i1.getImage().getScaledInstance(1550, 850, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        add(image);
       setVisible(true);
     setExtendedState(JFrame.MAXIMIZED_BOTH);
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("add.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 850, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
   }
    
    public static void main(String args[])
    {
       Home2 h1= new Home2();
    }
    
}
