package game;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Game extends StateBasedGame {
    
    public static final int VIEW_SIZE_X = 640;
    public static final int VIEW_SIZE_Y = 512;
    public static final boolean DEBUG_MODE = false;
    public static final boolean DEBUG_COLLISION = false;
    
    public Game() {
        super("Slick Game");
    }
        
    public static void main(String[] args) {
        try {
            AppGameContainer app = new AppGameContainer(new Game());
            setupAGC(app);
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initStatesList(GameContainer container) throws SlickException {
        this.addState(new StatePlaying(0));
    }
    
    private static void setupAGC(AppGameContainer app) throws SlickException {
        app.setDisplayMode((int)VIEW_SIZE_X, (int)VIEW_SIZE_Y, false);
        app.setShowFPS(DEBUG_MODE);
        app.setVSync(true);
        app.setForceExit(true);
        app.setVerbose(DEBUG_MODE);
        app.start();
    }
}