
public class ScientificCalculator {
 public static void main(String[] args) {
  System.out.println("Scientific Calculator");
  System.out.println("Enter an expression to evaluate");
  System.out.println("Type \"help\" for a list of commands");
  System.out.println("Type \"quit\" to exit");
  System.out.println("Type \"clear\" to clear the screen");
  System.out.println("Type \"history\" to view previous expressions");
  System.out.println("Type \"variables\" to view current variables");
  System.out.println("Type \"clear history\" to clear the history");
  System.out.println("Type \"clear variables\" to clear the variables");
  System.out.println("Type \"clear all\" to clear the history and variables");
  System.out.println("Type \"clear screen\" to clear the screen");
  System.out.println("Type \"clear everything\" to clear the screen, history, and variables");
  System.out.println("Type \"quit\" to exit");
  System.out.println("Type \"help\" for a list of commands");
  System.out.println("Type \"quit\" to exit");
  System.out.println("Type \"help\" for a list of commands");
  System.out.println("Type \"quit\" to exit");
  System.out.println("Type \"help\" for a list of commands");
  System.out.println("Type \"quit\" to exit");
  System.out.println("Type \"help\" for a list of commands");
  System.out.println("Type \"quit\" to exit");
  System.out.println("Type \"help\" for a list of commands");
  System.out.println("Type \"quit\" to exit");
  System.out.println("Type \"help\" for a list of commands");
  System.out.println("Type \"quit\" to exit");
  System.out.println("Type \"help\" for a list of commands");
  System.out.println("Type \"quit\" to exit");
  System.out.println("Type \"help\" for a list of commands");
  while (true) {
   System.out.print("> ");
   String input = System.console().readLine();
   if (input.equals("quit")) {
    break;
   } else if (input.equals("help")) {
    System.out.println("Scientific Calculator");
    System.out.println("Enter an expression to evaluate");
    System.out.println("Type \"help\" for a list of commands");
    System.out.println("Type \"quit\" to exit");
    System.out.println("Type \"clear\" to clear the screen");
    System.out.println("Type \"history\" to view previous expressions");
    System.out.println("Type \"variables\" to view current variables");
    System.out.println("Type \"clear history\" to clear the history");
    System.out.println("Type \"clear variables\" to clear the variables");
    System.out.println("Type \"clear all\" to clear the history and variables");
    System.out.println("Type \"clear screen\" to clear the screen");
    System.out.println("Type \"clear everything\" to clear the screen, history, and variables");
    System.out.println("Type \"quit\" to exit");
    System.out.println("Type \"help\" for a list of commands");
   } else if (input.equals("clear")) {
    System.out.print("\033[H\033[2J");
    System.out.flush();
   } else if (input.equals("history")) {
    System.out.println("History");
    for (int i = 0; i < history.size(); i++) {
     System.out.println(i + ": " + history.get(i));
    }
   } else if (input.equals("variables")) {
    System.out.println("Variables");
    for (String key : variables.keySet()) {
     System.out.println(key + ": " + variables.get(key));
    }
   } else if (input.equals("clear history")) {
    history.clear();
   } else if (input.equals("clear variables")) {
    variables.clear();
   } else if (input.equals("clear all")) {
    history.clear();
    variables.clear();
   } else if (input.equals("clear screen")) {
    System.out.print("\033[H\033[2J");
    System.out.flush();
   } else if (input.equals("clear everything")) {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    history.clear();
    variables.clear();
   } else {
    try {
     System.out.println(evaluate(input));
    } catch (Exception e) {
     System.out.println("Error: " + e.getMessage());
    }
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

 public static double inversePercentOf(double a, double b) {
  return a * b / 100;
 }

 public static double percentOf(double a, double b) {
  return a * 100 / b;
 }

 public static double inversePercentOfTotal(double a, double b) {
  return a * 100 / b;
 }

 public static double percentOfTotal(double a, double b) {
  return a * b / 100;
 }

 public static double inversePercentChange(double a, double b) {
  return (a - b) / b * 100;
 }

 public static double percentChange(double a, double b) {
  return (a - b) / a * 100;
 }

 public static double inversePercentError(double a, double b) {
  return (a - b) / b * 100;
 }

 public static double percentError(double a, double b) {
  return (a - b) / a * 100;
 }

 public static double inversePercentDifference(double a, double b) {
  return (a - b) / (a + b) * 100;
 }

 public static double percentDifference(double a, double b) {
  return (a - b) / (a + b) * 100;
 }
}