import comp127graphics.CanvasWindow;

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
    private Coin coin1;

    /**
     * Creates a new Game object
     */
    public Game() {
        canvas = new CanvasWindow("", 900, 900);
        ball1 = new Ball(450, 300, 50, 0, 20, this.canvas);
        ball1.addBall();
        ball2 = new Ball(450, 400, 50, 0, 20, this.canvas);
        ball2.addBall();
        ball3 = new Ball(450, 500, 50, 0, 20, this.canvas);
        ball3.addBall();
        ball4 = new Ball(450, 350, -50, 0, 20, this.canvas);
        ball4.addBall();
        ball5 = new Ball(450, 450, -50, 0, 20, this.canvas);
        ball5.addBall();
        player = new Player(20, 20, 20, canvas);
        player.addPlayer();
        coin1 = new Coin(100, 100, 10, canvas);
        coin1.addCoin();
        bound = new Boundary(canvas);
        bound.addBoundary();
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
    }

}