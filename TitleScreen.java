import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    Label titleScreen = new Label ("Modified Snake version \n This is a modified version of snake \n your tail will grow automatically,\n and your apples will disappear \n after a while. \n Don't hit yourself or the wall! \n Use WASD or arrow keys to move \n press space to start ", 40);
    GreenfootImage tile = new GreenfootImage("tile000.png");
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleScreen, getWidth()/2, getHeight()/2);
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        // starts the game
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
}
