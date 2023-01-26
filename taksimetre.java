import java.util.Scanner;
/*
@author alfonso
 */
class Taksimetre {
    public static void main(String[] args) {

        double price = 2.20;
        double start= 10.0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter you went to distance as km : ");
        double km= inp.nextDouble();
        Double lastPrice = start+(km*price);
        boolean case1 = lastPrice<=20 ;
        Double result= case1 ? ( lastPrice=20.0) : (lastPrice=lastPrice);
        System.out.print("you need to pay: "+ lastPrice);

    }
}