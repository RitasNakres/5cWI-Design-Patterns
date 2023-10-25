package at.sat.games.wintergame;

import org.newdawn.slick.GameContainer;

import java.awt.*;

public interface Actor {
    public void update(GameContainer gc, int delta);

    public void render(Graphics graphics);
}

