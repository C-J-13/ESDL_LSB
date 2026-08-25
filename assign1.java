/*Develop a Java program to implement an Employee Management System using object-oriented
programming principles.
a) Create an Employee class demonstrating classes, objects, constructors, and encapsulation for
storing employee details.
b) Implement inheritance by creating specialized employee classes (such as Manager or Developer)
derived from the Employee class.
c) Demonstrate polymorphism using method overloading and method overriding for operations
such as salary calculation or displaying employee information. */
import java.util.Scanner;
public class assign1 {
    public static void main(String[] args) {
       int y=0;
        while (y==0) {
        System.out.println("Enter 1 for employe:");
        System.out.println("Enter 2 for manager:");
        System.out.println("Enter 3 for developer:");
       
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
            
        
        

        switch (n) {
            case 1:
                 employe e=new employe("chinmay", "23131", 50000, "student");
    e.display();
                
                break;

            case 2:
                
            manager m=new manager("chinmay", "23131", 60000, "manager", "6000");
    m.display();
                break;


            case 3:
                developer d=new developer("chinmay", "23131", 100000, "Developer", "frontend");
    d.display();
    d.addskill("python", 15);
                
                break;
        
            default:
                break;
                
        }System.out.println("if you want to continue enter 0");
        Scanner yc=new Scanner(System.in);
        y=yc.nextInt();


        }
        
}
}
