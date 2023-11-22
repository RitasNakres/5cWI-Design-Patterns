package at.sat.games.wintergame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public abstract class AbstractActor implements Actor {
    protected Movement movement;

    public AbstractActor(Movement movement) {
        this.movement = movement;
    }

    @Override
    public void update(GameContainer gc, int delta) {
        movement.update(delta);

    }

    @Override
    public void render(Graphics graphics) throws SlickException {

    }
}
