import java.util.*;
import java.awt.*;

/* Classe pour stocker l'état de la couleur du crayon */

public class Model {
    private Color mainColor;
    private int x = 0;
    private int y = 0;

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

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void updateX(int x) {
        this.x = x;
    }

    public void updateY(int y) {
        this.y = y;
    }
}