package pertemuan12.One;

public class RealImage implements Image{
  
  public String fileName;

  public RealImage(String fileName) {
    this.fileName = fileName;
    loadFromDisk(fileName);
  }

  @Override
  public void display() {
    System.out.println("Displaying " +fileName);
  }

  private void loadFromDisk(String fileName) {
    System.out.println("Loading " +fileName);
  }
}