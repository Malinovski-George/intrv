package org.example;

public class OopTask {

  public static void main(String[] args) {
    // Example of overriding static and normal methods
    // and shading fields

    B b = new B();
    System.out.println(b.i);
    System.out.println(b.j);
    System.out.println(b.f());
    System.out.println(b.g());
    System.out.println(B.g());

    System.out.println("----------------");

    A a = (A) b;
    System.out.println(a.i);
    System.out.println(a.j);
    System.out.println(a.f());
    System.out.println(a.g());
    System.out.println(A.g());
  }

  static class A {

    int i = 1;
    static double j = 1.0;

    int f() {
      return i;
    }

    static char g() {
      return 'A';
    }
  }

  static class B extends A {
    int i = 2;
    static double j = 2.0;

    int f() {
      return -i;
    }

    static char g() {
      return 'B';
    }
  }
}
