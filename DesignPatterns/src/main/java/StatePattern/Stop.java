package StatePattern;

public class Stop implements State {

	   public void doAction(Context context) {
	      System.out.println("Player is in stop state");
	      context.setState(this);	
	   }

	   public String toString(){
	      return "Stop State";
	   }
	}
