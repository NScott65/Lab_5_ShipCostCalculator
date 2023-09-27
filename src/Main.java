import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Variables
        double ogAmount = 0;
        double shipping = 0;
        double shipCost = 0;

        System.out.print("Enter amount of purchase: ");
        if(scan.hasNextDouble()){
            ogAmount = scan.nextDouble();
        }else if(ogAmount < 1){
            System.out.print("Your input was invalid.");
            System.exit(0);
        }
        shipping = ogAmount * .02;
        shipCost = ogAmount + shipping;

        if(ogAmount >= 100){
            System.out.print("Your total cost is " + ogAmount + ".");
            System.exit(0);
        }else if(ogAmount < 100){
            System.out.print("Your total cost after shipping is " + shipCost + ".");
            System.exit(0);
        }
    }
}