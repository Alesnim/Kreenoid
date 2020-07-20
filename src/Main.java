import dev.jabo.kree.Game;
import dev.jabo.kree.SceneManager;
import dev.jabo.kree.Window;

import javax.sound.sampled.AudioSystem;


public class Main {



    public static void main(String[] args) {
        Game game = new Game(new Window("My Game", 800, 600));

        GameMenu gameScene = new GameMenu(game);

        SceneManager.setScene(gameScene);

        game.start();
    }
}
