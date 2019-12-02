import comp127graphics.CanvasWindow;
import comp127graphics.Ellipse;

import java.awt.*;

public class Ball extends Ellipse {

    private final Color BALL_COLOR = Color.BLUE;
    private final Color BALL_OUTLINE = new Color(0, 24, 119);

    private double xPos;
    private double yPos;
    private double radius;
    private double xVel;
    private double yVel;
    private CanvasWindow canvas;

    /**
     * Creates an ellipse whose center is at (x,y), and which has the specified width, height,
     * x velocity, and y velocity.
     * It has a 1 pixel black stroke outline by default.
     *
     * @param x      position
     * @param y      position
     * @param xVel   velocity
     * @param yVel   velocity
     * @param radius the width and height of the ball
     */
    public Ball(double x, double y, double xVel, double yVel, double radius, CanvasWindow canvas) {
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

    public void moveBallX(double dt, double minX, double maxX) {
        if(this.xPos + radius > maxX - 1 || this.xPos - radius < minX + 1) {
            xVel *= -1;
        }
        this.xPos += (dt * xVel);
        this.setCenter(this.xPos, this.yPos)
    }

}
