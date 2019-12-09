import comp127graphics.CanvasWindow;
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
        ball1 = new Ball(450, 275, 150, 0, 25, this.canvas);
        ball1.addBall();
        ball2 = new Ball(450, 400, 150, 0, 25, this.canvas);
        ball2.addBall();
        ball3 = new Ball(450, 525, 150, 0, 25, this.canvas);
        ball3.addBall();
        ball4 = new Ball(450, 335, -150, 0, 25, this.canvas);
        ball4.addBall();
        ball5 = new Ball(450, 465, -150, 0, 25, this.canvas);
        ball5.addBall();
        player = new Player(125, 400, 20, canvas);
        player.addPlayer();
        canvas.setBackground(new Color(131, 143, 255));
        canvas.draw();
        balls = new ArrayList<>();
        balls.add(ball1);
        balls.add(ball2);
        balls.add(ball3);
        balls.add(ball4);
        balls.add(ball5);
        boundHit = player.testBoundaryHit(bound);
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.run();
    }

    public void run() {
        canvas.animate(() -> {
            boundHit = player.testBoundaryHit(bound);
            ball1.moveBallLinear(.1, bound);
            ball2.moveBallLinear(.1, bound);
            ball3.moveBallLinear(.1, bound);
            ball4.moveBallLinear(.1, bound);
            ball5.moveBallLinear(.1, bound);
            for (Ball ball : balls) {
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