package at.sat.games.wintergame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class RectangleActor {
    private float x, y;

    public RectangleActor(float x, float y) {
        this.x = x;
        this.y = y;
    }


    public void update(GameContainer gc, int delta) {
        this.x += 0.2;
        this.y += 0.2;
        if (this.x > 810) {
            this.x = 0;
        } else if (this.y > 600) {
            this.y = 0;
        }
    }

    public void render(Graphics graphics) throws SlickException {
        graphics.drawRect(this.x, this.y, 40, 20);
        graphics.fillRect(this.x, this.y, 40, 20);
        Image img = new Image("testdata/Diana.png");
        graphics.drawImage(img, 200, 200);
    }
}
