import comp127graphics.CanvasWindow;
import comp127graphics.events.Key;

import java.awt.*;

public class Game {

    private CanvasWindow canvas;
    private Ball ball1;
    private Ball ball2;
    private Ball ball3;
    private Ball ball4;
    private Ball ball5;
    private Player player;
    private Boundary bound;

    /**
     * Creates a new Game object
     */
    public Game() {
        canvas = new CanvasWindow("", 900, 900);
        bound = new Boundary(canvas);
        bound.addBoundary();
        ball1 = new Ball(450, 275, 50, 0, 25, this.canvas);
        ball1.addBall();
        ball2 = new Ball(450, 400, 50, 0, 25, this.canvas);
        ball2.addBall();
        ball3 = new Ball(450, 525, 50, 0, 25, this.canvas);
        ball3.addBall();
        ball4 = new Ball(450, 335, -50, 0, 25, this.canvas);
        ball4.addBall();
        ball5 = new Ball(450, 465, -50, 0, 25, this.canvas);
        ball5.addBall();
        player = new Player(20, 20, 20, canvas);
        player.addPlayer();
        canvas.setBackground(new Color(131, 143, 255));
        canvas.draw();
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
        canvas.animate(() -> {
            canvas.onKeyDown((keyboardEvent) -> {
                if (keyboardEvent.getKey().equals(Key.DOWN_ARROW)){
                    player.moveDown(.1);
                }
                if (keyboardEvent.getKey().equals(Key.UP_ARROW)){
                    player.moveUp(.1);
                }
                if (keyboardEvent.getKey().equals(Key.RIGHT_ARROW)){
                    player.moveRight(.1);
                }
                if (keyboardEvent.getKey().equals(Key.LEFT_ARROW)){
                    player.moveLeft(.1);
                }
            });
        });
    }

}