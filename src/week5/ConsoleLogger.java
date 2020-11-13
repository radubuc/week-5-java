 package week5;

import java.util.Date;

public class ConsoleLogger implements Logger {

	@Override //means coming from Logger
	public void info(String info) {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		System.out.println(date.toString() + ": " + info);
	}

	@Override
	public void warning(String warning) {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		System.out.println(date.toString() + " " + "Warning - " + warning);
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		System.err.println(date.toString() + " " + "Error - " + error);
		
	}

	@Override
	public void fatal(String fatal) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.err.println(date.toString() + " " + "FATAL!!!! " + fatal.toUpperCase());
	}

	@Override
	public void close() {
		
	}
}
