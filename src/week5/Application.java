package week5;

public class Application {
	
	static Logger logger;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Logger logger = new Logger(); Doesn't work because this is an interface, not concrete class
		Logger logger = new FileLogger();
		
		logger.info("Hello");
		logger.warning("This is a warning");
		logger.error("Oops, this is an error!");
		logger.fatal("Fatal error");
		
		logger.close();
		
		setLogger(new FileLogger());
		setLogger(new ConsoleLogger());
	}
	
	private static void setLogger(Logger l) {
		logger = l;
	}

}
