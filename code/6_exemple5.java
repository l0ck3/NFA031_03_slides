public class ExImb {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i = i + 1) {
      for (int j = 0; j < 8; j = j + 1) {
        Terminal.writeInt(j);
      }
      Terminal.lineBreak();
    }
  }
}
