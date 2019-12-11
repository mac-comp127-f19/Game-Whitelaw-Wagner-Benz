import java.util.ArrayList;
import java.util.List;

public class GameManager {
    private int deaths;
    private int numLev;
    private Level1 one;
    private List<Level> levels;

    public GameManager() {
        deaths = 0;
        one = new Level1();
        numLev = 1;
        levels = new ArrayList<>();
        levels.add(one);
    }

    public Level getLevel() {
        return levels.get(numLev - 1);
    }
    public void setNumLev(){
        numLev+=1;
    }

    public static void main(String[] args) {
        GameManager manager = new GameManager();
        manager.getLevel().run();
    }
}
