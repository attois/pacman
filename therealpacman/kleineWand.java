import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kleineWand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kleineWand extends Actor
{
    public kleineWand(){
       
        this.getImage().scale(20,100);
        
        
    }
    
    /**
     * Act - do whatever the kleineWand wants to do. This method is called whenever
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
