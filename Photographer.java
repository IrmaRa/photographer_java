import java.util.*;

public class Photographer {
  
  private String name;
  private ArrayList<Printable> collection;

  public Photographer(String name) {
    this.name = name;
    this.collection = new ArrayList<Printable>();
  }

  public String getName() {
   return this.name;
  }

  public int cameraCount() {
    return this.collection.size();
  }

  public void addCamera(Printable camera) {
    this.collection.add(camera);
  }

  public Printable removeCamera() {
    if (cameraCount() > 0) {
      return collection.remove(0);
    }
    return null;
  }

  public void removeAll() {
    this.collection.clear();
  }

}