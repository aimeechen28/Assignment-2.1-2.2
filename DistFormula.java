import java.util.Scanner;
class DistFormula{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        double a=0,b=0,c=0,d=0;
        double dis=0;
        System.out.println("Distance Calculator");
        System.out.println("-------------------");
        System.out.println(" ");
        System.out.print("The x-coordiate of point 1 is: ");
        a = sc.nextDouble();
        System.out.print("The y-coordiate of point 1 is: ");
        b = sc.nextDouble();
        System.out.print("The x-coordiate of point 2 is: ");
        c = sc.nextDouble();
        System.out.print("The y-coordiate of point 2 is: ");
        d = sc.nextDouble();
        
        dis = Math.sqrt(Math.pow(c-a,2)+Math.pow(d-b,2));
        System.out.println("The distance between the points is " +dis+ " units");
        
        
    }
}
