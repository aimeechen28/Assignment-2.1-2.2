 import java.util.Scanner;
class D6{
     public static void main(String[] args){
         Scanner sc = new Scanner (System.in); 
         System.out.println("Dice Rolling");
         System.out.println("------------");
         int a =(int)(1+Math.random()*6);
         System.out.println("Dice #1: " +a );
          int b = (int)(1+Math.random()*6);
         System.out.println("Dice #2: " +b);
        int c= (int)(1+Math.random()*6);
         System.out.println("Dice #3: " +c);
         int d= (int)(1+Math.random()*6);
         System.out.println("Dice #4: " +d);
         int e= (int)(1+Math.random()*6);
         System.out.println("Dice #5: " +e);
         int f= (int)(1+Math.random()*6);
         System.out.println("Dice #6: " +f);
         int g= (int)(1+Math.random()*6);
         System.out.println("Dice #7: " +g);
        int h= (int)(1+Math.random()*6);
         System.out.println("Dice #8: " +h);
        int i= (int)(1+Math.random()*6);
         System.out.println("Dice #9: " +i);
          int j= (int)(1+Math.random()*6);
         System.out.println("Dice #10: "+j);
         
         
         
         
         
         
         
         
         
      
        
         System.out.println("The total number of the 10 dices is: " +(a+b+c+d+e+f+g+h+i+j));
         
        }
}
