import java.util.Scanner;
/*
@author alfonso
 */
class Hypotenuse {
    public static void main(String[] args) {
        // Hypothenuse of Angle's inputed legs length from keyboard
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the angle's first leg length: ");
        Double firstLeg = input.nextDouble();
        System.out.print("Enter the angle's second leg length: ");
        Double secondLeg = input.nextDouble();
        Double hypo= (firstLeg*firstLeg) + (secondLeg*secondLeg);
        Double result = Math.sqrt(hypo);

        System.out.print("Angle's hypotenuse length: "+ result);


    }
}
class Square {
    public static void main(String[] args){
        Scanner inp= new Scanner(System.in);
        System.out.print("Enter The angle's first edge length: ");
        Double firstEdge = inp.nextDouble();
        System.out.print("Enter the angle's second edge length: ");
        Double secondEdge = inp.nextDouble();
        System.out.print("Enter the angle's third edge length: ");
        Double thirdEdge = inp.nextDouble();
        Double roundofAngle= (firstEdge+secondEdge+thirdEdge);
        Double u= roundofAngle/2;
        Double angleSquare1= u*(u-firstEdge)*(u-secondEdge)*(u-thirdEdge);
        Double angleSquare= Math.sqrt(angleSquare1);
        System.out.print("The Triangle's Area: "+ angleSquare);
    }
}

