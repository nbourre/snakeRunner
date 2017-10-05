package com.nibotek.snakerunner;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.utils.Array;

/**
 * Created by nbourre on 2017-10-04.
 */

public class Snake extends Actor {
    Texture texture = new Texture(Gdx.files.internal("badlogic.jpg"));

    /**
     * Length of the snake in nodes
     */
    int length;

    Array<Node> nodes = new Array<Node>();

    public Snake() {
        length = 1;

        nodes.add(new Node());
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(texture, 0, 0);
    }
}
