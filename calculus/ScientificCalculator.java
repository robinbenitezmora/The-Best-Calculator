
public class ScientificCalculator {
 public static void main(String[] args) {
  System.out.println("Hello World!");
 }

 public static double add(double a, double b) {
  return a + b;
 }

 public static double subtract(double a, double b) {
  return a - b;
 }

 public static double multiply(double a, double b) {
  return a * b;
 }

 public static double divide(double a, double b) {
  if (b == 0) {
   throw new IllegalArgumentException("Cannot divide by zero");
  }
  return a / b;
 }

}