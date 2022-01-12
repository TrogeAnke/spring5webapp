/*
 * Copyright © NORD/LB Norddeutsche Landesbank Girozentrale, Hannover - Alle Rechte vorbehalten -
 */

package guru.springframework.springin5steps;

import guru.springframework.springin5steps.basic.BinarySearchImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Spring5StepsBasicApplication {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext =
				  new AnnotationConfigApplicationContext(Spring5StepsBasicApplication.class)) {

			BinarySearchImpl binarySearch =
					applicationContext.getBean(BinarySearchImpl.class);

			BinarySearchImpl binarySearch1 =
					applicationContext.getBean(BinarySearchImpl.class);

			System.out.println("binarySearch  = " + binarySearch);
			System.out.println("binarySearch1 = " + binarySearch1);

			int result = binarySearch.binarySearch(new int[]{7, 5, 8, 4}, 4);

			System.out.println("Result is " + result);
		}

	}
}
