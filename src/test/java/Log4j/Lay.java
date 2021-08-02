package Log4j;

	import org.apache.log4j.BasicConfigurator;
	import org.testng.annotations.Test;
	import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator; 
	
	
	public class Lay {
	    static Logger log = Logger.getLogger(Lay.class);
	    @Test
	    public void basicconfig()
	    {
	    PropertyConfigurator.configure();
	    log.debug("Print debug message");
	    log.info("Print info message");
	    log.warn("Print warn message");
	    log.error("Print error message");
	    log.fatal("Print fatal message");
	    } 

}
