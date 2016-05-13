package log133040256;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Log4J {
	
	private static Logger logger = Logger.getLogger(Log4J.class);
	
	public void pesanSatu() {
		
		if ( logger.isDebugEnabled() ) {
			logger.info("Ini adalah debuh message");
		}
  	}
	
	
	public void pesanDua() {
		logger.info("Ini adalah info message");
	}
	
	private void pesanTiga() {
		logger.
	}
	
	
	

}
