import dev.jabo.kree.Game;
import dev.jabo.kree.Scene;
import dev.jabo.kree.Vector2;
import entity.Enemy;
import entity.Player;

import java.awt.*;

public class GameScene  extends Scene {
    Player player;
    Enemy[] enemies = new Enemy[21];

    public GameScene(Game game) {
        super(game);
    }

    @Override
    public void Initialize() {
        player = new Player(this, "player");
        player.getTransform().setScale(new Vector2(42, 42));
        player.getTransform().setPosition(new Vector2(400, 500));

        for (Enemy enemy: enemies) {
            enemy = new Enemy(this, "enemy");
            
        }
    }

    @Override
    public void Update() {
        player.Update();
    }

    @Override
    public void Render(Graphics graphics) {
        player.Render(graphics);
    }
}
