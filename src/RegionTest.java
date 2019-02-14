import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import java.util.ArrayList;

public class RegionTest {
  @Test
  public void testGetName() {
    Region region = new Region("Canada", null);
    assertEquals("Canada", region.getName());
  }

  @Test
  public void testGetRvalues() {
    ArrayList<Double> rvalues = new ArrayList<Double>();
    Region region = new Region("Canada", rvalues);
    rvalues.add(1.5);

    assertNotNull(region.getRValues());
    assertEquals(1, region.getRValues().size());
    assertEquals(1.5, region.getRValues().get(0), 0);
  }

  @Test
  public void testSetName() {
    Region region = new Region();
    region.setName("Canada/Ontario");

    assertEquals("Canada/Ontario", region.getName());
  }

  @Test
  public void testAddRValue() {
    Region region = new Region();
    region.setName("USA");
    region.addRValue(5.5);

    assertNotNull(region.getRValues());
    assertEquals(1, region.getRValues().size());
    assertEquals(5.5, region.getRValues().get(0), 0);
  }
}