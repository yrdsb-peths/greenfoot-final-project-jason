import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tail here.
 * tail of snake
 * Jason Sun (your name) 
 * June 2022 (a version number or a date)
 */
public class Tail extends Actor
{
    int r,b, player;
    int countLength = 0;
    static int blueLength = 1;
    public Tail(int r, int g, int b)
    {
        //tail length increases
        this.r = r;
        this.b = b; 
        getImage().setColor(new Color(r,g,b));
        getImage().fillRect(0,0,40,40); 
    }
    /**
     * Act - do whatever the tail wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        countLength++;
        if(countLength>15 && isTouching(Player.class))
        {
            //lose if you hit yourself
            getWorld().addObject(new YouLose(),getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
            
        }
        if (player == 0 && countLength % blueLength == 0 )
        {
            getWorld().removeObject(this);
            blueLength++;
        }
       
        
    }
}
