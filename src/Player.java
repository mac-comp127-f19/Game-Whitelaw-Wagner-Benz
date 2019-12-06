import comp127graphics.CanvasWindow;
import comp127graphics.Point;
import comp127graphics.Rectangle;

import java.awt.*;

public class Player extends Rectangle {

    private final Color PLAYER_COLOR = Color.RED;
    private final Color PLAYER_OUTLINE = new Color(108, 1, 8);
    private double xPos;
    private double yPos;
    private double xVel;
    private double yVel;
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
        this.xPos = x;
        this.yPos = y;
        this.length = length;
        this.setFillColor(PLAYER_COLOR);
        this.setStrokeColor(PLAYER_OUTLINE);
        this.setStrokeWidth(this.length/5);
        this.canvas = canvas;
        this.setCenter(x, y);
        this.xVel = 10;
        this.yVel = 10;
    }

    /**
     * Adds the player to the canvas
     */
    public void addPlayer() {
        this.canvas.add(this);
    }
}
