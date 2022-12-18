import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Pr18 extends JFrame{
    Pr18() throws ClassNotFoundException, SQLException {
        JLabel l = new JLabel();
        setLayout(new GridLayout(0,1));
        setVisible(true);
        setSize(500, 500);
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        String url = "jdbc:ucanaccess://D:/MY USERS/Aditya/IF5I/Adv Java/Adv_Java_V/Unit 5/Aditya1.accdb";
        Connection c = DriverManager.getConnection(url);
        PreparedStatement p1 = c.prepareStatement("insert into Table1 values(?,?)");
        PreparedStatement p2 = c.prepareStatement("update Table1 set password=? where  Username=?");
        PreparedStatement p3 = c.prepareStatement("select * from Table1");
        Statement s = c.createStatement();
        // int res = s.executeUpdate("insert into table1 values('ak','u1')");
        
        JTextField f1 = new JTextField("                                    ");
        JTextField f2 = new JTextField("                                    ");
        JTextField f3 = new JTextField("                                    ");
        JButton b1 = new JButton("Insert");
        JButton b2 = new JButton("Update");
        JButton b3 = new JButton("Show");

        add(l);
        add(b1);
        add(f1);
        add(f2);
        add(b1);
        add(b2);
        add(b3);
        add(f3);
        b1.addActionListener(new ActionListener() {
          @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String str1 = f1.getText();
                String str2 = f2.getText();
                try {
                    p1.setString(1, str1);
                    p1.setString(2, str2);
                    int res = p1.executeUpdate();
                    l.setText("Rows Affected : " + res);
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                
            }
        });
        b2.addActionListener(new ActionListener() {
          @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String str1 = f1.getText();
                String str2 = f2.getText();
                try {
                    p2.setString(1, str2);
                    p2.setString(2, str1);
                    int res = p2.executeUpdate();
                    l.setText("Rows Affected : " + res);
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        b3.addActionListener(new ActionListener() {
          @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                try {
                    ResultSet r = p3.executeQuery();
                    while(r.next())
                    {
                   }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        

        
    }

    public static void main(String a[]) throws ClassNotFoundException, SQLException {
        new Pr18();
    }
}