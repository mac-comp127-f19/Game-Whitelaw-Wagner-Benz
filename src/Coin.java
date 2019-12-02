import comp127graphics.CanvasWindow;
import comp127graphics.Ellipse;

import java.awt.*;

public class Coin extends Ellipse {

    private final Color COIN_COLOR = new Color(236, 230, 45);
    private final Color COIN_OUTLINE = new Color(112, 109, 0);

    private double xPos;
    private double yPos;
    private double radius;
    private CanvasWindow canvas;
    /**
     * Creates an ellipse whose center is at (x,y), and which has the specified width and height.
     * It has a 1 pixel black stroke outline by default.
     *
     * @param x      position
     * @param y      position
     * @param radius width and height of ball
     */
    public Coin(double x, double y, double radius, CanvasWindow canvas) {
        super(x, y, radius, radius);
        this.xPos = x;
        this.yPos = y;
        this.radius = radius;
        this.canvas = canvas;
        this.setCenter(this.xPos, this.yPos);
        this.setFillColor(COIN_COLOR);
        this.setStrokeColor(COIN_OUTLINE);
        this.setStrokeWidth(this.radius/4);
    }

    /**
     * Adds the coin to the canvas
     */
    public void addCoin() {
        this.canvas.add(this);
    }
}
