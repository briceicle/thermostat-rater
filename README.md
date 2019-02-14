
## Assumptions
In order to complete the challenge, I made the following assumptions:
- Any pair that appears in the `query` section is valid and rating can be calculated for it
- Customers names in the `input` section are unique
- The inputs (name, location, rvalue) always have the specified format, so implemented minimal input validation
- Didn't use any build tool (e.g. Maven, Gradle) to keep the folder structure simple

## Setup
The following setup instructions are for `Mac OS X`
- Install [Java SDK 8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- Clone the repo
  - `git clone https://github.com/briceicle/thermostat-rater`
  
## Folder Structure
- /src
  - Main.java&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;---> Entry point of the program
  - Owner.java&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;---> Class that encapsulates a thermostat owner
  - OwnerTest.java ---> Unit test for Owner class
  - Rater.java&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;---> Class that encapsulates functionality to rate a home
  - RaterTest.java&nbsp;&nbsp;&nbsp;---> Unit test for Rater class
  - Region.java&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;---> Class that encapsulates a region and all its R-values
  - RegionTest.java  ---> Unit test for Region class

## Run program
In the current directory, run the following commands to compile, then execute:
  - `javac Main.java`
  - `java Main`
  
You can store your input in a text file (e.g. `input.txt`) and pipe it to java stdin like so:
  - `cat input.txt | java Main`

## Run unit tests
In the current directory, run the following commands to compile, then execute a specific test:
  - `javac -cp .:junit-4.13-beta-2.jar:hamcrest-core-1.3.jar RaterTest.java`
  - `java -cp .:junit-4.13-beta-2.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore RaterTest`
  
 You can replace `RaterTest` in the above commands with any other test class
