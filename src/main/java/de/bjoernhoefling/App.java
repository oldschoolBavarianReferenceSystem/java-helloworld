package de.bjoernhoefling;

/**
 * Hello world!
 *
 */
public final class App {

  /** A ZERO */
  private static final int ZERO = 0;

  /** A ONE */
  private static final int ONE = 1;

  /** Private Constructor. This class must be used statically only.
   */
  private App() {
  }

  /** Main method.
  @param args Command line arguments.
  */
  public static void main(final String[] args) {
    System.out.println("Hello World!");
    final int not = ONE / ZERO;
    System.out.println("NOT: " + not);
  }
}
