import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Region {
  private String name;
  private ArrayList<Double> rvalues;

  public Region() {
    this.name = null;
    this.rvalues = new ArrayList<Double>();
  }

  public Region(String name, ArrayList<Double> values) {
    this.name = name;
    this.rvalues = values;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void addRValue(double value) {
    this.rvalues.add(value);
  }

  public ArrayList<Double> getRValues() {
    return this.rvalues;
  }
}
