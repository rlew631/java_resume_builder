package com.ryanlewis.resume_builder;

import java.util.List;
import java.util.ArrayList;

public class Greeting {

  private String name;
  private String city;
  private String state;
  private String[] skills = {"GCP", "AWS", "Python"};

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  public String[] getSkills() {
    return skills;
  }
  public void setSkills(String[] skills) {
    
    // this.skills = skills;
    String[] skill2 = {"GCP", "AWS", "Python"};
    this.skills = skill2;
  }

}