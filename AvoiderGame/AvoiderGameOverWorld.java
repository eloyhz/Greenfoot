import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AvoiderGameOverWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AvoiderGameOverWorld extends World
{

    /**
     * Constructor for objects of class AvoiderGameOverWorld.
     * 
     */
    public AvoiderGameOverWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    
    @Override
    public void act()
    {
        if (Greenfoot.mouseClicked(this))   {
            AvoiderWorld newGame = new AvoiderWorld();
            Greenfoot.setWorld(newGame);
        }
    }
}
