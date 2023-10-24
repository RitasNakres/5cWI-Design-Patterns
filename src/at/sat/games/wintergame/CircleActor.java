package at.sat.games.wintergame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class CircleActor {

    public CircleActor(float x, float y) {
        this.x = x;
        this.y = y;
    }

    private float x, y;

    // float -> Datentyp, der Bruchzahlen/Kommazahlen speichern kann
    public void update(GameContainer gc, int delta) {
        this.x++;
    }

    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, 20, 20);
    }
}
