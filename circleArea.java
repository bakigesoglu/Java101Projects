import java.util.Scanner;
/*
@author alfonso
 */
class circleAreaAndRound {
    public static void main (String[] args) {
         System.out.print("Enter the circle's radius: ");
         Scanner inp = new Scanner(System.in);
         double r = inp.nextDouble();
         double pi = 3.14;
         double area = Math.pow(r,2)*pi;
         double round = 2*pi*r;
         System.out.print("Circle's area: "+area);
         System.out.print("circle's round: "+ round);
    }
}
class Circle{
    public static void main (String[] args){
        System.out.print("Enter the circle's radius: ");
        Scanner input = new Scanner(System.in);
        double r= input.nextDouble();
        System.out.print("Enter the center's angle of circle: ");
        double angle= input.nextDouble();
        double pi=3.14;
        double areaCirclePiece=(pi*Math.pow(r,2)*angle)/360;
        System.out.print("Area of Circle piece: "+areaCirclePiece);

    }
}