package org.ea;

/**
 * Versioning demo created by Daniel Persson
 */
public class VersioningDemo {
  //blablabla
  //try to push develop to master, and then tag
  public static void main(String args[]) {
    System.out.println("Hello explorers.");
    System.out.println();
    System.out.println("This program is running version " +
        VersioningDemo.class.getPackage().getImplementationVersion());
  }
}
