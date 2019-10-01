import java.util.Scanner;
class Secret{
 public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Secret");
System.out.println("---------");
System.out.println("");
System.out.print("What is the passward to access my secret? ");
String ans= sc.next();
if("dragon".equals(ans)){
System.out.print("You are right! My secret is I am a pigman! ");
}else{
  System.out.print("You stupid! I will keep my secret then! ");
}
}
}
