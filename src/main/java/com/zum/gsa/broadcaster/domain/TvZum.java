package com.zum.gsa.broadcaster.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "tv_zum")
@Table
public class TvZum extends Clip {

  @Id
  private long id;
}
