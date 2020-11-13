
public class SpacedLogger implements Logger {

	@Override
	public void log(String x) {
		// TODO Auto-generated method stub
		
		StringBuilder string = new StringBuilder();
		for(int i = 0; i < x.length(); i++) {
			string.append(x.charAt(i) + " ");
		}
		System.out.println(string);
	}

	@Override
	public void error(String x) {
		// TODO Auto-generated method stub
		
		System.out.print("ERROR: ");
		log(x);
	}
}
