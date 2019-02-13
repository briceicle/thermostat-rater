import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HomeOwnerTest {
  @Test
  public void testGetName() {
    HomeOwner homeOwner = new HomeOwner("abc", "cde", 0.0);
    assertEquals("abc", homeOwner.getName());
  }

  @Test
  public void testGetLocation() {
    HomeOwner homeOwner = new HomeOwner("abc", "cde", 0.0);
    assertEquals("cde", homeOwner.getLocation());
  }

  @Test
  public void testGetRValue() {
    HomeOwner homeOwner = new HomeOwner("abc", "cde", 0.0);
    assertEquals(0.0, homeOwner.getRValue(), 0);
  }
  
  @Test
  public void testSetName() {
    HomeOwner homeOwner = new HomeOwner("abc", "cde", 0.0);
    homeOwner.setName("xyz");
    assertEquals("xyz", homeOwner.getName());
  }

  @Test
  public void testSetLocation() {
    HomeOwner homeOwner = new HomeOwner("abc", "cde", 0.0);
    homeOwner.setLocation("xyz");
    assertEquals("xyz", homeOwner.getLocation());
  }

  @Test
  public void testSetRValue() {
    HomeOwner homeOwner = new HomeOwner("abc", "cde", 0.0);
    homeOwner.setRValue(1.0);
    assertEquals(1.0, homeOwner.getRValue(), 0);
  }
}