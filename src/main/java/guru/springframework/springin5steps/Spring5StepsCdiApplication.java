/*
 * Copyright © NORD/LB Norddeutsche Landesbank Girozentrale, Hannover - Alle Rechte vorbehalten -
 */

package guru.springframework.springin5steps;

import guru.springframework.springin5steps.cdi.SomeCdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Spring5StepsCdiApplication {

	private static Logger LOGGER  = LoggerFactory.getLogger(Spring5StepsCdiApplication.class);

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext =
				  new AnnotationConfigApplicationContext(Spring5StepsCdiApplication.class)){
			SomeCdiBusiness business = applicationContext.getBean(SomeCdiBusiness.class);

			LOGGER.info("{} dao-{}",business,business.getSomeCDIDAO());
		}
	}
}
