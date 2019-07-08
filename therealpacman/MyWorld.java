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
        addObject(w1, 108, 83);
        Actor w7 = new Wand();
        addObject(w7, 208, 83);
        Actor w8 = new Wand();
        addObject(w8, 308, 83);
        Actor w9 = new Wand();
        addObject(w9, 408, 83);
        Actor w10 = new Wand();
        addObject(w10, 500, 83);
        
        Actor w2 = new Wand();
        addObject(w2, 108, 323);
        Actor w3 = new Wand();
        addObject(w3, 208, 323);
        Actor w4 = new Wand();
        addObject(w4, 308, 323);
        Actor w5 = new Wand();
        addObject(w5, 408, 323);
        Actor w6 = new Wand();
        addObject(w6, 500, 323);
        
        Actor a1 = new Wand();
        addObject(a1, 108, 203);
        Actor a2 = new Wand();
        addObject(a2, 208, 203);
        Actor a3 = new Wand();
        addObject(a3, 308, 323);
        Actor a4 = new Wand();
        addObject(a4, 408, 203);
        Actor a5 = new Wand();
        addObject(a5, 500, 203);
        
        Actor b1 =new Wand();
        b1.setRotation(90);
        addObject(b1,110,93);
        
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


