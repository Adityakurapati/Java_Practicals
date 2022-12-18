import java.awt.*;
import javax.swing.*;

public class Pr3 {
    Pr3() {
        Frame f = new Frame();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setLayout(new GridLayout(3, 2, 10, 10));
        f.setBackground(Color.magenta);
        for (int i = 0; i <= 4; i++) {
            f.add(new Button("Btn" + i));
        }
        Panel p = new Panel();
        f.add(p);
        p.setLayout(new BorderLayout(5, 5));
        Button Jb1 = new Button("East");
        Button Jb2 = new Button("West");
        Button Jb3 = new Button("South");
        Button Jb4 = new Button("North");
        Button Jb5 = new Button("My Center");
        p.add(Jb1, BorderLayout.EAST);
        p.add(Jb2, BorderLayout.WEST);
        p.add(Jb3, BorderLayout.SOUTH);
        p.add(Jb4, BorderLayout.NORTH);
        p.add(Jb5, BorderLayout.CENTER);

    }

    public static void main(String a[]) {
        Pr3 p1 = new Pr3();
    }

}
