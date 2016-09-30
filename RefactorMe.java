package refactorme;
import java.util.*;

public class RefactorMe {

    public static void main(String[] args) {
        getName();
        calculateSalary(2500, 400);
        calculateSides("circle");
        countLetters();
        
    }

    public static void getName(){
        String name = "Geoff";
        System.out.println("Your name is: " + name);
    }

    public static void calculateSalary(int income, int tax) {
        // Salary = income - tax
        int Salary = income - tax;
        System.out.println(Salary);
    }

    public static void calculateSides(String shape) {
        // this method should detect for
        // 1 square
        // 2 circle
        // 3 hexagon
        // 4 dodecagon
        if (shape.contains("dodecagon")) {
            System.out.println("Your shape has 12 sides");
        }
        if (shape.contains("hexagon")) {
            System.out.println("Your shape has 6 sides");
        }
        if (shape.contains("circle")) {
            System.out.println("Your shape has 1 sides");
        }
        if (shape.contains("square")) {
            System.out.println("Your shape has 4 sides");
        }
    }

    public static void countLetters() {
        System.out.println("Enter a word: ");
        Scanner input = new Scanner(System.in);
        String word;
        word = input.next();
        //String word = 
        System.out.println("You entered: " + word );

        System.out.println("You word is: " + word.length() + " letters long.");
    }

}
