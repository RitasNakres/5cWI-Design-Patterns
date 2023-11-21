package at.sat.games.wintergame;

import org.newdawn.slick.Graphics;

public class CircleActor extends AbstractActor {
    private Movement movement;

    public CircleActor(Movement movement) {
        super(movement);
    }

    public void render(Graphics graphics) {
        graphics.drawOval(this.movement.getX(), this.movement.getY(), 20, 20);
        graphics.fillOval(this.movement.getX(), this.movement.getY(), 20, 20);
    }
}
