import java.awt.LayoutManager;
import java.net.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextPane;

// import java.io.*;
class Practical14{
    public static void main(String a[]) throws Exception {
        System.out.println("Enter Host Address");
        InetAddress i = InetAddress.getByName(new Scanner(System.in).next());
        System.out.println("IP : " + i);
        System.out.println("Local Host : " + i.getLocalHost());
        System.out.println("Address : " + i.getAddress());
        System.out.println("Host Address : " + i.getHostAddress());
        System.out.println("Host Name : " + i.getHostName());
        System.out.println("Multicast  : " + i.isMulticastAddress());

    }
}
