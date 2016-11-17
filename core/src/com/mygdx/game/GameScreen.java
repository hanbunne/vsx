package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class GameScreen extends ScreenAdapter {
	private VersusX versusx;
	private Texture playerImg;
	
	private Player1 player1;
	
	public GameScreen(VersusX versusx){
		this.versusx = versusx;
		playerImg = new Texture("player.png");
		player1 = new Player1(100,100);
	}
	
	@Override
    public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        update(delta);
        SpriteBatch batch = versusx.batch;
        batch.begin();
        Vector2 pos = player1.getPosition();
        batch.draw(playerImg, pos.x, pos.y);
        batch.end();
    }
	
	private void update(float delta) {
        if(Gdx.input.isKeyPressed(Keys.A)) {
        	player1.move(Player1.DIRECTION_LEFT);
        }
        if(Gdx.input.isKeyPressed(Keys.D)) {
        	player1.move(Player1.DIRECTION_RIGHT);
        }
        if(Gdx.input.isKeyPressed(Keys.W)) {
        	player1.move(Player1.DIRECTION_UP);
        }
        if(Gdx.input.isKeyPressed(Keys.S)) {
        	player1.move(Player1.DIRECTION_DOWN);
        }
    }
	
}
