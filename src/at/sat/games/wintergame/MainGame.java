package at.sat.games.wintergame;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class MainGame extends BasicGame {
    private List<Actor> actors;

    public MainGame(String title) {
        super(title);
    }


    @Override
    public void init(GameContainer gameContainer) {
// baut spiel auf,generiert Objekte, wird einmal aufgerufen am Beginn des Spieles
        this.actors = new ArrayList<>();
        Movement mr1 = new MoveRight(0, 0, 0.3f);
        Movement ml2 = new MoveLeft(0, 20, 0.1f);
        Movement mr3 = new MoveRight(0, 75, 0.175f);
        Movement mrc1 = new MoveRight(50, 125, 0.223f);
        Movement mrc2 = new MoveRight(85, 300, 0.278f);
        Movement omr1 = new MoveRight(300, 400, 0.189f);
        this.actors.add(new RectangleActor(mr1));
        this.actors.add(new RectangleActor(ml2));
        this.actors.add(new RectangleActor(mr3));
        this.actors.add(new CircleActor(mrc1));
        this.actors.add(new CircleActor(mrc2));
        this.actors.add(new Olaf());
    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
// wird laufend aufgerufen, int delta gibt die vergangene Zeit nach dem letzten Aufruf an
        for (Actor actor : this.actors) {
            actor.update(gc, delta);
        }
    }

    @Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {
// wird nur dann aufgerufen, wenn es nötig ist, zeichnet

        for (Actor actor :
                this.actors) {
            actor.render(graphics);
        }
    }

    public static void main(String[] argv) {
        MainGame mg = new MainGame("Wintergame");
        try {
            AppGameContainer container = new AppGameContainer(mg);
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}
