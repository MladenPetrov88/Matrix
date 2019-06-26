import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());

        for (int firstNum = a; firstNum <=b; firstNum++) {
            for (int secondNum = a; secondNum <= b; secondNum++){
                for (int thirdNum = c; thirdNum <= d; thirdNum++) {
                    for (int fourthNum = c; fourthNum <= d; fourthNum++){
                         if (firstNum + fourthNum == secondNum + thirdNum && firstNum != secondNum && thirdNum != fourthNum){
                            System.out.printf("%d%d%n%d%d%n", firstNum, secondNum, thirdNum, fourthNum);
                             System.out.println();
                        }
                    }
                }
            }
        }
    }
}

