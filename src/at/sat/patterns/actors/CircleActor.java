package at.sat.games.wintergame;

import org.newdawn.slick.Graphics;

import java.awt.*;

public class CircleActor extends AbstractActor implements Observer {
    private Movement movement;
    private Color color;

    public CircleActor(Movement movement) {
        super(movement);
        this.movement = movement;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.setColor(this.color);
        graphics.drawOval(this.movement.getX(), this.movement.getY(), 20, 20);
        graphics.fillOval(this.movement.getX(), this.movement.getY(), 20, 20);
        graphics.setColor(org.newdawn.slick.Color.white);
    }

    public void inform() {
        this.color = Color.orange;
    }
}
