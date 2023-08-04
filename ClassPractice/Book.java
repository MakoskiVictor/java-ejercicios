package ClassPractice;

public class Book implements Readable {
  private String name;
  private String author;
  private int numberOfPages;

  public void setName(String prop) {
    name = prop;
  }

  public void setAuthor (String prop) {
    author = prop;
  }

  public void setNumbreOfPage (int prop) {
    numberOfPages = prop;
  }

  public String getAtributes () {
    return "Name: " + name + ", Author: " + author + ", Number of pages: " + numberOfPages;
  }
}
