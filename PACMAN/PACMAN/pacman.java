import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class pacman extends Actor
{

    private String img;
    private GifImage gif;
    Boundary e = new Boundary();
    Boundary f = new Boundary();
    Boundary g = new Boundary();
    Boundary h = new Boundary();    

    public pacman()
    {
        this.img = img;
        gif = new GifImage("GnT.gif");
        int scalePercent = 50;

    }

    public void act()
    {
        setImage( gif.getCurrentImage() );
        if(Greenfoot.isKeyDown("Right"))
        {

              
            e.setRotation(0);
            e.move(2);
            f.setRotation(0);
            f.move(2);
            g.setRotation(0);
            g.move(2);
            h.setRotation(0);
            h.move(2);
            setRotation(0);
            move(2);
        }

        if(Greenfoot.isKeyDown("Left"))
        {

               
            e.setRotation(180);
            e.move(2);
            f.setRotation(180);
            f.move(2);
            g.setRotation(180);
            g.move(2);
            h.setRotation(180);
            h.move(2);
            setRotation(180);
            move(2);

        }
        if(Greenfoot.isKeyDown("Up"))
        {

               
            e.setRotation(270);
            e.move(2);
            f.setRotation(270);
            f.move(2);
            g.setRotation(270);
            g.move(2);
            h.setRotation(270);
            h.move(2);
            setRotation(270);
            move(2);

        }
        if(Greenfoot.isKeyDown("Down"))
        {

            e.setRotation(90);
            e.move(2);
            f.setRotation(90);
            f.move(2);
            g.setRotation(90);
            g.move(2);
            h.setRotation(90);
            h.move(2);
            setRotation(90); 
            move(2);

        }
    }

    
}
