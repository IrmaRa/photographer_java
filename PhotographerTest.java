import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PhotographerTest {
  Photographer photographer;

  @Before
  public void before() {
    photographer = new Photographer("Irma");
  }

  @Test
  public void hasName() {
    assertEquals("Irma", photographer.getName());
  }

  
}