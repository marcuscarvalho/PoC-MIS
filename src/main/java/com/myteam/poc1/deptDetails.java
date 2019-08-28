package com.myteam.poc1;

import java.io.Serializable;
import org.kie.api.definition.type.Label;

public class deptDetails
  implements Serializable
{
  static final long serialVersionUID = 1L;
  @Label("dept name")
  private String name;
  @Label("dept id")
  private int id;
  @Label("dept manager")
  private String manager;
  
  public deptDetails() {}
  
  public String getName()
  {
    return this.name;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public int getId()
  {
    return this.id;
  }
  
  public void setId(int id)
  {
    this.id = id;
  }
  
  public String getManager()
  {
    return this.manager;
  }
  
  public void setManager(String manager)
  {
    this.manager = manager;
  }
  
  public deptDetails(String name, int id, String manager)
  {
    this.name = name;
    this.id = id;
    this.manager = manager;
  }
}
