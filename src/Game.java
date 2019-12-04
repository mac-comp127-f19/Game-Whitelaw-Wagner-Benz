import comp127graphics.CanvasWindow;

import java.awt.*;

public class Game {

    private CanvasWindow canvas;
    private Ball ball1;
    private Player player;
    private Coin coin1;
    private Boundary bound;

    /**
     * Creates a new Game object
     */
    public Game() {
        canvas = new CanvasWindow("", 900, 900);
        ball1 = new Ball(450, 450, 10, 10, 20, this.canvas);
        ball1.addBall();
        bound = new Boundary(canvas);
        bound.addBoundary();
        player = new Player(20, 20, 20, canvas);
        player.addPlayer();
        coin1 = new Coin(200, 200, 10, this.canvas);
        coin1.addCoin();
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
        });
    }

}