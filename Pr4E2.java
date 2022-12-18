import java.awt.*;
import javax.swing.*;
public class Pr4E2 extends JFrame {
    Pr4E2()
    {
        setBackground(Color.cyan);
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gbl);
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridx=0;
        gbc.gridy=0;
        JButton b1 = new JButton("Python");
        add(b1,gbc);
        gbc.gridx=1;
        gbc.gridy=0;
        Button b2 = new Button("JS");
        add(b2,gbc);
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.ipady=20;
        gbc.gridx=0;
        gbc.gridy=1;
        Button b3 = new Button("CSS");
        add(b3,gbc);
        gbc.gridx=1;
        gbc.gridy=1;
        Button b4 = new Button("Android");
        add(b4,gbc);
        gbc.gridx=0;
        gbc.gridy=2;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.gridwidth=2;
        Button b5 = new Button("PHP");
        add(b5);
        setSize(300,300);
        setPreferredSize(getSize());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }

    public static void main(String a[])
    {
        Pr4E2 p4 = new Pr4E2();
        p4.setSize(400,400);
        p4.setVisible(true);
        p4.setTitle("Gird Bag Layout ");
        p4.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
