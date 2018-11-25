package com.zum.gsa.broadcaster.domain;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Entity(name = "clip")
@Table
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter
@EqualsAndHashCode
public class Clip {

  @Id
  private long id;

  private long programId;
  private String programTitle;

}
