import javax.swing.border.LineBorder;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
public class Guigrade {    
       public static void main(String[] args) {       
              // set Frame Layout interface
              JFrame f = new JFrame("Calculator Grade");
    
              // set size layout frame
              f.setSize(500,500);
    
              //show frame  
              f.setVisible(true);     
               // set font style TimesRoman bold size 18
                Font f1 = new Font("TimesRoman", Font.BOLD, 18);
    
                // setText Field
                JTextField FieldName = new JTextField();
                JTextField FieldMidterm = new JTextField();
                JTextField FieldFinal = new JTextField();
                JTextField FieldTotal = new JTextField();
                JTextField FieldGrade = new JTextField();
    
                //set label of textField to frame
              JLabel lname = new JLabel("Name:");
              JLabel lmidterm = new JLabel("Midterm:");
              JLabel lfinal = new JLabel("Final:");
              JLabel lTotal = new JLabel("Total:");
              JLabel lGrade = new JLabel("Grade:");
    
                //show textBox to frame
                FieldName.setBounds(100, 200, 100, 40);  
                FieldMidterm.setBounds(100, 150, 150, 40);  
                FieldFinal.setBounds(100, 250, 100, 40);  
                FieldTotal.setBounds(100, 350, 100, 40);  
                FieldGrade.setBounds(100, 400, 100, 40);  
                
                //set Bounds label
              lname.setBounds(50, 150, 100, 30);    
              lmidterm.setBounds(50, 200, 100, 30);  
              lfinal.setBounds(50, 250, 100, 30);  
              lTotal.setBounds(50, 350, 100, 30);  
              lGrade.setBounds(50, 400, 100, 30);  
              
              // set border line of button 
              LineBorder line = new LineBorder(Color.yellow, 1, true);
              // set Button and initial text Calculated
              JButton btn = new JButton("Calculated");
              //show button
              btn.setBounds(100, 300, 200, 40);
              //set background of button
              btn.setBackground(Color.blue);
              //set color text of button
              btn.setForeground(Color.white);
              //set border of button
              btn.setBorder(line);
              // set All Font of frame
              f.setFont(f1);
              // Add field box to frame
              f.add(FieldName);
              f.add(FieldMidterm);
              f.add(FieldFinal);
              f.add(FieldTotal);
              f.add(FieldGrade);
              // add text Label to frame
              f.add(lname);
              f.add(lmidterm);
              f.add(lfinal);  
              f.add(lTotal);  
              f.add(lGrade);  
              // add Button to frame
              f.add(btn);
    
              // set frame can exit 
              f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
       }    
  }