import java.util.Scanner;

public class Lab7_2 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean notEnd = true;
        while(notEnd){
            System.out.println("Enter an even number");
            int number = scanner.nextInt();
            scanner.nextLine();
            if(number % 2 == 0){
                System.out.println("You are entering an even number");
            }
            else{
                System.out.println("Sorry, you just entered an odd number");
                notEnd = false;
                break;
            }
        }
    }
}
