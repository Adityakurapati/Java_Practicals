import java.awt.*;
import javax.swing.*;

import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.WindowEvent;

import java.awt.event.*;
class MouseListen extends JFrame implements MouseListener,MouseMotionListener
{
    
    int x,y;
    Label l1;
    MouseListen()
    {
        l1 = new Label();
        String txt = "";
        setBackground(Color.magenta);
        addMouseListener(this);
        add(l1);
    }
    public void mouseClicked(MouseEvent e){
        Graphics g = getGraphics();
        g.setColor(Color.CYAN);
        g.fillOval(getX(), getY(), 2, 2);
    }
    // public void mouseEntered(MouseEvent me){
    //     l1.setText("Mouse Entered");
    //     JOptionPane.showConfirmDialog(this, "Are U 18 +");
    // }
    // public void mouseExited(MouseEvent me){
    //     l1.setText("Mouse Exited");
    // }
    // public void mouseClicked(MouseEvent me){
    //     x = this.getX();
    //     y = this.getY();
    //     l1.setText("Mouse Clicked at "+x+" "+y);
    // }
    // public void mousePressed(MouseEvent me){
    //     l1.setText("Mouse Entered");
    // }
    // public void mouseReleased(MouseEvent me){
    //     l1.setText("Mouse Released");
    // }
    // public void mouseDragged(MouseEvent me){
    //     x = this.getX();
    //     y = this.getY();
    //     l1.setText("Mouse Dragged At "+x+" "+y);
    // }
    // public void mouseMoved(MouseEvent me){
        
    //     l1.setText("Mouse Dragged Moved at "+x+" "+y);
    // }
    
    public static void main(String a[])
    {
        MouseListen o = new MouseListen();
        o.setVisible(true);
        o.setSize(500,500);
        o.setTitle("Mouse Events ");

    }
    @Override
    public void mouseDragged(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mouseMoved(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
}