import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OwnerTest {
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
    Owner owner = new Owner("abc", "cde", 0.0);

    owner.setRValue(1.0);

    assertEquals(1.0, owner.getRValue(), 0);
  }
}