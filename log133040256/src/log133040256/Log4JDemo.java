package log133040256;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Log4JDemo {
	private static final Logger logger =  Logger.getLogger(Log4JDemo.class);
	
	public void a() {
		
		
		
		
		
		
		
		
			logger.log(Level.DEBUG, "Ini adalah debug message : ");
		
			
			
			logger.info("Ini adalah info message :  ");
			
			
			logger.log(Level.WARN, "Ini adalah debug message : ");
			logger.log(Level.ERROR, "Ini adalah fatal message : ");
			logger.log(Level.FATAL, "Ini adalah error message : ");
			logger.trace(getClass());
	}

}
