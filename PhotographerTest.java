import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PhotographerTest {
  Photographer photographer;
  DigitalCamera digitalCamera;
  AnalogCamera analogCamera;

  @Before
  public void before() {
    photographer = new Photographer("Irma");
    digitalCamera = new DigitalCamera();
    analogCamera = new AnalogCamera();
  }

  @Test
  public void hasName() {
    assertEquals("Irma", photographer.getName());
  }

  @Test
  public void canAddCamera() {
    photographer.addCamera(digitalCamera);
    assertEquals(1, photographer.cameraCount());
  }

  @Test
  public void canRemoveCamera() {
    photographer.addCamera(digitalCamera);
    photographer.addCamera(analogCamera);
    photographer.removeCamera();
    assertEquals(1, photographer.cameraCount());
  }

  @Test
  public void canRemoveAllCameras() {
    photographer.addCamera(digitalCamera);
    photographer.addCamera(analogCamera);
    photographer.removeAll();
    assertEquals(0, photographer.cameraCount());
  }

  @Test
  public void canReturnDigitalCameraDetails() {
    photographer.addCamera(digitalCamera);
    assertEquals("Nikon 34T, Noise reduction filter, Hi-resolution", photographer.allCameraDetails());
  }

  @Test
  public void canReturnAnalogCameraDetails() {
    photographer.addCamera(analogCamera);
    assertEquals("Sony ILCE5100L, No noise reduction, Lo-resolution", photographer.allCameraDetails());
  }


}