package BridgePattern;

public class Bridge {
	   public static void main(String[] args) {
	      Shape redCircle = new Circle(50,50, 10, new RedCircle());
	      Shape blueCircle = new Circle(25,25, 10, new BlueCircle());

	      redCircle.draw();
	      blueCircle.draw();
	   }
	}
