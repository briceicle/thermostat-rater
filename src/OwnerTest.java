import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OwnerTest {
  @Test
  public void testGetName() {
    Owner owner = new Owner("abc", "cde", 0.0);
    assertEquals("abc", owner.getName());
  }

  @Test
  public void testGetLocation() {
    Owner owner = new Owner("abc", "cde", 0.0);
    assertEquals("cde", owner.getLocation());
  }

  @Test
  public void testGetRValue() {
    Owner owner = new Owner("abc", "cde", 0.0);
    assertEquals(0.0, owner.getRValue(), 0);
  }
  
  @Test
  public void testSetName() {
    Owner owner = new Owner("abc", "cde", 0.0);
    owner.setName("xyz");
    assertEquals("xyz", owner.getName());
  }

  @Test
  public void testSetLocation() {
    Owner owner = new Owner("abc", "cde", 0.0);
    owner.setLocation("xyz");
    assertEquals("xyz", owner.getLocation());
  }

  @Test
  public void testSetRValue() {
    Owner homeOwner = new Owner("abc", "cde", 0.0);
    owner.setRValue(1.0);
    assertEquals(1.0, owner.getRValue(), 0);
  }
}