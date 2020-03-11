package StatePattern;

public class Start implements State {

	   public void doAction(Context context) {
	      System.out.println("Car is in start state");
	      context.setState(this);	
	   }

	   public String toString(){
	      return "Start State";
	   }
	}
