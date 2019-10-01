import java.util.Scanner;
class InterestFormula{

    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Interest Calculator");
      System.out.println("-------------------");
      System.out.println(" ");
      System.out.print("Initial value is: ");
      double initial = sc.nextDouble();
      System.out.print("Interst rate is: ");
      double rate = sc.nextDouble();
      System.out.print("How many years to store the money: ");
      double year = sc. nextDouble();
       
      double Final = initial*Math.pow(1+rate,year);
      System.out.println("Final money you get after these years is " +Final);
    }
}
