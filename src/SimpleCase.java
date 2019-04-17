import java.util.Scanner;
public class SimpleCase {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Please enter the grade received: ");
        int grade =input.nextInt();

        switch(grade/10) {
            case 10:
            case 9:
                System.out.println("That is an A"); break;
            case 8: System.out.println("That is a B"); break;
            case 7: System.out.println("That is a C"); break;
            case 6: System.out.println("That is a D"); break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1: System.out.println("That is an F"); break;
        }
    }
}
