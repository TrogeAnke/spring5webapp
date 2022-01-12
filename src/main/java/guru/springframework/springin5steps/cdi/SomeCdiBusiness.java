/*
 * Copyright © NORD/LB Norddeutsche Landesbank Girozentrale, Hannover - Alle Rechte vorbehalten -
 */

package guru.springframework.springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * User: Trogea Zeit: 12.01.2022, 10:43
 **/

@Named
public class SomeCdiBusiness {

  @Inject
  SomeCdiDao someCdiDao;

  public SomeCdiDao getSomeCDIDAO() {
    return someCdiDao;
  }

  public void setSomeCDIDAO(SomeCdiDao someCdiDao) {
    this.someCdiDao = someCdiDao;
  }

}
