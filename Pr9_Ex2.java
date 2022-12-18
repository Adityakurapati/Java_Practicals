import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Pr9_Ex2 extends JFrame implements ActionListener{
    JProgressBar jp;

    public void changeProgress() {
        int v = 0;
        while (v < 100) {
            v += 5;
            jp.setValue(v);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
    Pr9_Ex2()
    {
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Container c = getContentPane();
        getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        jp = new JProgressBar(0,100);
        jp.setStringPainted(true);
        Button b = new Button("Show Progress");

        changeProgress();
        b.addActionListener(this);
        getContentPane().add(b);
        getContentPane().add(jp);
    }

    public void actionPerformed(ActionEvent ae) {
        JOptionPane.showMessageDialog(this, jp.getValue());
    }

    public static void main(String a[]) {
        new Pr9_Ex2();
    }
}
