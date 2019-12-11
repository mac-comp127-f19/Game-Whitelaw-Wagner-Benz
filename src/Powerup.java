import comp127graphics.CanvasWindow;
import comp127graphics.Ellipse;

import java.awt.*;

public class Powerup extends Ellipse {

    private final Color POWERUP_COLOR = new Color(138, 40, 141);
    private final Color POWERUP_OUTLINE = new Color(81, 42, 123);

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
    public Powerup(double x, double y, double radius, CanvasWindow canvas) {
        super(x, y, radius, radius);
        this.xPos = x;
        this.yPos = y;
        this.radius = radius;
        this.canvas = canvas;
        this.setCenter(this.xPos, this.yPos);
        this.setFillColor(POWERUP_COLOR);
        this.setStrokeColor(POWERUP_OUTLINE);
        this.setStrokeWidth(this.radius/4);
    }

    /**
     * Adds the coin to the canvas
     */
    public void addPowerup() {
        this.canvas.add(this);
    }

    public boolean testPlayerHit(Player player) {
        if(this.testHit(player.getX() - 1, player.getY() + player.getLength()/2)) {
            return true;
        } else if(this.testHit(player.getRightX() + 1, player.getY() + player.getLength()/2)) {
            return true;
        } else if(this.testHit(player.getX() + player.getLength()/2, player.getBottomY() + 1)) {
            return true;
        } else if(this.testHit(player.getX() + player.getLength()/2, player.getY() - 1)) {
            return true;
        }
        return false;
    }
}
