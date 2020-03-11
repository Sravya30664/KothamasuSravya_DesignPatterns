package BridgePattern;

public abstract class Shape {
	   protected Outline drawAPI;
	   
	   protected Shape(Outline drawAPI){
	      this.drawAPI = drawAPI;
	   }
	   public abstract void draw();	
	}
