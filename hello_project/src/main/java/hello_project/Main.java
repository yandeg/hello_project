package hello_project;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	
	private static final Logger LOGGER = LogManager.getLogger(Main.class);
	
	public static void main(String[] args) {
		
		LOGGER.info("ceci est un message de niveau info");
		Hello chaine= new Hello();
		chaine.afficheur("Hello");
		

	}

}
