package pl.sda.recap;

import java.util.Scanner;

public class Task2Demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input;

        while (true){
            input = scanner.nextLine();

            if (input.toLowerCase().equals("q")){
                break;
            }

            try {
                int number = Integer.parseInt(input);
                String message = number % 2 == 0 ? "parzysta" :"nieparzysta";
                System.out.println(String.format("Liczba jest %s", message));
            }catch (NumberFormatException ex){
                System.out.println("Invalud input");
            }
        }
    }
}