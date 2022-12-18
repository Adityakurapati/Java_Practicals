import java.awt.*;
import java.awt.event.*;

class Pr1 extends Frame implements ItemListener {
	CheckboxGroup cbg;
	Checkbox c1, c2, c3, c4;
	static Dialog d;
	static Label l2 = new Label();

	Pr1() {
		setBackground(Color.green);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		// 1.
		Label l1 = new Label("Welcome To Java");
		add(l1);

		// 2.
		cbg = new CheckboxGroup();
		c1 = new Checkbox("Python", true, cbg);
		c2 = new Checkbox("JS ", false, cbg);
		c3 = new Checkbox("Css", false, cbg);
		c4 = new Checkbox("Swift", false, cbg);

		add(c1);
		add(c2);
		add(c3);
		add(c4);

                c1.addItemListener(this)
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);

		// 3
		Button b1 = new Button("Ok");
		Button b2 = new Button("Cancel");
		Button b3 = new Button("Retry");
		add(b1);
		add(b2);
		add(b3);
	}

	public static void main(String a[]) {
		Pr1 p = new Pr1();
		d = new Dialog(p, "Selection", false);
		d.setVisible(false);
		d.setSize(150, 150);
		d.add(l2);
	}

	public void itemStateChanged(ItemEvent ie) {
		d.setVisible(true);
		Checkbox cb = cbg.getSelectedCheckbox();
		String str = cb.getLabel();
		l2.setText(str);
	}

}
