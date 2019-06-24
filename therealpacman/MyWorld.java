import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * https://stephan-meyer.net/kanboard/
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends greenfoot.World
{
    public int punkte;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Actor h = new Hintergrund();
        addObject(h, 300, 200);
        Actor w1 = new Wand();
        addObject(w1, 303, 107);
        Actor w2 = new Wand();
        addObject(w2, 303, 293);
        Actor w3 = new kleineWand();
        addObject(w3, 200, 235);
         Actor w4 = new kleineWand();
        addObject(w4, 440, 165);
        
        Actor a = new pacman();
        addObject(a, 300, 200);
        for (int j=20;j<=600;j=j+30){
            for(int i=20;i<400;i=i+30){
                Actor p = new Punkt();
                addObject(p, j, i);
                Actor p1 = new Punkt();
            }
        }
        
        showText("Sie haben " + punkte + " Punkte!", 100, 100);


    }
}


