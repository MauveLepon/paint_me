import java.util.*;
import java.awt.*;

/* Classe pour stocker l'état de la couleur du crayon */

public class Model {
    private Color mainColor;

    public Model() {
        mainColor = Color.BLACK;
    }

    public Model(Color color) {
        mainColor = color;
    }

    public Color getMainColor() {
        return mainColor;
    }

    public void setMainColor(Color color) {
        mainColor = color;
    }
}