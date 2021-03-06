package com.cx.uioc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * UiocApplication Class
 */
@SpringBootApplication
@EnableTransactionManagement
@EnableScheduling
@MapperScan(basePackages = "com.cx.uioc.mapper")
public class UiocApplication extends ServletInitializer {
	/** Logger */
    private static final Logger logger = LogManager.getLogger(UiocApplication.class);
    
    /** Constructor */
    public UiocApplication() {
    	// Do nothing
	}
    
    
        

	/**
	 * main() method - startup entry
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		logger.info(UiocApplication.class.getName() + ".main []");
		
		SpringApplication.run(UiocApplication.class, args);
        
	}
	
	
}
