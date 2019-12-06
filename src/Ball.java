import comp127graphics.CanvasWindow;
import comp127graphics.Ellipse;
import comp127graphics.Line;

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
        this.xVel = xVel;
        this.yVel = yVel;
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

    /**
     * Moves the ball linearly if it is within the boundary
     * @param dt the scale of the move
     * @param bound the bounds of the game
     * @return true if ball can move
     */
    public void moveBallLinear(double dt, Boundary bound) {
        if(!testBoundaryHit(bound)){
            xPos += (xVel * dt);
            yPos += (yVel * dt);
            this.setCenter(xPos, yPos);
        }
    }

    /**
     * Tests if this object collides with the boundary of the game
     * @param bound the boundary for the level
     * @return true if the ball collides with the bound
     */
    public boolean testBoundaryHit(Boundary bound) {
        if(!bound.getBound().testHit(this.getLeftX(), this.getY())) {
            this.xVel *= -1;
            this.xPos += 20;
            this.setCenter(this.xPos, this.yPos);
            return true;
        } else if(!bound.getBound().testHit(this.getRightX(), this.getY())) {
            this.xVel *= -1;
            this.xPos -= 20;
            this.setCenter(this.xPos, this.yPos);
            return true;
        }
        return false;
    }

    /**
     * Gets the left mid-point(x coordinate) of the ball, using getCenter and subtracting half the radius
     * @return double The left mid-point of the ball
     */
    public double getLeftX() {
        return this.getCenter().getX() - radius/2 - 5;
    }

    /**
     * Gets the right mid-point(x coordinate) of the ball, using getCenter and adding half the radius
     * @return double The right mid-point of the ball
     */
    public double getRightX() {
        return this.getCenter().getX() + radius/2 + 5;
    }

    /**
     * Gets the top mid-point(y coordinate) of the ball, using getCenter and subtracting half the radius
     * @return double The top mid-point of the ball
     */
    public double getTopY() {
        return this.getCenter().getY() - radius/2 - 5;
    }

    /**
     * Gets the bottom mid-point(y coordinate) of the ball, using getCenter and adding half the radius
     * @return double The bottom mid-point of the ball
     */
    public double getBottomY() {
        return this.getCenter().getY() + radius/2 + 5;
    }
}