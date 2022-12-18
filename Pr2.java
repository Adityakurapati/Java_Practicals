// import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pr2 implements ActionListener {
    Button submit = new Button("Submit");
    Frame f;
    List l1, l2;

    Pr2() {
        f = new Frame("My List ");
        f.setVisible(true);
        f.setSize(400, 400);
        f.setTitle("City List ");
        f.setLayout(new FlowLayout());
        f.setBackground(Color.magenta);
        l1 = new List();
        l1.add("Solapur");
        l1.add("Sangli");
        l1.add("Pune ");
        l1.add("Mumbai");
        l1.add("Delhi");
        l1.add("Pene");
        f.add(l1);

        l2 = new List(3, true);
        l2.add("Lokmat");
        l2.add("Sakal");
        l2.add("Divya Marathi");
        l2.add("Dj ");
        l2.add("Times Of India  ");
        f.add(l2);

        f.add(submit);
        submit.addActionListener(this);
    } 

    public void actionPerformed(ActionEvent ae) {
        Dialog d = new Dialog(f, "Cities", false);
        d.setVisible(true);
        d.setSize(200, 200);
        d.setLayout(new FlowLayout());
        d.setBackground(Color.orange);
        Label lb1 = new Label();
        Label lb2 = new Label();
        lb1.setText("Your City Is " + l1.getSelectedItem());
        String[] str = l2.getSelectedItems();
        String s = java.util.Arrays.toString(str);
        lb2.setText("Your News Papers Is " + s);
        d.add(lb1);
        d.add(lb2);

    }

    public static void main(String a[]) {
        new Pr2();

    }

}
