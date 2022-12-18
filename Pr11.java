import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Pr11 extends JFrame implements MouseListener,MouseMotionListener{
    JTextArea ta;
    Container c;
    Pr11(){
        setVisible(true);
        setSize(500,500);
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.magenta);
        ta = new JTextArea();
        ta.setVisible(true);
        c.add(ta);
        ta.setBounds(30,30,300,70);
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public void mouseEntered(MouseEvent e){
        c.setBackground(Color.green);
    }
    public void mouseClicked(MouseEvent e){
        Graphics g = this.getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(), e.getY(), 30, 30);
        ta.setText(ta.getText()+e.getClickCount() + " At "+getX()+"  "+getY()+"\n");
    }
    public void mousePressed(MouseEvent e){

    }
    public void mouseReleased(MouseEvent e){
        ta.setText("Mouse Relased;#of clicks:"+e.getClickCount());
    }
    public void mouseExited(MouseEvent e){
        c.setBackground(Color.orange);
    }
    public static void main(String[] args) {
        new Pr11();
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        Graphics g = this.getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(), e.getY(), 3, 3);
        c.setBackground(Color.gray);
    }
    @Override
    public void mouseMoved(MouseEvent e) {
        
        c.setBackground(Color.cyan);
        
    }
}
