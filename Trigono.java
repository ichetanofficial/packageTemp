import trigonoperate.Trigonometry;

import java.util.Scanner;


public class Trigono {
    public static void main(String[] args) {
        double angle = 0;
        int choice = -1;

        System.out.println("1 : Sin\n2 : Cos\n3 : Tan\n4 : Csc\n5 : Sec\n6 : Cot\n7 : Exit");
        Scanner scanner = new Scanner(System.in);
        while (choice != 7) {
            System.out.print("Enter Your Choice : ");
            choice = scanner.nextInt();
            if (choice != 7) {
                System.out.print("Enter Angle : ");
                angle = scanner.nextDouble();
            }

            switch (choice) {
                case 1:
                    System.out.println("Sin(" + angle + " degrees) = " + Trigonometry.calculateSin(angle));
                    break;
                case 2:
                    System.out.println("Cos(" + angle + " degrees) = " + Trigonometry.calculateCos(angle));
                    break;

                case 3:
                    System.out.println("Tan(" + angle + " degrees) = " + Trigonometry.calculateTan(angle));
                    break;
                case 4:
                    System.out.println("Csc(" + angle + " degrees) = " + Trigonometry.calculateCsc(angle));
                    break;

                case 5:
                    System.out.println("Sec(" + angle + " degrees) = " + Trigonometry.calculateSec(angle));
                    break;
                case 6:
                    System.out.println("Cot(" + angle + " degrees) = " + Trigonometry.calculateCot(angle));
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }

    }
}
