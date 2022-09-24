public class javalesson11 {
  public static void main(String[] ages) {
    int num = 30;
    for (int i = 1; i < num; i++) {
      System.out.println("*");
      if (i % 5 == 0) {
        System.out.println("\t");
      }
    }
  }
}
