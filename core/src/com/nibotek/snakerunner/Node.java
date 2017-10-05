package com.nibotek.snakerunner;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.RandomXS128;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by nbourre on 2017-10-04.
 */

public class Node extends Actor{
    Vector2 position = new Vector2();
    Node parent = null;

    public Node(float x, float y) {
        position.x = x;
        position.y = y;
    }

    public Node () {
        position.x = new RandomXS128().nextFloat();
        position.y = new RandomXS128().nextFloat();
    }

    public Node (Node parent) {
        this.parent = parent;
    }


    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
    }
}
