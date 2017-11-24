package com.sanddunes.starwars;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class GameClass extends ApplicationAdapter {
	SpriteBatch batch;
	private TextureAtlas textureAtlas;
	private Animation animation;
	private float elapsedTime = 0f;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		textureAtlas = new TextureAtlas((Gdx.files.internal("assets/rogueAtlas.atlas")));
		animation = new Animation(1f/30f, textureAtlas.getRegions());
	}

	@Override
	public void render () {
		elapsedTime += Gdx.graphics.getDeltaTime();
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw((TextureRegion)(animation.getKeyFrame(elapsedTime,true)), 0f, 0f);
 		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		textureAtlas.dispose();
	}
}
