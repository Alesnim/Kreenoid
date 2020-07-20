import dev.jabo.kree.*;
import dev.jabo.kree.ui.Button;
import dev.jabo.kree.ui.UserInterface;

import java.awt.*;

public class GameMenu extends Scene {
    Sprite background;
    Button start, score, exit;
    Audio buttonHover;
    Audio backSound;

    public GameMenu(Game game) {
        super(game);
    }

    @Override
    public void Initialize() {
        buttonHover = new Audio("Assets/audio/butttonEffect1.wav");
        background = new Sprite("/image/space_sprites/space.png");
        start = new Button(this, "Start", new Vector2(200, 200), new Vector2(400, 50));
        score = new Button(this, "Score", new Vector2(200, 300), new Vector2(400, 50));
        exit = new Button(this, "Exit", new Vector2(200, 400), new Vector2(400, 50));


    }

    @Override
    public void Update() {
        if (start.onClick()) {
            SceneManager.setScene(new GameScene(game));
        }

        if (score.onClick()) {
            // TODO: implement score table
        }

        if (exit.onClick()) {
            System.exit(0);
        }

        soundHover();

    }

    private void soundHover() {
        for (UserInterface userInterface: userInterfaces) {
            if (((Button) userInterface).onHover()) {
                if (!buttonHover.isPlaying()) {
                    buttonHover.play();
                }

            }
            else if (buttonHover.isPlaying()){
                buttonHover.stop();
            }

        }
    }

    @Override
    public void Render(Graphics graphics) {
        graphics.drawImage(background.getImage().getSubimage(300, 800, game.getWindow().getWindowWidth(),
                game.getWindow().getWindowHeight()), 0,0, null);

    }
}
