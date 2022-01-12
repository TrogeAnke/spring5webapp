/*
 * Copyright © NORD/LB Norddeutsche Landesbank Girozentrale, Hannover - Alle Rechte vorbehalten -
 */

package guru.springframework.springin5steps;

import guru.springframework.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("guru.springframework.componentscan")

public class Spring5StepsComponentScanApplication {

	private static Logger LOGGER =
			LoggerFactory.getLogger(Spring5StepsComponentScanApplication.class);

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext =
				   new AnnotationConfigApplicationContext(Spring5StepsComponentScanApplication.class)) {

					ComponentDAO componentDao = applicationContext.getBean(ComponentDAO.class);

					LOGGER.info("{}",componentDao);
		}

	}
}
