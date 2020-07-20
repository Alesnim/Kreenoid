package entity;

import dev.jabo.kree.*;
import dev.jabo.kree.components.Animator;
import dev.jabo.kree.components.BoxCollider;
import dev.jabo.kree.components.MeshRenderer;

import java.util.Arrays;

public class Enemy extends GameObject {

    public Enemy(Scene parentScene, String name) {
        super(parentScene, name);
        SpriteSheet spriteSheet = new SpriteSheet(new Sprite("/image/ships/ufo.png"), 32, 32);
        Animation animation = new Animation("enemyShip", spriteSheet, 150);
        Animator animator = new Animator(Arrays.asList(animation).toArray(Animation[]::new));
        addComponent(animator);
        animator.setActiveAnimation("enemyShip");
        addComponent(new BoxCollider());
    }

}
