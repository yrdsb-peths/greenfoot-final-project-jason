import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * keeps track of score
 *Jason Sun (your name) 
 * June 2022 (a version number or a date)
 */
public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int score = 0;
   
    public void act()
    {
        //displays score
        setImage(new GreenfootImage("Score: " + score, 30, Color.BLACK, Color.WHITE));
    }

    public void addScore()
    {
        //adds score
        score++;
    }

    
}
