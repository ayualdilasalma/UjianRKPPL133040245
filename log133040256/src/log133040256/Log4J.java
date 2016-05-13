package log133040256;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Log4J {
	
	private static Logger logger = Logger.getLogger(Log4J.class);
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
		Log4JDemo l = new  Log4JDemo();
		l.a();
	}
	
	
	
	

}
