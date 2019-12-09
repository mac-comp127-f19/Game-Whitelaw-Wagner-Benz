import comp127graphics.CanvasWindow;
import comp127graphics.Point;
import comp127graphics.Rectangle;

import java.awt.*;

public class Player extends Rectangle {

    private final Color PLAYER_COLOR = Color.RED;
    private final Color PLAYER_OUTLINE = new Color(108, 1, 8);
    private double length;
    private CanvasWindow canvas;

    /**
     * Creates a new Player
     * @param x the x position of the player
     * @param y the y position of the player
     * @param length the side length of the player
     * @param canvas the canvas that the player is put on
     */
    public Player(double x, double y, double length, CanvasWindow canvas) {
        super(x, y, length, length);
        this.length = length;
        this.setFillColor(PLAYER_COLOR);
        this.setStrokeColor(PLAYER_OUTLINE);
        this.setStrokeWidth(this.length/5);
        this.canvas = canvas;
        this.setCenter(x, y);
    }

    /**
     * Adds the player to the canvas
     */
    public void addPlayer() {
        this.canvas.add(this);
    }

    public boolean testBoundaryHit(Boundary bound) {
        if(!bound.getGroup().testHit(this.getX() - 1, this.getY() + this.length/2)) {
            double x = this.getCenter().getX();
            double y = this.getCenter().getY();
            this.setCenter(x + 2, y);
            return true;
        } else if(!bound.getGroup().testHit(this.getRightX() + 1, this.getY() + this.length/2)) {
            double x = this.getCenter().getX();
            double y = this.getCenter().getY();
            this.setCenter(x - 2, y);
            return true;
        } else if(!bound.getGroup().testHit(this.getX() + this.length/2, this.getBottomY() + 1)) {
            double x = this.getCenter().getX();
            double y = this.getCenter().getY();
            this.setCenter(x, y - 2);
            return true;
        } else if(!bound.getGroup().testHit(this.getX() + this.length/2, this.getY() - 1)) {
            double x = this.getCenter().getX();
            double y = this.getCenter().getY();
            this.setCenter(x, y + 3);
            return true;
        }
        return false;
    }

    public double getRightX() {
        return this.getX() + this.length;
    }

    public double getBottomY() {
        return this.getY() + this.length;
    }

    public double getLength() {
        return this.length;
    }
}
