package com.myteam.poc1;

import java.io.Serializable;
import org.kie.api.definition.type.Label;

public class deptCount
  implements Serializable
{
  static final long serialVersionUID = 1L;
  @Label("number of departments")
  private Integer number_depts;
  
  public deptCount() {}
  
  public Integer getNumber_depts()
  {
    return this.number_depts;
  }
  
  public void setNumber_depts(Integer number_depts)
  {
    this.number_depts = number_depts;
  }
  
  public deptCount(Integer number_depts)
  {
    this.number_depts = number_depts;
  }
}
