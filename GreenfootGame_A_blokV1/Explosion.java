import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion extends Actor
{
    private int count=0;
    
    private void explosion(){
    if (count<100){
        count++;
    } else
        getWorld().removeObject(this);;
    }
    
    
    public void act() 
    {
       explosion(); 
    }    
}
