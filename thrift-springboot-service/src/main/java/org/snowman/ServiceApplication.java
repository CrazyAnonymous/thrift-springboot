package org.snowman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 
 * @author wj.andrew@yahoo.com
 * 
 *
 */
@SpringBootApplication
@ImportResource(locations = {"classpath:spring*.xml"})
public class ServiceApplication {
	
    public static void main( String[] args )
    {
        SpringApplication.run(ServiceApplication.class, args);
    }
}
