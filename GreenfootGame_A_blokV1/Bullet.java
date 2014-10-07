import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{

    //exploderen en verdrwijnenn als een muur geraakt word
    private void wallCollide(){
        if(isTouching(MovingWall.class)||isTouching(IndestructableWall.class)){
            explode();
        } else if (isTouching(DestructableWall.class)){
           removeTouching(DestructableWall.class);
           explode();
        } else if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
   
    private void explode(){
        World world = getWorld();
        world.addObject(new Explosion(), getX(), getY());
        world.removeObject(this); // remove rocket from world 
    }

    
    public void act() 
    {
       wallCollide();
       move(20);    
    }    

   
    }

