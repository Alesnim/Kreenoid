package entity;

import dev.jabo.kree.*;
import dev.jabo.kree.components.Animator;
import dev.jabo.kree.components.BoxCollider;
import dev.jabo.kree.components.PlayerMovement;

import java.util.Arrays;

public class Player extends GameObject {
    boolean life = true;

    public Player(Scene parentScene, String name) {
        super(parentScene, name);
        SpriteSheet spriteSheet = new SpriteSheet(new Sprite("/image/ships/dove.png"), 32, 32);
        Animation animation = new Animation("ship", spriteSheet, 150);
        Animator animator = new Animator(Arrays.asList(animation).toArray(Animation[]::new));
        addComponent(animator);
        animator.setActiveAnimation("ship");
        addComponent(new BoxCollider());
        addComponent(new PlayerMovement(1, PlayerMovement.ARROWS));
    }
}
