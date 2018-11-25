package com.zum.gsa.broadcaster.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Entity(name = "gom_tv")
@Table
@Getter
@EqualsAndHashCode
public class GomTv extends Clip {

  @Id
  private long id;

}
