package StatePattern;

public class StatePattern1 {
	   public static void main(String[] args) {
	      Context context = new Context();

	      Start startState = new Start();
	      startState.doAction(context);

	      System.out.println(context.getState().toString());

	      Stop stopState = new Stop();
	      stopState.doAction(context);

	      System.out.println(context.getState().toString());
	   }
	}