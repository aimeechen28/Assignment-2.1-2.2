import java.util.Scanner;
class AreaToRadius{

    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator of Area of Circle");
        System.out.println("----------------------------");
        System.out.println("");
        System.out.print("The radius of the circle is:" );
        int radius =sc.nextInt();
        double area=Math.PI*Math.pow(radius,2);
        System.out.println("The area of the circle is " +area);
        
        
    }
}
