package at.sat.games.wintergame;

import org.newdawn.slick.Graphics;

public class RectangleActor extends AbstractActor {

    public RectangleActor(Movement movement) {
        super(movement);
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawRect(this.movement.getX(), this.movement.getY(), 40, 20);
        graphics.fillRect(this.movement.getX(), this.movement.getY(), 40, 20);
    }
}
