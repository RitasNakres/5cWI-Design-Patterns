package at.sat.games.wintergame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public interface Actor {
    public void update(GameContainer gc, int delta);

    public void render(Graphics graphics) throws SlickException;

}

