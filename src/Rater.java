import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

public class Rater {
  // list of home owners, keyed by owner name
  private Map<String, Owner> owners;

  // map of region to list of rvalues in that region
  private Map<String, ArrayList<Double>> regions;


  public Rater() {
    this.owners = new HashMap<String, Owner>();
    this.regions = new HashMap<String, ArrayList<Double>>();
  }

  public void addOwner(Owner owner) {
    this.owners.put(owner.getName(), owner);
  }

  public Owner getOwner(String name) {
    return this.owners.get(name);
  }

  public void addRegionRValue(String regionKey, double rvalue) {
    ArrayList<Double> region = this.regions.get(regionKey);
    if (region == null) {
      region = new ArrayList<Double>();
      this.regions.put(regionKey, region);
    }
    region.add(rvalue);
  }

  public Map<String, ArrayList<Double>> getRegions() {
    return this.regions;
  }

  public int getRating(String name, String regionKey) {
    double rvalue = this.owners.get(name).getRValue();
    ArrayList<Double> rvalues = this.regions.get(regionKey);

    // Calculate percentage of homes with better insulation
    double percent = calculatePercentage(rvalues, rvalue);

    // Determine the rating based on the percentage
    int rating = determineRating(percent);

    return rating;
  }

  private double calculatePercentage(ArrayList<Double> rvalues, double rvalue) {
    double count = 0;
    double percent = 0.0;

    for (int i = 0; i < rvalues.size(); i++) {
      if (rvalues.get(i).doubleValue() > rvalue) {
        count += 1;
      }
    }
    percent = (count / rvalues.size()) * 100;

    return percent;
  }

  private int determineRating(double percent) {
    int rating  = -1;

    if (percent >= 90 && percent < 100) {
      rating = 1;
    }
    if (percent >= 80 && percent < 90) {
      rating = 2;
    }
    if (percent >= 70 && percent < 80) {
      rating = 3;
    }
    if (percent >= 60 && percent < 70) {
      rating = 4;
    }
    if (percent >= 50 && percent < 60) {
      rating = 5;
    }
    if (percent >= 40 && percent < 50) {
      rating = 6;
    }
    if (percent >= 30 && percent < 40) {
      rating = 7;
    }
    if (percent >= 20 && percent < 30) {
      rating = 8;
    }
    if (percent >= 10 && percent < 20) {
      rating = 9;
    }
    if (percent >= 0 && percent < 10) {
      rating = 10;
    }

    return rating;
  }
}
