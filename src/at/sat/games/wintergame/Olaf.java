package at.sat.games.wintergame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;


public class Olaf implements Actor {

    @Override
    public void update(GameContainer gc, int delta) {

    }

    @Override
    public void render(Graphics g) throws SlickException {
        Image img = new Image("testdata/OlafSchneemann.png");
        g.scale(0.15f,0.15f);
        img.draw(400,300);
        g.resetTransform();
    }

}
