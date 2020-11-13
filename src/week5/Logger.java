package week5;

public interface Logger {

	public void info(String info); //No {} because no body
	public void warning(String warning);
	public void error(String error);
	public void fatal(String fatal);
	
	public void close();
}
