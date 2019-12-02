import comp127graphics.CanvasWindow;

public class Game {

    private CanvasWindow canvas;
    private Ball ball1;
    private Player player;

    /**
     * Creates a new Game object
     */
    public Game() {
        canvas = new CanvasWindow("", 900, 900);
        ball1 = new Ball(450, 450, 10, 10, 20, this.canvas);
        ball1.addBall();
        player = new Player(20, 20, 20, canvas);
        player.addPlayer();
        canvas.draw();
    }

    public static void main(String[] args) {
        Game game = new Game();
    }

}