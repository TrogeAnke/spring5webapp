/*
 * Copyright © NORD/LB Norddeutsche Landesbank Girozentrale, Hannover - Alle Rechte vorbehalten -
 */

package guru.springframework.springin5steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * User: Trogea Zeit: 06.01.2022, 13:26
 **/
@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {

  private Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  private SortAlgorithm sortAlgorithm;

  public int binarySearch(int[] numbers, int numberToSearchFor) {

    int[] sortedNumbers = sortAlgorithm.sort(numbers);
    //Search the array
    System.out.println(sortAlgorithm);
    return 3;
  }

  @PostConstruct
  public void postConstruct(){
        logger.info("postConstruct");
  }

  @PreDestroy
  public void preDestroy(){
         logger.info("preDestroy");
  }

}
