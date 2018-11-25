package com.zum.gsa.broadcaster.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Entity(name = "tv_zum")
@Table
@Getter
@EqualsAndHashCode
public class TvZum extends Clip {

  @Id
  private long id;
}
