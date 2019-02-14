import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Arrays;


public class Main {
  private static final Scanner scanner = new Scanner(System.in);
  private static HomeRater homeRater = new HomeRater();

  private static void processInput(String line) {
    String regex = "(\"[\\w\\s]+\")([\\s]+)(\"[\\w\\s/]+\")([\\s]+)([0-9]*\\.[0-9]+|[0-9]+)";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(line);

    while (matcher.find()) {
      String name = matcher.group(1).replace("\"", "");
      String location = matcher.group(3).replace("\"", "");
      double rvalue = Double.parseDouble(matcher.group(5));

      initialize(name, location, rvalue);
    }
  }

  private static void processQuery(String line) {
    String regex = "(\"[\\w\\s]+\")([\\s]+)(\"[\\w\\s/]+\")";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(line);

    while (matcher.find()) {
      String name = matcher.group(1).replace("\"", "");
      String region = matcher.group(3).replace("\"", "");

      System.out.println(line + " " + homeRater.rate(name, region));
    }
  }

  private static void initialize(String name, String location, double rvalue) {
    HomeOwner owner = new HomeOwner(name, location, rvalue);
    homeRater.addHomeOwner(owner);

    String[] locationParts = location.split("/");
    String regionKey = locationParts[0];
    homeRater.addRegionRValue(regionKey, rvalue);
    
    for (int i = 1; i < locationParts.length; i++) {
      regionKey = regionKey + '/' + locationParts[i];
      homeRater.addRegionRValue(regionKey, rvalue);
    }
  }

  public static void main(String[] args) throws IOException {
    // read data section
    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      if (line.equals("")) {
        break; // skip empty line
      } else {
        processInput(line);
      }
    }

    // read query section
    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      processQuery(line);
    }

    scanner.close();
  }
}
