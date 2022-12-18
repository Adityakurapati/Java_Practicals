import java.awt.*;
import java.awt.event.*;
// import java

public class Pr5 extends Frame implements ActionListener {
    Pr5() {
        setVisible(true);
        setSize(400, 400);
        setTitle("Pr 5");
        MenuBar mbr = new MenuBar();
        setMenuBar(mbr);
        // Pgm Code
        Menu mn = new Menu("Colors");
        MenuItem mi1 = new MenuItem("Yellow ");
        MenuItem mi2 = new MenuItem("White ");
        MenuItem mi3 = new MenuItem("Black");
        mi3.setEnabled(false);
        mn.add(mi1);
        mn.add(mi2);
        mn.add(mi3);
        mbr.add(mn);

        Menu file = new Menu("File");
        mbr.add(file);
        MenuItem new1 = new MenuItem("New");
        MenuItem open = new MenuItem("Open");
        open.addActionListener(this);
        MenuItem save = new MenuItem("Save ");
        MenuItem saveAs = new MenuItem("Save As ");
        // MenuShortcut ms = new MenuShortcut(keyEvent.VK_X);
        file.add(new1);
        file.add(open);
        file.add(save);
        file.add(saveAs);

    }

    public void actionPerformed(ActionEvent ae) {
        FileDialog fd = new FileDialog(FileDialog.LOAD);

    }

    public static void main(String a[]) {
        new Pr5();

    }
}
