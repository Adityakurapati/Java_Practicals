
// import java.awt.Container.getContentPane;
// import java.swing.JFrame;
// import java.awt.Conatiner.add;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Pr10 extends KeyAdapter {
    JTextArea ta;
    JFrame f;

    Pr10() {
        f = new JFrame("KeyEvents ");
        f.setVisible(true);
        f.setSize(300, 300);
        // Container c = getContentPane();
        f.setLayout(new FlowLayout());
        f.setBackground(Color.magenta);
        f.addKeyListener(this);
        ta = new JTextArea();
        f.add(ta);
    }

    public void keyTyped(KeyEvent e) {
        ta.setText(ta.getText() + e.getKeyChar());
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch(key){
            case KeyEvent.VK_F1:
                ta.setText(ta.getText() + "F1");
                break;
            case KeyEvent.VK_F2:
                ta.setText(ta.getText() + "F2");
                break;
            case KeyEvent.VK_F3:
                ta.setText(ta.getText() + "F3");
                break;
            case KeyEvent.VK_F4:
                ta.setText(ta.getText() + "F4");
                break;
            case KeyEvent.VK_F5:
                ta.setText(ta.getText() + "F5");
                break;
            case KeyEvent.VK_RIGHT:
                ta.setText(ta.getText() + "RIGHT");
                break;
            case KeyEvent.VK_UP:
                ta.setText(ta.getText() + "UP");
                break;
            case KeyEvent.VK_DOWN:
                ta.setText(ta.getText() + "DOWN");
                break;
            case KeyEvent.VK_CONTROL+KeyEvent.VK_C:
                ta.setText(ta.getText() + "LEFT");
                break;
        }
    }

    public static void main(String a[]) {
        new Pr10();

    }
}