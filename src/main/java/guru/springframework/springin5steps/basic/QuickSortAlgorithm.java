/*
 * Copyright © NORD/LB Norddeutsche Landesbank Girozentrale, Hannover - Alle Rechte vorbehalten -
 */

package guru.springframework.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * User: Trogea Zeit: 06.01.2022, 13:46
 **/
@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {
  public int[] sort(int[] numbers) {
    //Logic for Quick Sort
    return numbers;
  }
}
