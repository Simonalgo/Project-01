import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class sets the image for robot objects and is compounded with several methods which are described below.
 * 
 * Authors: Jerick Castro Ortiz (@J3r1ckSB), Simón Andrés Álvarez González (@Simonalgo), Santiago Barrera Salamanca (@Sanbarrera9090) 
 * Version: 1.1.0 - 02/04/2021
 */
public class Robot extends Actor
{
  /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      eatApple();
      detectWallCollision();
      detectBlockCollision();
      detectHome();
      robotMovement();
    }
  /**
     * robotMovement - allows the robot to move. This method is called whenever
     * the 'Act' method is called.
     */
  public void robotMovement() 
    {
      int y=getY();
      if(Greenfoot.isKeyDown("right"))
      move(2);
      if(Greenfoot.isKeyDown("left"))
      move(-2); 
        if(Greenfoot.isKeyDown("up"))
           y--;
           if(Greenfoot.isKeyDown("down"))
           y++; 
        setLocation(getX(),y);
    }
  /**
     * eatApple - allows the robot to eat the apple objects. This method is called whenever
     * the 'Act' method is called.
     */
  public void eatApple(){
        Actor Apple;
        Apple = getOneObjectAtOffset(0,0, Apple.class);
        if (Apple != null){
            World mundo;
            mundo = getWorld();
            mundo.removeObject(Apple);
            Greenfoot.playSound("eat.wav");
        }
    }
  /**
     * detectWallCollision - makes the robot go back to the starting location if it touches a wall object. This method is called whenever
     * the 'Act' method is called.
     */
  public void detectWallCollision(){
        if (isTouching(Wall.class)){
            setLocation(48,50);
            Greenfoot.playSound("hurt.wav");
        }
    }
  /**
     * detectBlockCollision - makes the robot go back to the starting location if it touches a block object. This method is called whenever
     * the 'Act' method is called.
     */
  public void detectBlockCollision(){
        if (isTouching(Block.class)){
            setLocation(48,50);
            Greenfoot.playSound("hurt.wav");
        }
    }
  /**
     * detectHome - makes the robot go back to the starting location if it touches a home object. This is considered a win. This method is called whenever
     * the 'Act' method is called.
     */
  public void detectHome(){
        if (isTouching(Home.class)){
            setLocation(48,50);
            Greenfoot.playSound("missionpassed.wav");
        }
    }
    }




