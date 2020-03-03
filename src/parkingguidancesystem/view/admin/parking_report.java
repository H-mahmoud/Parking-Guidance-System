package ParkingGuidanceSystem.view.admin;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;

public class parking_report {
    public void pr(){
    
        JFrame f=new JFrame("Parking Guidance System");
        
        JPanel p1=new JPanel();  
        p1.setBounds(0,0,Integer.MAX_VALUE,100); 
        p1.setBackground(new Color(251, 222, 68));
        p1.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        JLabel l1 = new JLabel("Admin Profile [Parking Report]");
        l1.setBounds(30,0,100,150);
        l1.setFont(new Font("Serif", Font.BOLD, 52));
        l1.setForeground(new Color(40, 51, 74));
        
        JLabel l2=new JLabel("Date (yyyy-mm-dd):");
        l2.setBounds(660, 100 , 900, 500);
        l2.setFont(new Font("", Font.PLAIN, 30));
        l2.setForeground(Color.white);
            
        JTextField t1 = new JTextField(); 
        t1.setBounds(660,380 ,600,65);
        t1.setFont(new Font("", Font.PLAIN, 35));
        t1.setBackground(new Color(108,122,137));
        t1.setForeground(Color.white);
            
        JButton b1 =new JButton();
        JButton b2 =new JButton();
            
            
        b1.setText("View");
        b1.setBounds(460,505,350,80);
        b1.setFont(new Font("", Font.BOLD, 30));
        b1.setBackground(new Color(77, 136, 255));
        b1.setForeground(Color.white);
        
        b2.setText("Back");
        b2.setBounds(1100,505,350,80);
        b2.setFont(new Font("", Font.BOLD, 30));
        b2.setBackground(new Color(246,80,88));
        b2.setForeground(Color.white);
           
        f.add(p1);
        p1.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(b1);
        f.add(b2);
        
        b1.addActionListener((ActionEvent e) -> {
            String date = t1.getText();
            
            UIManager.put("OptionPane.messageFont", new FontUIResource(
            new Font("Verdana", Font.PLAIN, 30) ) );
            UIManager.put("OptionPane.messageForeground", Color.white);
            UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("ARIAL",Font.BOLD,30)));
            UIManager.put("Button.background", new Color(251, 222, 68));
            UIManager.put("OptionPane.minimumSize",new Dimension(550,200)); 
            UIManager.put("OptionPane.background",new ColorUIResource(40, 51, 74));
            UIManager.put("Panel.background",new ColorUIResource(40, 51, 74));
            
            if(!date.isEmpty() && date.matches("[0-9-]+")){
                table_parking_report nk=new table_parking_report();
                nk.vpr(date);
            }
            else JOptionPane.showMessageDialog(f,"Date must be in format yyyy-mm-dd","Alert",JOptionPane.WARNING_MESSAGE); ;
        }); 
            
        b2.addActionListener((ActionEvent e) -> {
              admin h=new admin();
              h.a();
              f.setVisible(false);
        }); 
                        
        Color c=new Color(40, 51, 74);
        f.getContentPane().setBackground(c);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }
}
