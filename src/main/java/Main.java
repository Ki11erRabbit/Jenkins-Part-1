import java.util.*;

public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("welcome to the calculator");
        System.out.println("enter a command");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.contains("quit")) {
                break;
            }
            else {
                ArrayList<String> functionArgs = new ArrayList<>();
                StringTokenizer st = new StringTokenizer(input);
                String command = st.nextToken();
                while (st.hasMoreTokens()) {
                    functionArgs.add(st.nextToken());
                }
                if (command.contains("add")) {
                    System.out.println(calc.add(Integer.parseInt(functionArgs.get(0)),Integer.parseInt(functionArgs.get(1))));
                }
                else if (command.contains("mult")) {
                    System.out.println(calc.multiply(Integer.parseInt(functionArgs.get(0)),Integer.parseInt(functionArgs.get(1))));
                }
                else if (command.contains("sub")) {
                    System.out.println(calc.subtract(Integer.parseInt(functionArgs.get(0)),Integer.parseInt(functionArgs.get(1))));
                }
                else if (command.contains("div")) {
                    System.out.println(calc.divide(Integer.parseInt(functionArgs.get(0)),Integer.parseInt(functionArgs.get(1))));
                }
                else if (command.contains("fib")) {
                    System.out.println(calc.fibonacciNumberFinder(Integer.parseInt(functionArgs.get(0))));
                }
                else if (command.contains("bin")) {
                    System.out.println(calc.intToBinaryNumber(Integer.parseInt(functionArgs.get(0))));
                }
            }
        }
    }
}
