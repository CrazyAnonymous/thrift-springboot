package org.snowman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * 
 * @author wj.andrew@yahoo.com
 * 
 *
 */
@SpringBootApplication
@ImportResource(locations = {"classpath:spring*.xml"})
@PropertySources(value = {@PropertySource("classpath:application.properties")})
public class ClientApplication {
	
    public static void main( String[] args )
    {
        SpringApplication.run(ClientApplication.class, args);
    }
}
