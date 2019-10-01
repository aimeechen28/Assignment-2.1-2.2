import java.util.Scanner;
class GradeBot{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Grade Bot");
System.out.println("---------");
System.out.println("");
System.out.print("What was your test out of?     Answer: ");
int test= sc.nextInt();
System.out.print("What did you get?              Answer: ");
double mark = sc.nextDouble();
int percent= (int)((mark/test)*100);
String grade =sc.nextLine();
if(percent>=86&&percent<=100){
    grade="A";
   System.out.print("You got " +percent+ "%. That is a(n) " +grade+ "! You are great!!");
}else if(percent<86&&percent>=73){
    grade="B";
    System.out.print("You got " +percent+ "%. That is a(n) " +grade+ "... Need more improvement.");
}else if(percent<73&&percent>=67){
    grade="C+";
    System.out.print("You got " +percent+ "%. That is a(n) " +grade+ "......Cool.");
}else if(percent<67&&percent>=60){
    grade="C";
    System.out.print("You got " +percent+ "%. That is a(n) " +grade+ ".....Thats impossible..");
}else if(percent<59&&percent>=50){
    grade="C-";
    System.out.print("You got " +percent+ "%. That is a(n) " +grade+ ". Almost failed! Good job!");
}else if(percent<49&&percent>=0){
    grade="F";
    System.out.print("You got " +percent+ "%. That is a(n) " +grade+ "...You failed, stupid!");
}else{
    System.out.print("Silly human, that's not possible. Quit joking around.");
}



}
}
