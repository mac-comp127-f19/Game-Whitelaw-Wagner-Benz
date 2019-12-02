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
    /*
    public boolean moveBallLinear(double dt, Boundary bound) {
        if(!boundaryCollision(bound)){
            xPos += (xVel * dt);
            yPos += (yVel * dt);
            this.setCenter(xPos, yPos);
            return true;
        }
        return false;
    }

    /**
     * Detects if the ball collided with the boundaries. If the ball collides with the boundary,
     * the ball will bounce off the boundary.
     * @param bound The Boundary object used to outline the screen
     * @return true If the Ball hit the boundary
     */
    /*
    public boolean boundaryCollision(Boundary bound) {
        if(getBottomY() + 1 >= bound.getHeight()) {
            this.yVel *= -1.0001;
            this.yPos -= 3;
            return true;
        } else if(getTopY() - 1 <= bound.getMinHeight()) {
            this.yVel *= -1.0001;
            this.yPos += 3;
            return true;
        }else if(getRightX() + 1 >= bound.getWidth()) {
            this.xVel *= -1.0001;
            this.xPos -= 3;
            return true;
        }else if(getLeftX() - 1 <= bound.getMinWid()) {
            this.xVel *= -1.0001;
            this.xPos += 3;
            return true;
        }
        return false;
    }
    */

    /**
     * Gets the left mid-point(x coordinate) of the ball, using getCenter and subtracting half the radius
     * @return double The left mid-point of the ball
     */
    public double getLeftX() {
        return this.getCenter().getX() - radius/2 - .5;
    }

    /**
     * Gets the right mid-point(x coordinate) of the ball, using getCenter and adding half the radius
     * @return double The right mid-point of the ball
     */
    public double getRightX() {
        return this.getCenter().getX() + radius/2 + .5;
    }

    /**
     * Gets the top mid-point(y coordinate) of the ball, using getCenter and subtracting half the radius
     * @return double The top mid-point of the ball
     */
    public double getTopY() {
        return this.getCenter().getY() - radius/2 - .5;
    }

    /**
     * Gets the bottom mid-point(y coordinate) of the ball, using getCenter and adding half the radius
     * @return double The bottom mid-point of the ball
     */
    public double getBottomY() {
        return this.getCenter().getY() + radius/2 + .5;
    }

}
