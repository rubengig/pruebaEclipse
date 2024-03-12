package superPaint;

import java.awt.Color;
import java.awt.Graphics;

public class Ovalo extends FiguraRellenada{
	
	public Ovalo( int x1, int y1, int x2, int y2, Color color, boolean relleno){
        super(x1, y1, x2, y2, color,relleno);
    } 
    
    @Override
    public void draw(Graphics g){
    	
    	
        g.setColor(getColor());
            g.drawRect( getXArriba(), getYArriba(), getAncho(), getAltura());    
    } 

}
