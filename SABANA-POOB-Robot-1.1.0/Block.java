import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class sets the image for block objects and make them rotate.
 * 
 * Authors: Jerick Castro Ortiz (@J3r1ckSB), Simón Andrés Álvarez González (@Simonalgo), Santiago Barrera Salamanca (@Sanbarrera9090) 
 * Version: 1.1.0 - 02/04/2021
 */
public class Block extends Actor
{
    /**
     * Act - do whatever the Block wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        turn(1);
    }    
}
