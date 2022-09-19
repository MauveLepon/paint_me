import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;

public class View extends JFrame {
    Model model = new Model(Color.BLACK);
    Controller controller = new Controller(this, model);

    public View() {
        this.setSize(750,750);
        this.setResizable(false);
        this.setTitle("Paint_Me");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                controller.updateCoordinates(e.getX(),e.getY());
                controller.paintPixel();
            }
        });

        this.setVisible(true);
    }
    
    public void paintPixel() {
        Graphics gr = this.getGraphics();
        this.paint(gr);
    }

    public void paint(Graphics g) {
        g.setColor(model.getMainColor());
        g.drawRect(model.getX(), model.getY(), 1, 1);
    }
}