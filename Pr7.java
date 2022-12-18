import javax.swing.*;
import java.awt.*;
import javax.swing.tree.*;
import java.util.Vector;
public class Pr7 extends JFrame{
    Pr7()
    {
    setVisible(true);
        setSize(400,400);
        Container c = getContentPane();
        // Pc 
        c.setLayout(new FlowLayout());
        DefaultMutableTreeNode india = new DefaultMutableTreeNode("India");
        DefaultMutableTreeNode mah = new DefaultMutableTreeNode("Maharstra");
        DefaultMutableTreeNode Mumbai = new DefaultMutableTreeNode("Mumbai");
        DefaultMutableTreeNode Nagpur = new DefaultMutableTreeNode("Nagpur");
        DefaultMutableTreeNode Pune = new DefaultMutableTreeNode("Pune");
        DefaultMutableTreeNode Nashik = new DefaultMutableTreeNode("Nashik");
        // Object Mah[] = {Mumbai,Nagpur,Pune,Nashik};
        DefaultMutableTreeNode Gujrath = new DefaultMutableTreeNode("Gujrath");
        
        india.add(mah);india.add(Gujrath);
        mah.add(Mumbai);mah.add(Nagpur);mah.add(Pune);mah.add(Nashik);
        JTree RootTree = new JTree(india);
        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
        JScrollPane jsp = new JScrollPane(RootTree,v,h);
        c.add(jsp);


        // EX 1
        Vector Desktop = new Vector();

        DefaultMutableTreeNode ThisPc = new DefaultMutableTreeNode("This PC");
        DefaultMutableTreeNode s1 = new DefaultMutableTreeNode("Local Disk C");
        DefaultMutableTreeNode s2 = new DefaultMutableTreeNode("Local Disk D");
        DefaultMutableTreeNode s3 = new DefaultMutableTreeNode("Documents");
        DefaultMutableTreeNode s4 = new DefaultMutableTreeNode("Downloads");
        ThisPc.add(s1);
        ThisPc.add(s2);
        ThisPc.add(s3);
        ThisPc.add(s4);
        
        DefaultMutableTreeNode Libraries = new DefaultMutableTreeNode("Libraries");
        DefaultMutableTreeNode s5 = new DefaultMutableTreeNode("Music");
        DefaultMutableTreeNode s6 = new DefaultMutableTreeNode("Pictures");
        DefaultMutableTreeNode s7 = new DefaultMutableTreeNode("Saved Pictures");
        DefaultMutableTreeNode s8 = new DefaultMutableTreeNode("Videos");
        Libraries.add(s5);
        Libraries.add(s6);
        Libraries.add(s7);
        Libraries.add(s5);
       
        DefaultMutableTreeNode Network= new DefaultMutableTreeNode("Network");
        DefaultMutableTreeNode s9 = new DefaultMutableTreeNode("192.168.61.11");
        Network.add(s9);

        Desktop.add(ThisPc);
        Desktop.add(Libraries);
        Desktop.add(Network);
        

        JTree jt = new JTree(Desktop);
        int v1 = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
        int h1 = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
        JScrollPane jsp1 = new JScrollPane(jt,v1,h1);
                getContentPane().add(jsp1,v1,h1);     
    }
    public static void main(String a[])
    {
        new Pr7();
    }
}