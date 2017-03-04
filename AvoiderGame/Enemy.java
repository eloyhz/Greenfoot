import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        this.setLocation(this.getX(), this.getY() + 1);
        turn(5);
    }    
    
    private void checkRemove()
    {
        World w = this.getWorld();
        
        if (this.getY() > w.getHeight() + 30) {
            w.removeObject(this);
        }
    }
}
