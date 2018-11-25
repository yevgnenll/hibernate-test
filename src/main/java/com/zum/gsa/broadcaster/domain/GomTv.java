package com.zum.gsa.broadcaster.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "gom_tv")
@Table
public class GomTv extends Clip {

  @Id
  private long id;

}
