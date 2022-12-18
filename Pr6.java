import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
class Pr6 extends JFrame implements ItemListener{
    JComboBox jcb2;
    // Choise jcb2;
    Pr6(){
        // Pc1
        Container c = getContentPane();
        setVisible(true);
        setSize(400,400);
        c.setLayout(new FlowLayout());
        JComboBox jcb = new JComboBox();
        jcb.addItem("Solapur");
        jcb.addItem("Pune");
        jcb.addItem("Banglore");
        jcb.addItem("Mumbai");
        add(jcb);

        // Ex1 
        Vector v = new Vector(5);
        v.add("Maharastra");
        v.add("Manipur");
        v.add("Banglore");
        v.add("Pune");
        v.add("Kohapur");
        jcb2 = new JComboBox(v);
        // jcb2 = new Choise();
        jcb2.addItemListener(this);

        // jcb.addItemListener(new ItemListener(){
        //     public void itemStateChanged(ItemEvent ie){
        //         String str = jcb.getSelectedItem();
        //         JOptionPane.showMessageDialog("parentComponent", message, title, messageType);
        //     }
        // });
        // c.add(jcb2);

        //Ex2
        int vs = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        JScrollPane jsp = new JScrollPane(jcb2,vs,h);36

        jsp.setSize(120,120);
        c.add(jsp);
        c.setVisible(true);

    }
    public void itemStateChanged(ItemEvent ie)
    {
        String str = jcb2.getSelectedItem().toString();
        JOptionPane.showMessageDialog(this,str);
    }
    public static void main(String a[])
    {
        new Pr6();
    }
}