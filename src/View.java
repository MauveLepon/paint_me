import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;

public class View extends JFrame {
    JPanel main = new JPanel();
    Model model = new Model(Color.BLACK);
    Controller controller = new Controller(this, model);

    public View() {
        this.setSize(750,750);
        this.setResizable(false);
        this.setTitle("Paint_Me");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().add(main);
        this.setVisible(true);
    }
}