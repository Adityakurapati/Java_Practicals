import java.awt.*;
import javax.swing.*;

import org.omg.SendingContext.RunTime;

import java.awt.event.*;

public class Pr12 extends JFrame implements ActionListener{
    JPasswordField jpf1;
    Pr12() {
        setVisible(true);
        setSize(500, 500);
        Container c = getContentPane();
        c.setBackground(Color.cyan);
        c.setLayout(null);
        JLabel label = new JLabel("Enter Your Password");
        label.setBounds(40,40,100,30);
        jpf1 = new JPasswordField("Enter Password",8);
        jpf1.setBounds(40,90,180,30);
        jpf1.setEchoChar('#');
        c.add(label);c.add(jpf1);
        jpf1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        if(jpf1.getText().equals("Ak14")){

            JOptionPane.showMessageDialog(this, "Login Success");
        }
        else{
            JOptionPane.showMessageDialog(this, "Login Denied");

        }
        
    }
    public static void main(String a[]){
        new Pr12();
    }

}
