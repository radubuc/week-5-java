
public class AsteriskLogger implements Logger{

	@Override
	public void log(String x) {
		// TODO Auto-generated method stub
		System.out.println("***" + x + "***");
	}

	@Override
	public void error(String x) {
		// TODO Auto-generated method stub
		StringBuilder starLine = new StringBuilder();
		for (int i = 0; i < 13 + x.length(); i++) {
			starLine.append("*");
		}
		System.out.println(starLine);
		System.out.println("***" + "ERROR: " + x + "***");
		System.out.println(starLine);
	}
}
