import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        int choice;
        System.out.println("Pick one :\n 1. Hi \n 2. Hey \n 3. Hello");
        Scanner scan=new Scanner(System.in);
        choice=scan.nextInt();
        switch(choice){
            case 1:
                System.out.println("You said Hi!");
                break;
            case 2:
                System.out.println("You said Hey!");
                break;
            case 3:
                System.out.println("You said Hello!");
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
