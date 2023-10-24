package at.sat.games.wintergame;

import org.newdawn.slick.*;

public class MainGame extends BasicGame {

    private int x,y;
    public MainGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
// baut spiel auf,generiert Objekte, wird einmal aufgerufen am Beginn des Spieles
        this.x = 100;
        this.y = 100;
    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
// wird laufend aufgerufen, int delta gibt die vergangene Zeit nach dem letzten Aufruf an
    }

    @Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {
// wird nur dann aufgerufen, wenn es nötig ist, zeichnet
        graphics.drawRect(this.x, this.y, 50, 50);
    }

    public static void main(String[] argv) {
        MainGame mg = new MainGame("Wintergame");
        try {
            AppGameContainer container = new AppGameContainer(mg);
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}
