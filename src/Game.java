import comp127graphics.CanvasWindow;
import comp127graphics.GraphicsText;
import comp127graphics.events.Key;

import java.awt.*;
import java.util.ArrayList;

public class Game {

    private CanvasWindow canvas;
    private Ball ball1;
    private Ball ball2;
    private Ball ball3;
    private Ball ball4;
    private Ball ball5;
    private Ball ball6;
    private GraphicsText instructions;
    private Player player;
    private Boundary bound;
    private ArrayList<Ball> balls;
    private boolean boundHit;

    /**
     * Creates a new Game object
     */
    public Game() {
        canvas = new CanvasWindow("", 900, 900);
        bound = new Boundary(canvas);
        bound.addBoundary();
        ball1 = new Ball(450, 275, 175, 0, 25, this.canvas);
        ball1.addBall();
        ball2 = new Ball(450, 375, 175, 0, 25, this.canvas);
        ball2.addBall();
        ball3 = new Ball(450, 475, 175, 0, 25, this.canvas);
        ball3.addBall();
        ball4 = new Ball(450, 325, -175, 0, 25, this.canvas);
        ball4.addBall();
        ball5 = new Ball(450, 425, -175, 0, 25, this.canvas);
        ball5.addBall();
        ball6 = new Ball(450, 525, -175, 0, 25, this.canvas);
        ball6.addBall();
        player = new Player(125, 400, 25, canvas);
        player.addPlayer();
        canvas.setBackground(new Color(131, 143, 255));
        canvas.draw();
        balls = new ArrayList<>();
        balls.add(ball1);
        balls.add(ball2);
        balls.add(ball3);
        balls.add(ball4);
        balls.add(ball5);
        balls.add(ball6);
        boundHit = player.testBoundaryHit(bound);
        instructions = new GraphicsText("Get to the other green box to complete the level");
        instructions.setFontSize(20);
        canvas.add(instructions, 50, 50);
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.run();
    }

    public void run() {
        canvas.animate(() -> {
            boundHit = player.testBoundaryHit(bound);
            for (Ball ball : balls) {
                ball.moveBallLinear(.1, bound);
                if (ball.testPlayerHit(player)) {
                    player.setCenter(125, 400);
                }
            }
        });
        canvas.onDrag((mouseMotionEvent) -> {
            boolean test1 = mouseMotionEvent.getPosition().getX() - player.getCenter().getX() < 30 && mouseMotionEvent.getPosition().getX() - player.getCenter().getX() > -30;
            boolean test2 = mouseMotionEvent.getPosition().getY() - player.getCenter().getY() < 30 && mouseMotionEvent.getPosition().getY() - player.getCenter().getY() > -30;
            if (test1 && test2 && !boundHit && bound.getGroup().testHit(mouseMotionEvent.getPosition().getX(), mouseMotionEvent.getPosition().getY())) {
                player.setCenter(mouseMotionEvent.getPosition());
            }
        });
    }
}