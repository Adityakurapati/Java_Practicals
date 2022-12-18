import javax.swing.*;
import java.awt.*;
class Pr8 extends JFrame
{
    Pr8()
    {
        setVisible(true);
        setSize(400,400);
        Container c= getContentPane();
        c.setLayout(new FlowLayout());
        Color color = new Color(255,140,0);
        c.setBackground(color);
        String colsHead[] = {"ID","Name","Salary"};
        String data[][] = {
            {"101","Amit","670000"},
            {"102","Jai","780000"},
            {"101","Sachin","700000"}
        };

        JTable jt = new JTable(data,colsHead);
        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
        JScrollPane jsp = new JScrollPane(jt,v,h);
        c.add(jsp);

        // Ex1
        String colsHead2[] = {"Name","Percentage","Grade"};
        JTextField tf = new JTextField();
        String data2[][] = {
            {"Aditya","98.50","A++"},
            {"Shubham","90","A"},
            {"Vinod","90","A+"},
            {"Adarsh","87","A"},
            {"Rohan","87","A"},
            {"Dinesh","88","A"},
            {"Omkar","87","A"},
            {"Pawan","90","A+"},
            {"SAi","86","A"},
            {"Samarth","87","A"},
        };

        JTable jt2 = new JTable(data2,colsHead2);
        
        JScrollPane jsp2 = new JScrollPane(jt2,v,h);
        c.add(jsp2);
    }
    public static void main(String a[])
    {
        new Pr8();
    }

}