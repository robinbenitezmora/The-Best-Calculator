
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

 public static double power(double a, double b) {
  return Math.pow(a, b);
 }

 public static double squareRoot(double a) {
  return Math.sqrt(a);
 }

 public static double cubeRoot(double a) {
  return Math.cbrt(a);
 }

 public static double log(double a) {
  return Math.log(a);
 }

 public static double log10(double a) {
  return Math.log10(a);
 }

 public static double sin(double a) {
  return Math.sin(a);
 }

 public static double cos(double a) {
  return Math.cos(a);
 }

 public static double tan(double a) {
  return Math.tan(a);
 }

 public static double arcsin(double a) {
  return Math.asin(a);
 }

 public static double arccos(double a) {
  return Math.acos(a);
 }

 public static double arctan(double a) {
  return Math.atan(a);
 }

 public static double sinh(double a) {
  return Math.sinh(a);
 }

 public static double cosh(double a) {
  return Math.cosh(a);
 }

 public static double tanh(double a) {
  return Math.tanh(a);
 }

 public static double arcsinh(double a) {
  return Math.log(a + Math.sqrt(a * a + 1));
 }

 public static double arccosh(double a) {
  return Math.log(a + Math.sqrt(a * a - 1));
 }

 public static double arctanh(double a) {
  return Math.log((1 + a) / (1 - a)) / 2;
 }

 public static double factorial(double a) {
  if (a < 0) {
   throw new IllegalArgumentException("Cannot take factorial of negative number");
  }
  if (a == 0) {
   return 1;
  }
  return a * factorial(a - 1);
 }

 public static double absoluteValue(double a) {
  return Math.abs(a);
 }

 public static double round(double a) {
  return Math.round(a);
 }

 public static double floor(double a) {
  return Math.floor(a);
 }

 public static double ceiling(double a) {
  return Math.ceil(a);
 }

 public static double max(double a, double b) {
  return Math.max(a, b);
 }

 public static double min(double a, double b) {
  return Math.min(a, b);
 }

 public static double random() {
  return Math.random();
 }

 public static double degreesToRadians(double a) {
  return Math.toRadians(a);
 }

 public static double radiansToDegrees(double a) {
  return Math.toDegrees(a);
 }

 public static double hypotenuse(double a, double b) {
  return Math.hypot(a, b);
 }

 public static double inverse(double a) {
  return 1 / a;
 }

 public static double percent(double a) {
  return a / 100;
 }

 public static double inversePercent(double a) {
  return a * 100;
 }
}