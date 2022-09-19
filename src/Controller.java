import java.util.*;
import java.awt.*;

public class Controller {
    private View view;
    private Model model;

    public Controller(View v, Model m) {
        view = v; 
        model = m;
    }
}