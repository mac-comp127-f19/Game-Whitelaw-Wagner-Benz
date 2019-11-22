import comp127graphics.CanvasWindow;
import comp127graphics.Ellipse;

import java.awt.*;

public class Ball extends Ellipse {

    private final Color BALL_COLOR = Color.BLUE;
    private final Color BALL_OUTLINE = new Color(0, 24, 119);

    private double xPos;
    private double yPos;
    private double radius;
    private CanvasWindow canvas;
    /**
     * Creates an ellipse whose upper left is at (x,y), and which has the specified width and height.
     * It has a 1 pixel black stroke outline by default.
     *
     * @param x      position
     * @param y      position
     * @param radius the width and height of the ball
     */
    public Ball(double x, double y, double radius, CanvasWindow canvas) {
        super(x, y, radius, radius);
        this.xPos = x;
        this.yPos = y;
        this.radius = radius;
        this.setFillColor(BALL_COLOR);
        this.setStrokeColor(BALL_OUTLINE);
        this.setStrokeWidth(this.radius/5);
        this.canvas = canvas;
        this.setCenter(x, y);
    }

    /**
     * Adds the ball to the canvas
     */
    public void addBall() {
        this.canvas.add(this);
    }

}
