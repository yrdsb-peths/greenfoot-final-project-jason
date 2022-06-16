import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int r, g,b, player;
    int speed = 3;
    int count = 0;
    GreenfootSound eatSound = new GreenfootSound ("Eat.mp3");
    public Player(int player, int r, int g, int b)
    {
        //sets player
        setRotation(270);
        this.r = r;
        this.g = g;
        this.b = b;
        this.player = player;   
        getImage().setColor(new Color(r,g,b));
        getImage().fillRect(0,0,40,40);
    }

    public void act()
    {
        //allows tail to grow
        count++;
        getWorld().addObject(new Tail(r, g, b), getX(), getY());
        move(speed);
        moveAround();
        eatFood();
        
    }
    public void moveAround()
    {
        //moves around
        if(this.player == 0)
        {

            if(Greenfoot.isKeyDown("right"))
            {
                setRotation(0);
            }
            if(Greenfoot.isKeyDown("left"))
            {
                setRotation(180);
            }
            if(Greenfoot.isKeyDown("up"))
            {
                setRotation(270);
            }
            if(Greenfoot.isKeyDown("down"))
            {
                setRotation(90);
            }
        }
        if(this.player == 0 )
        {

            if(Greenfoot.isKeyDown("d"))
            {
                setRotation(0);
            }
            if(Greenfoot.isKeyDown("a"))
            {
                setRotation(180);
            }
            if(Greenfoot.isKeyDown("w"))
            {
                setRotation(270);
            }
            if(Greenfoot.isKeyDown("s"))
            {
                setRotation(90);
            }
        } 
    }
    public void eatFood()
    {
        //what happens when snake eats food
        if(isTouching(Food.class)&& player ==0)
        {
            MyWorld myWorld = (MyWorld) getWorld();
            myWorld.blueCounter.addScore();
            eatSound.play(); 
            
        }
       
    }
}
