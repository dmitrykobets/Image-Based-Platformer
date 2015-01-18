/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dmitry
 */
public class SmallPotion extends ObstacleMain{
    public SmallPotion(int x, int y, int width, int height, String sprite)
    {
        super(x, y, width, height, sprite, true);
    }
    
    @Override 
    public boolean collideX(PlayerMain p)
    {
        p.x -= p.width/2;
        p.y -= p.height/2;
        p.width *= 2;
        p.height *= 2;
        deleteThis();
        return true;
    }
    
    @Override 
    public boolean collideY(PlayerMain p)
    {
        p.x -= p.width/2;
        p.y -= p.height/2;
        p.width *= 2;
        p.height *= 2;
        deleteThis();
        return true;
    }
    
    
}
