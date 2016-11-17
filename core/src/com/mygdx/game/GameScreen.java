package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen extends ScreenAdapter {
	private VersusX versusx;
	private Texture playerImg;
	private int x;
	private int y;
	
	public GameScreen(VersusX versusx){
		this.versusx = versusx;
		playerImg = new Texture("player.png");
		x = 100;
		y = 100;
	}
	
	@Override
    public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        update(delta);
        SpriteBatch batch = versusx.batch;
        batch.begin();
        batch.draw(playerImg, x, y);
        batch.end();
    }
	
	private void update(float delta) {
        if(Gdx.input.isKeyPressed(Keys.A)) {
            x -= 10;
        }
        if(Gdx.input.isKeyPressed(Keys.D)) {
            x += 10;
        }
        if(Gdx.input.isKeyPressed(Keys.W)) {
            y += 10;
        }
        if(Gdx.input.isKeyPressed(Keys.S)) {
            y -= 10;
        }
    }
	
}
