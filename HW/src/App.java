
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger aLogger = new AsteriskLogger();
		aLogger.log("Hello");
		System.out.println("\n");
		aLogger.error("Hello");
		System.out.println("\n");
		aLogger.log("sarcasm");
		System.out.println("\n");
		aLogger.error("sarcasm broken");
		System.out.println("\n");
		aLogger.error("This is a super long freaking error!!!!!");
		
		System.out.println("\n-----------------");
		
		Logger sLogger = new SpacedLogger();
		sLogger.log("Hello");
		System.out.println("\n");
		sLogger.error("Hello");
		System.out.println("\n");
		sLogger.log("what?");
		System.out.println("\n");
		sLogger.error("huh?");
	}

}
