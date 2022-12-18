import java.sql.*;
import java.sql.SQLException;

class Pr18A {
    public static void main(String a[]) {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String url = "jdbc:ucanaccess://D:/MY USERS/Aditya/IF5I/Adv Java/Adv_Java_V/Unit 5/Database7.accdb";
            Connection c = DriverManager.getConnection(url);
            PreparedStatement p = c.prepareStatement("create table emp(empid number,ename varchar(10))");
            int k = p.executeUpdate();
            System.out.println("Rows" + k);
            PreparedStatement p2 = c.prepareStatement("insert into emp value(?,?)");
            p2.setInt(1, 12);
            p2.setString(2, "Aditya");
            int k2 = p2.executeUpdate();
            System.out.println("Inserted " + k2);

            PreparedStatement p3 = c.prepareStatement("select * from emp where empid>14");
            ResultSet rs = p3.executeQuery();
            while (rs.next()) {
                System.out.println("Data " + rs.getInt(1) + "    " + rs.getString(2));
            }
        } catch (Exception e) {
        }
    }
}
