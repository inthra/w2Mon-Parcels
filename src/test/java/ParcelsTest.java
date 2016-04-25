import org.junit.*;
import static org.junit.Assert.*;

public class ParcelsTest {

  @Test
  public void newParcels_instantiatesCorrectly() {
    Parcels testParcels = new Parcels(2, 4, 6, 2, 2, 50);
    assertEquals(true, testParcels instanceof Parcels);
  }
}
