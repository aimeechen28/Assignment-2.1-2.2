import java.util.Scanner;
class Magic8Ball{
public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 int answer =(int)(Math.random()*20)+1;
 System.out.println("Magic 8 Ball");
System.out.println("---------");
System.out.println("");
System.out.println("What is your yes or no question?");
String question = sc.nextLine();
if(answer==1){
   System.out.println("Yes. Definitely!");
}else if(answer==2){
    System.out.println("No, need more improvement!");
}else if(answer ==3){
    System.out.println("Yeah, that is true.");
}else if (answer ==4){
    System.out.println("No. That is impossible");
}else if (answer ==5){
    System.out.println("Yes.");
}else if(answer==6){
    System.out.println("No.");
}else if(answer==7){
    System.out.println("No way.");
}else if (answer==8){
    System.out.println("Yes, but not now");
}else if (answer==9){
    System.out.println("No, but you can dream it.");
}else if (answer==10){
    System.out.println("Not sure.");
}else if (answer==11){
    System.out.println("No. You'll need to consider other ways.");
}else if (answer==12){
    System.out.println("Yes. You are sure to have support.");
}else if (answer==13){
    System.out.println("Yes.It is sure to make things interesing.");
}else if (answer==14){
    System.out.println("No. Save your energy.");
}else if (answer==15){
    System.out.println("Stupid question!");
}else if (answer==16){
    System.out.println("It cannot fail.");
}else if (answer==17){
    System.out.println("Don't doubt it");
}else if (answer==18){
    System.out.println("No. Laugh about it.");
}else if (answer==19){
    System.out.println("Of course");
}else if (answer==20){
    System.out.println("I don't know either.");
}else{
    System.out.println("error");
}

}
}
