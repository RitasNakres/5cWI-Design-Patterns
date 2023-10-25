package at.sat.games.wintergame;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class MainGame extends BasicGame {
    private List<RectangleActor> rectangles = new ArrayList<>();
    private List<CircleActor> circles = new ArrayList<>();

    public MainGame(String title) {
        super(title);
    }


    @Override
    public void init(GameContainer gameContainer) throws SlickException {
// baut spiel auf,generiert Objekte, wird einmal aufgerufen am Beginn des Spieles
        RectangleActor ra1 = new RectangleActor(100, 150);
        RectangleActor ra2 = new RectangleActor(150, 200);
        RectangleActor ra3 = new RectangleActor(250, 200);
        CircleActor ca1 = new CircleActor(200, 250);
        CircleActor ca2 = new CircleActor(275, 325);
        rectangles.add(ra1);
        rectangles.add(ra2);
        rectangles.add(ra3);
        circles.add(ca1);
        circles.add(ca2);
    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
// wird laufend aufgerufen, int delta gibt die vergangene Zeit nach dem letzten Aufruf an
        for (RectangleActor actor : rectangles) {
            actor.update(gc, delta);
        }

        for (CircleActor circle : circles) {
            circle.update(gc, delta);
        }
    }

    @Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {
// wird nur dann aufgerufen, wenn es nötig ist, zeichnet
        for (RectangleActor actor : rectangles) {
            actor.render(graphics);
        }
        for (CircleActor circle : circles) {
            circle.render(graphics);
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
