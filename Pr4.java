import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Pr4 extends JFrame implements ActionListener{
    CardLayout cl;
    Container c;
    JButton b1,b2,b3;
    Pr4()
    {
        cl = new CardLayout();
        c = getContentPane();
        setLayout(cl);
        b1 = new JButton("Apple");
        b2 = new JButton("Boy");
        b3 = new JButton("Cat");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        c.add(b1);c.add(b2);c.add(b3);

    }
    public void actionPerformed(ActionEvent ae)
    {
        cl.next(c);
    }
    public static void main(String a[])
    {
        Pr4 p4 = new Pr4();
        p4.setVisible(true);
        p4.setSize(300,300);
        p4.setVisible(true);
        p4.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}