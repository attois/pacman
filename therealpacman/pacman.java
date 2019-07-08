import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pacman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pacman extends Actor
{
    private String img;
    private GifImage gif;
    public int punkte=0;
    public pacman()
    {
        this.img = img;
        gif = new GifImage("GnT.gif");
        int scalePercent = 50;

    }

    /**
     * Act - do whatever the pacman wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {

        setImage( gif.getCurrentImage() );
        if(Greenfoot.isKeyDown("Right")){
            this.setRotation(0); 
            Actor a = getOneObjectAtOffset(20,0,Wand.class);
            if (a==null){
                this.move(2);
            } 
        }

        if(Greenfoot.isKeyDown("Left")){
            this.setRotation(180);
            Actor a = getOneObjectAtOffset(-20,0,Wand.class);
            if (a==null){
                this.move(2);
            } 
        }
        if(Greenfoot.isKeyDown("Up")){
            this.setRotation(270); 
            Actor a = getOneObjectAtOffset(0,-20,Wand.class);
            if (a==null){
                this.move(2);
            } 
        }
        if(Greenfoot.isKeyDown("Down")){
            this.setRotation(90);     
            Actor a = getOneObjectAtOffset(0,20,Wand.class);
            if (a==null){
                this.move(2);
            }               
        }

        if(this.isTouching(Punkt.class)) {
            this.punkte = this.punkte + 1;
            this.removeTouching(Punkt.class);

        }

        // {
        // this.stopp(Wand.class);
        // }

        // if(this.isTouching(kleineWand.class)) {

        // }
    }    
}

