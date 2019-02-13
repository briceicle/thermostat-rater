import java.io.*;
import java.util.Scanner;

public class Solution {
  private static final Scanner scanner = new Scanner(System.in);

  private static void processInputLine(String line) {
    System.out.println("process: " + line);
  }

  private static void processQueryLine(String line) {
    System.out.println("query: " + line);
  }

  public static void main(String[] args) throws IOException {
    // read data section
    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      if (line.equals("")) {
        break; // skip blank line
      } else {
        processInputLine(line);
      }
    }

    // read query section
    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      processQueryLine(line);
    }

    scanner.close();
  }
}
