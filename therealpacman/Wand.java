import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wand extends Actor
{
    
    public Wand(){
        this.getImage().scale(100,20);
    }
    /**
     * Act - do whatever the Wand wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(this.isTouching(Punkt.class)) {
            
            this.removeTouching(Punkt.class);

        }
    }    
}
