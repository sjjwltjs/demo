package com.example.test.demo.job;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Teacher {

  @Column(columnDefinition = "id")
  private String id;

  @Column(columnDefinition = "name")
  private String name;

  @Id
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = "teacher Name";
  }
}
