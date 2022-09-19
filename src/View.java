import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class View extends JFrame {
    JPanel main;
    // Model model = new Model();
    // Controller controller = new Controller(this, model);

    public View() {
        this.setSize(500,500);
        this.setResizable(false);
        this.setTitle("Paint_Me");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}