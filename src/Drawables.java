
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dmitry
 */
public interface Drawables {
    
    // just an easier way to organize the drawable objects to send them to the Main class to be drawed
    public void draw(Graphics g, int camx, int camy);
}
