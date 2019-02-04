
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square wall2;
    private Square sky;
    private Square window1;
    private Square window2;
    private Square window3;
    private Square window4;
    private Square window5;
    private Square shutters1;
    private Square shutters2;
    private Square shutters3;
    private Square shutters4;
    private Square shutters5;
    private Square chimney;
    private Square door;
    private Square garage;
    private Square sidewalk;
    private Triangle roof;
    private Triangle roof2;
    private Circle sun;
    private Square grass;
    private Square trunk;
    private Circle tree1;
    private Circle tree2;
    private Circle tree3;
    private Circle tree4;
    private Circle tree5;
    private Circle doorknob;
    private Circle cathead;
    private Triangle ear1;
    private Triangle ear2;
    private Circle eye1;
    private Circle eye2;
    private Circle nose;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        
        sky = new Square();
        sky.changeColor("blue");
        sky.changeWidth(800);
        sky.changeHeight(500);
        sky.makeVisible();
        
        grass = new Square();
        grass.changeColor("green");
        grass.changeWidth(800);
        grass.changeHeight(100);
        grass.setLocation(0, 400);
        grass.makeVisible();
        
        trunk = new Square();
        trunk.changeColor("black");
        trunk.changeWidth(20);
        trunk.changeHeight(120);
        trunk.setLocation(645, 320);
        trunk.makeVisible();

        tree1 = new Circle();
        tree1.changeColor("green");
        tree1.changeSize(80);
        tree1.moveHorizontal(560);
        tree1.moveVertical(300);
        tree1.makeVisible();
        
        tree2 = new Circle();
        tree2.changeColor("green");
        tree2.changeSize(80);
        tree2.moveHorizontal(590);
        tree2.moveVertical(250);
        tree2.makeVisible();
        
        tree3 = new Circle();
        tree3.changeColor("green");
        tree3.changeSize(80);
        tree3.moveHorizontal(610);
        tree3.moveVertical(300);
        tree3.makeVisible();
        
        tree4 = new Circle();
        tree4.changeColor("green");
        tree4.changeSize(80);
        tree4.moveHorizontal(660);
        tree4.moveVertical(300);
        tree4.makeVisible();
        
        tree5 = new Circle();
        tree5.changeColor("green");
        tree5.changeSize(80);
        tree5.moveHorizontal(640);
        tree5.moveVertical(250);
        tree5.makeVisible();
       
        wall2 = new Square();
        wall2.changeColor("red");
        wall2.changeWidth(150);
        wall2.changeHeight(200);
        wall2.setLocation(360, 250);
        wall2.makeVisible();
        
        roof2 = new Triangle();
        roof2.changeColor("green");
        roof2.changeSize(90, 250);
        roof2.moveHorizontal(360);
        roof2.moveVertical(160);
        roof2.makeVisible();
        
        wall = new Square();
        wall.setLocation(60, 200);
        wall.changeWidth(300);
        wall.changeHeight(250);
        wall.makeVisible();
        wall.changeColor("magenta");
        
        door = new Square();
        door.changeSize(70,100);
        door.setLocation(180, 350);
        door.changeColor("red");
        door.makeVisible();
        
        doorknob = new Circle();
        doorknob.changeColor("black");
        doorknob.changeSize(10);
        doorknob.setLocation(230, 400);
        doorknob.makeVisible();
        
        
        sidewalk = new Square();
        sidewalk.changeSize(70,50);
        sidewalk.setLocation(180, 450);
        sidewalk.changeColor("yellow");
        sidewalk.makeVisible();
        
        shutters1 = new Square();
        shutters1.changeSize(80, 50);
        shutters1.setLocation(85, 370);
        shutters1.changeColor("red");
        shutters1.makeVisible();
        
        window1 = new Square();
        window1.changeSize(50, 50);
        window1.setLocation(100, 370);
        window1.changeColor("black");
        window1.makeVisible();
        
        shutters2 = new Square();
        shutters2.changeSize(80, 50);
        shutters2.setLocation(85, 270);
        shutters2.changeColor("red");
        shutters2.makeVisible();
        
        window2 = new Square();
        window2.changeSize(50, 50);
        window2.setLocation(100, 270);
        window2.changeColor("black");
        window2.makeVisible();
        
        shutters3 = new Square();
        shutters3.changeSize(80, 50);
        shutters3.setLocation(175, 270);
        shutters3.changeColor("red");
        shutters3.makeVisible();
        
        window3 = new Square();
        window3.changeSize(50, 50);
        window3.setLocation(190, 270);
        window3.changeColor("black");
        window3.makeVisible();
        
        shutters4 = new Square();
        shutters4.changeSize(80, 50);
        shutters4.setLocation(265, 270);
        shutters4.changeColor("red");
        shutters4.makeVisible();
        
        window4 = new Square();
        window4.changeSize(50, 50);
        window4.setLocation(280, 270);
        window4.changeColor("black");
        window4.makeVisible();
        
        shutters5 = new Square();
        shutters5.changeSize(80, 50);
        shutters5.setLocation(265, 370);
        shutters5.changeColor("red");
        shutters5.makeVisible();
        
        window5 = new Square();
        window5.changeSize(50, 50);
        window5.setLocation(280, 370);
        window5.changeColor("black");
        window5.makeVisible();
        
        cathead = new Circle();
        cathead.changeSize(25);
        cathead.changeColor("yellow");
        cathead.setLocation(290, 395);
        cathead.makeVisible();
        
        ear1 = new Triangle();
        ear1.changeColor("yellow");
        ear1.changeSize(15,10);
        ear1.setLocation(295, 390);
        ear1.makeVisible();
        
        ear2 = new Triangle();
        ear2.changeColor("yellow");
        ear2.changeSize(15,10);
        ear2.setLocation(310, 390);
        ear2.makeVisible();
        
        eye1 = new Circle();
        eye1.changeColor("black");
        eye1.changeSize(5);
        eye1.setLocation(295, 400);
        eye1.makeVisible();
        
        eye2 = new Circle();
        eye2.changeColor("black");
        eye2.changeSize(5);
        eye2.setLocation(305, 400);
        eye2.makeVisible();
        
        nose = new Circle();
        nose.changeColor("magenta");
        nose.changeSize(5);
        nose.setLocation(300, 407);
        nose.makeVisible();
        
        garage = new Square();
        garage.changeColor("magenta");
        garage.changeWidth(130);
        garage.changeHeight(170);
        garage.setLocation(370, 280);
        garage.makeVisible();
        
        chimney = new Square();
        chimney.changeColor("magenta");
        chimney.changeSize(50, 120);
        chimney.setLocation(90, 40);
        chimney.makeVisible();
       
        roof = new Triangle();
        roof.changeColor("red");
        roof.changeSize(180, 400);
        roof.moveHorizontal(160);
        roof.moveVertical(30);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(550);
        sun.moveVertical(30);
        sun.changeSize(80);
        sun.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window1.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window1.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
