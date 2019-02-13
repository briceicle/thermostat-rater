import java.io.*;
import java.util.Scanner;

public class HomeOwner {
  private String name;
  private String location;
  private double rvalue;

  public HomeOwner(String name, String location, double rvalue) {
    this.name = name;
    this.location = location;
    this.rvalue = rvalue;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public void setRValue(double rvalue) {
    this.rvalue = rvalue;
  }

  public String getName() {
    return this.name;
  }

  public String getLocation() {
    return this.location;
  }

  public double getRValue() {
    return this.rvalue;
  }
}
