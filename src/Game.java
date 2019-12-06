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

    /**
     * Creates a new Game object
     */
    public Game() {
        canvas = new CanvasWindow("", 900, 900);
        bound = new Boundary(canvas);
        bound.addBoundary();
        ball1 = new Ball(450, 275, 250, 0, 25, this.canvas);
        ball1.addBall();
        ball2 = new Ball(450, 400, 250, 0, 25, this.canvas);
        ball2.addBall();
        ball3 = new Ball(450, 525, 250, 0, 25, this.canvas);
        ball3.addBall();
        ball4 = new Ball(450, 335, -250, 0, 25, this.canvas);
        ball4.addBall();
        ball5 = new Ball(450, 465, -250, 0, 25, this.canvas);
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
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.run();
    }

    public void run(){
        canvas.animate(() -> {
            ball1.moveBallLinear(.1, bound);
            ball2.moveBallLinear(.1, bound);
            ball3.moveBallLinear(.1, bound);
            ball4.moveBallLinear(.1, bound);
            ball5.moveBallLinear(.1, bound);
        });
        canvas.onDrag((mouseMotionEvent) -> {
            if (mouseMotionEvent.getPosition().getX()-player.getCenter().getX()<30&&mouseMotionEvent.getPosition().getX()-player.getCenter().getX()>-30
                    &&mouseMotionEvent.getPosition().getY()-player.getCenter().getY()<30&&mouseMotionEvent.getPosition().getY()-player.getCenter().getY()>-30)
                player.setCenter(mouseMotionEvent.getPosition());
            for (Ball ball : balls){
                if (ball.testPlayerHit(player)){
                    player.setCenter(0,0);
                }
            }
        });
    }

}