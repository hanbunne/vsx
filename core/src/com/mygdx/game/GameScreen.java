package com.mygdx.game;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen extends ScreenAdapter {
	private VersusX versusx;
	private Texture playerImg;
	
	public GameScreen(VersusX versusx){
		this.versusx = versusx;
		playerImg = new Texture("player.png");
	}
	
	@Override
    public void render(float delta) {
        SpriteBatch batch = versusx.batch;
        batch.begin();
        batch.draw(playerImg, 100, 100);
        batch.end();
    }
	
	
}
