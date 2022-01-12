/*
 * Copyright © NORD/LB Norddeutsche Landesbank Girozentrale, Hannover - Alle Rechte vorbehalten -
 */

package guru.springframework.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * User: Trogea Zeit: 11.01.2022, 10:15
 **/

@Component

public class ComponentDAO {

  @Autowired
  ComponentJdbcConnection jdbcConnection;

  public ComponentJdbcConnection getJdbcConnection() {
    return jdbcConnection;
  }

  public void setJdbcConnection(
      ComponentJdbcConnection jdbcConnection) {
    this.jdbcConnection = jdbcConnection;
  }

}
