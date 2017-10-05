package com.nibotek.snakerunner;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class SnakeRunner extends ApplicationAdapter {
	Stage stage;
	Snake snake;

	@Override
	public void create () {
		stage = new Stage(new ScreenViewport());

		snake = new Snake();
		stage.addActor(snake);
		Gdx.input.setInputProcessor(stage);
	}

	float frameRate = 30/1000.0f;
	float timeAcc = 0;

	@Override
	public void render () {
		inputs();
		update();

		if (timeAcc >= frameRate) {
			timeAcc = 0;

			display();
		}

		timeAcc += Gdx.graphics.getDeltaTime();
	}

	private void inputs(){

	}

	private void update() {

	}

	private void display() {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.draw();
	}

	
	@Override
	public void dispose () {

	}
}
