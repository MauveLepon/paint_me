import java.util.*;
import java.awt.*;

public class Controller {
    private View view;
    private Model model;

    public Controller(View v, Model m) {
        view = v; 
        model = m;
    }

    public void paintPixel() {
        view.paintPixel();
    }

    public void updateCoordinates(int x, int y) {
        model.updateX(x);
        model.updateY(y);
    }
}