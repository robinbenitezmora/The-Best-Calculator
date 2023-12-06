
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

}