import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;

public class Practical13{
    private static void createAndShowGUI() {
        JFrame jFrame = new JFrame("Hello World Swing Example");
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(500, 360);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World Swing");
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        label.setBorder(border);
        label.setPreferredSize(new Dimension(150, 100));

        label.setText("Hello World Swing");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

        jFrame.add(label);
        jFrame.setVisible(true);
        //1. Window Adapter
        class MyWin extends WindowAdapter{
            public void windowOpened(WindowEvent e){
                jFrame.setBackground(Color.green);
                label.setText("Welcome To Java");
            }
        }
        jFrame.addWindowListener(new MyWin());

        // 2. Ananymouse Inner Class
        Thread greet = new Thread(){
           public void run(){
               sleep(3000);
            label.setText("Text Changed");
           }
        }
        Thread t = new Thread();
        t.start();

            //3. MouseAdpter
           class Mouse1 extends MouseAdapter{
               public void mousePressed(MouseEvent e){
                   label.setText("Mouse Pressed ");
               }
           }
        
        
    }

    public static void main(String[] args) {
        createAndShowGUI();
    }
}
