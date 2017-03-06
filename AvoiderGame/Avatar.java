import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Avatar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Avatar extends Actor
{
    /**
     * Act - do whatever the Avatar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        followMouse();
        checkForCollisions();
    }    
    
    public void followMouse()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null)  {
            this.setLocation(mouse.getX(), mouse.getY());
        }
    }
    
    private void checkForCollisions()   
    {
        Actor enemy = this.getOneIntersectingObject(Enemy.class);
        if (enemy != null)  {
            // AvoiderWorld world = this.getWorldOfType(AvoiderWorld.class);
            AvoiderWorld world = (AvoiderWorld)this.getWorld();
            world.endGame();
        }
    }
    
   
}
