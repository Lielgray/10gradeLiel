import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner scan =new Scanner(System.in);
    /* 1*/ 
      int x;
     System.out.println("Enter a number:");
     x=scan.nextInt();
     if(x>=0)
     System.out.println("positive!");
     else if (x==0)
       System.out.println("neutral");
     else
     System.out.println("negetive");
    /* 1*/

    

    /* 2*/
    int y;
     System.out.println("Enter a number:");
     y = scan.nextInt();
    int z;
     System.out.println("Enter a number:");
     z = scan.nextInt();

     if(y>z)
     System.out.println(z);
     else if (y==z)
       System.out.println("none");
     else
     System.out.println(y);  
    /* 2*/

    
    /* 3*/
    int br1speed;
    System.out.println("enter bikerider1 speed");
    br1speed = scan.nextInt();
    int br1distance;
    System.out.println("enter bikerider1 distance");
    br1distance = scan.nextInt();

    int br2speed;
    System.out.println("enter bikerider1 speed");
    br2speed = scan.nextInt();
    int br2distance;
    System.out.println("enter bikerider1 distance");
    br2distance = scan.nextInt();

    int brone = (br1distance*br1speed);
    int brtwo = (br2distance*br2speed);
    if (brone>brtwo)
      System.out.println("bike rider 2 is faster");
    else if (brone == brtwo)
      System.out.println("both in the same time");
    else 
      System.out.println("bike rider 1 is faster");  
    /* 3*/

    /* 4*/
    int grade1;
    System.out.println("enter grade1");
    grade1 = scan.nextInt();
    

    int grade2;
    System.out.println("enter grade2");
    grade2 = scan.nextInt();

    int grade3;
    System.out.println("enter grade3");
    grade3 = scan.nextInt();

    int avg = (grade1+grade2+grade3)/3 ;
    System.out.println(avg);  
    /* 4*/
    
    /* 5*/
   int a;
    System.out.println("enter a:");
    a = scan.nextInt();
    int d;
    System.out.println("enter distance:");
    d= scan.nextInt();
    int nfive = 5;
    int nten = 10;
    int sfive = a+(nfive-1)*d;
    int sten = a+(nten-1)*d;
    System.out.println("the fifth place is "+ sfive + " and the tenth place is " +sten);
    /* 5*/

    /* 7*/
     String name;
    System.out.println("enter your name");
    name = scan.nextLine();

    String school;
    System.out.println("enter your school name");
    school = scan.nextLine();

    String subject;
    System.out.println("enter number of subject");
    subject = scan.nextLine();

    System.out.println("My name is "+name+", my school is "+school+", The number of subjects I study is "+subject);   
    /* 7*/

    /* 8*/
    int num;
    System.out.println("Enter a three-digit number:");
    num = scan.nextInt();
    int sum = 0;
    sum += num % 10;
    num /= 10;
    sum += num % 10;
    num /= 10;
    sum += num % 10;
    System.out.println("The sum of the digits is: " + sum);
    if (sum % 2 == 0)
      System.out.println("the number is even");
    else
      System.out.println("the number is odd");    
    /* 8*/


  }
}