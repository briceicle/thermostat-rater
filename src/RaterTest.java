import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RaterTest {
  @Test
  public void testAddOwner() {
    Rater rater = new Rater();
    Owner owner = new Owner("John Doe", "USA/California/Portland", 0.0);

    rater.addOwner(owner);

    assertNotNull(rater.getOwner("John Doe"));
    assertEquals("John Doe", rater.getOwner("John Doe").getName());
    assertEquals("USA/California/Portland", rater.getOwner("John Doe").getLocation());
    assertEquals(0.0, rater.getOwner("John Doe").getRValue(), 0);
  }

  @Test
  public void testMapSingleRValue() {
    Rater rater = new Rater();

    rater.mapRValue("USA", 2.11);

    assertNotNull(rater.getRegions().get("USA"));
    assertEquals("USA", rater.getRegions().get("USA").getName());
    assertNotNull(rater.getRegions().get("USA").getRValues());
    assertEquals(1, rater.getRegions().get("USA").getRValues().size());
  }

  @Test
  public void testMapMultipleRValues() {
    Rater rater = new Rater();

    rater.mapRValue("USA", 2.11);
    rater.mapRValue("USA", 3.9);
    rater.mapRValue("USA", 1.91);

    assertNotNull(rater.getRegions().get("USA"));
    assertEquals("USA", rater.getRegions().get("USA").getName());
    assertNotNull(rater.getRegions().get("USA").getRValues());
    assertEquals(3, rater.getRegions().get("USA").getRValues().size());
  }

  @Test
  public void testMapMultipleIdenticalRValues() {
    Rater rater = new Rater();

    rater.mapRValue("USA", 0.0);
    rater.mapRValue("USA", 0.0);
    rater.mapRValue("USA", 0.0);

    assertNotNull(rater.getRegions().get("USA"));
    assertEquals("USA", rater.getRegions().get("USA").getName());
    assertNotNull(rater.getRegions().get("USA").getRValues());
    assertEquals(3, rater.getRegions().get("USA").getRValues().size());
  }

  @Test
  public void testComputeRatingOne() {
    Map<String, Owner> owners = new HashMap<String, Owner>();
    Map<String, Region> regions = new HashMap<String, Region>();
    ArrayList<Double> rvalues = new ArrayList<Double>();
    Owner owner = new Owner("John Doe", "Canada/Ontario/Toronto", 3.0);
    Region region = new Region("Canada");

    for (int i = 0; i < 1; i++) {
      region.addRValue(2.0);
    }
    for (int i = 0; i < 9; i++) {
      region.addRValue(5.0);
    }
    owners.put(owner.getName(), owner);
    regions.put(region.getName(), region);
    
    Rater rater = new Rater(owners, regions);

    assertEquals(1, rater.computeRating("John Doe", "Canada"));
  }

  @Test
  public void testComputeRatingTwo() {
    Map<String, Owner> owners = new HashMap<String, Owner>();
    Map<String, Region> regions = new HashMap<String, Region>();
    ArrayList<Double> rvalues = new ArrayList<Double>();
    Owner owner = new Owner("John Doe", "Canada/Ontario/Toronto", 3.0);
    Region region = new Region("Canada");

    for (int i = 0; i < 2; i++) {
      region.addRValue(2.0);
    }
    for (int i = 0; i < 8; i++) {
      region.addRValue(5.0);
    }
    owners.put(owner.getName(), owner);
    regions.put(region.getName(), region);
    
    Rater rater = new Rater(owners, regions);

    assertEquals(2, rater.computeRating("John Doe", "Canada"));
  }

  @Test
  public void testComputeRatingThree() {
    Map<String, Owner> owners = new HashMap<String, Owner>();
    Map<String, Region> regions = new HashMap<String, Region>();
    ArrayList<Double> rvalues = new ArrayList<Double>();
    Owner owner = new Owner("John Doe", "Canada/Ontario/Toronto", 3.0);
    Region region = new Region("Canada");

    for (int i = 0; i < 3; i++) {
      region.addRValue(2.0);
    }
    for (int i = 0; i < 7; i++) {
      region.addRValue(5.0);
    }
    owners.put(owner.getName(), owner);
    regions.put(region.getName(), region);
    
    Rater rater = new Rater(owners, regions);

    assertEquals(3, rater.computeRating("John Doe", "Canada"));
  }

  @Test
  public void testComputeRatingFour() {
    Map<String, Owner> owners = new HashMap<String, Owner>();
    Map<String, Region> regions = new HashMap<String, Region>();
    ArrayList<Double> rvalues = new ArrayList<Double>();
    Owner owner = new Owner("John Doe", "Canada/Ontario/Toronto", 3.0);
    Region region = new Region("Canada");

    for (int i = 0; i < 4; i++) {
      region.addRValue(2.0);
    }
    for (int i = 0; i < 6; i++) {
      region.addRValue(5.0);
    }
    owners.put(owner.getName(), owner);
    regions.put(region.getName(), region);
    
    Rater rater = new Rater(owners, regions);

    assertEquals(4, rater.computeRating("John Doe", "Canada"));
  }

  @Test
  public void testComputeRatingFive() {
    Map<String, Owner> owners = new HashMap<String, Owner>();
    Map<String, Region> regions = new HashMap<String, Region>();
    ArrayList<Double> rvalues = new ArrayList<Double>();
    Owner owner = new Owner("John Doe", "Canada/Ontario/Toronto", 3.0);
    Region region = new Region("Canada");

    for (int i = 0; i < 5; i++) {
      region.addRValue(2.0);
    }
    for (int i = 0; i < 5; i++) {
      region.addRValue(5.0);
    }
    owners.put(owner.getName(), owner);
    regions.put(region.getName(), region);
    
    Rater rater = new Rater(owners, regions);

    assertEquals(5, rater.computeRating("John Doe", "Canada"));
  }

  @Test
  public void testComputeRatingSix() {
    Map<String, Owner> owners = new HashMap<String, Owner>();
    Map<String, Region> regions = new HashMap<String, Region>();
    ArrayList<Double> rvalues = new ArrayList<Double>();
    Owner owner = new Owner("John Doe", "Canada/Ontario/Toronto", 3.0);
    Region region = new Region("Canada");

    for (int i = 0; i < 6; i++) {
      region.addRValue(2.0);
    }
    for (int i = 0; i < 4; i++) {
      region.addRValue(5.0);
    }
    owners.put(owner.getName(), owner);
    regions.put(region.getName(), region);
    
    Rater rater = new Rater(owners, regions);

    assertEquals(6, rater.computeRating("John Doe", "Canada"));
  }

  @Test
  public void testComputeRatingSeven() {
    Map<String, Owner> owners = new HashMap<String, Owner>();
    Map<String, Region> regions = new HashMap<String, Region>();
    ArrayList<Double> rvalues = new ArrayList<Double>();
    Owner owner = new Owner("John Doe", "Canada/Ontario/Toronto", 3.0);
    Region region = new Region("Canada");

    for (int i = 0; i < 7; i++) {
      region.addRValue(2.0);
    }
    for (int i = 0; i < 3; i++) {
      region.addRValue(5.0);
    }
    owners.put(owner.getName(), owner);
    regions.put(region.getName(), region);
    
    Rater rater = new Rater(owners, regions);

    assertEquals(7, rater.computeRating("John Doe", "Canada"));
  }

  @Test
  public void testComputeRatingEight() {
    Map<String, Owner> owners = new HashMap<String, Owner>();
    Map<String, Region> regions = new HashMap<String, Region>();
    ArrayList<Double> rvalues = new ArrayList<Double>();
    Owner owner = new Owner("John Doe", "Canada/Ontario/Toronto", 3.0);
    Region region = new Region("Canada");

    for (int i = 0; i < 8; i++) {
      region.addRValue(2.0);
    }
    for (int i = 0; i < 2; i++) {
      region.addRValue(5.0);
    }
    owners.put(owner.getName(), owner);
    regions.put(region.getName(), region);
    
    Rater rater = new Rater(owners, regions);

    assertEquals(8, rater.computeRating("John Doe", "Canada"));
  }

  @Test
  public void testComputeRatingNine() {
    Map<String, Owner> owners = new HashMap<String, Owner>();
    Map<String, Region> regions = new HashMap<String, Region>();
    ArrayList<Double> rvalues = new ArrayList<Double>();
    Owner owner = new Owner("John Doe", "Canada/Ontario/Toronto", 3.0);
    Region region = new Region("Canada");

    for (int i = 0; i < 9; i++) {
      region.addRValue(2.0);
    }
    for (int i = 0; i < 1; i++) {
      region.addRValue(5.0);
    }
    owners.put(owner.getName(), owner);
    regions.put(region.getName(), region);
    
    Rater rater = new Rater(owners, regions);

    assertEquals(9, rater.computeRating("John Doe", "Canada"));
  }

  @Test
  public void testComputeRatingTen() {
    Map<String, Owner> owners = new HashMap<String, Owner>();
    Map<String, Region> regions = new HashMap<String, Region>();
    ArrayList<Double> rvalues = new ArrayList<Double>();
    Owner owner = new Owner("John Doe", "Canada/Ontario/Toronto", 3.0);
    Region region = new Region("Canada");

    for (int i = 0; i < 10; i++) {
      region.addRValue(2.0);
    }
    owners.put(owner.getName(), owner);
    regions.put(region.getName(), region);
    
    Rater rater = new Rater(owners, regions);

    assertEquals(10, rater.computeRating("John Doe", "Canada"));
  }

  @Test
  public void testComputeRatingMidRangePercent() {
    Map<String, Owner> owners = new HashMap<String, Owner>();
    Map<String, Region> regions = new HashMap<String, Region>();
    ArrayList<Double> rvalues = new ArrayList<Double>();
    Owner owner = new Owner("John Doe", "Canada/Ontario/Toronto", 3.0);
    Region region = new Region("Canada");

    for (int i = 0; i < 5; i++) {
      region.addRValue(2.0);
    }
    for (int i = 0; i < 6; i++) {
      region.addRValue(5.0);
    }
    owners.put(owner.getName(), owner);
    regions.put(region.getName(), region);

    Rater rater = new Rater(owners, regions);

    assertEquals(5, rater.computeRating("John Doe", "Canada"));
  }

  @Test
  public void testComputeRatingOutofRangePercent() {
    Map<String, Owner> owners = new HashMap<String, Owner>();
    Map<String, Region> regions = new HashMap<String, Region>();
    ArrayList<Double> rvalues = new ArrayList<Double>();
    Owner owner = new Owner("John Doe", "Canada/Ontario/Toronto", 3.0);
    Region region = new Region("Canada");

    for (int i = 0; i < 10; i++) {
      region.addRValue(5.0);
    }
    owners.put(owner.getName(), owner);
    regions.put(region.getName(), region);

    Rater rater = new Rater(owners, regions);

    assertEquals(-1, rater.computeRating("John Doe", "Canada"));
  }

  @Test
  public void testComputeRatingAllSameRValues() {
    Map<String, Owner> owners = new HashMap<String, Owner>();
    Map<String, Region> regions = new HashMap<String, Region>();
    ArrayList<Double> rvalues = new ArrayList<Double>();
    Owner owner = new Owner("John Doe", "Canada/Ontario/Toronto", 3.0);
    Region region = new Region("Canada");

    for (int i = 0; i < 10; i++) {
      region.addRValue(3.0);
    }
    owners.put(owner.getName(), owner);
    regions.put(region.getName(), region);

    Rater rater = new Rater(owners, regions);

    assertEquals(10, rater.computeRating("John Doe", "Canada"));
  }
}