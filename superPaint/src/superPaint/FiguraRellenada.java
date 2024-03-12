package superPaint;

import java.awt.Color;
import java.awt.Graphics;

abstract class FiguraRellenada extends Figura{
	
	boolean relleno;
	
	 public FiguraRellenada(int x1, int y1, int x2, int y2, Color color, boolean relleno){
	        super(x1, y1, x2, y2, color);
	        this.relleno = relleno;
	    }
	 
	 public int getXArriba(){
	        return Math.min(getX1(),getX2());
	    }
	 
	    public int getYArriba(){
	        return Math.min(getY1(),getY2());
	    }

	    public int getAncho(){
	        return Math.abs(getX1()-getX2());
	    }

	    public int getAltura(){
	        return Math.abs(getY1()-getY2());
	    }

	    abstract public void draw( Graphics g );

}
