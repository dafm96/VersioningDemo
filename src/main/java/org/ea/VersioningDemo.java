package org.ea;

/**
 * Versioning demo created by Daniel Persson
 */
public class VersioningDemo {
  //test new feature
  public static void main(String args[]) {
    System.out.println("Hello explorers.");
    System.out.println();
    System.out.println("This program is running version " +
        VersioningDemo.class.getPackage().getImplementationVersion());
  }
}
