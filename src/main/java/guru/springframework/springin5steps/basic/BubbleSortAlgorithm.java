/*
 * Copyright © NORD/LB Norddeutsche Landesbank Girozentrale, Hannover - Alle Rechte vorbehalten -
 */

package guru.springframework.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * User: Trogea Zeit: 06.01.2022, 13:40
 **/
@Component
@Qualifier("bubble")
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm{
  public int[] sort(int[] numbers) {
    //Logic for Bubble Sort
    return numbers;
  }
}
