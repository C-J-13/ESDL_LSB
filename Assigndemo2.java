import java.util.Scanner;

public class Assigndemo2 {
    public static void main(String[] args) throws studexception {
        student s1;
        String n;
        studentmngt sm= new studentmngt();
        int roll;
        int m;
        int t=0;
        int ch;
        int f=0;
        do{
        
        System.out.println("1.Add student record.");
        System.out.println("2.search student record.");
        System.out.println("3.delete student record.");
        System.out.println("4.update student record.");
        System.out.println("5.display student record.");
        Scanner b=new Scanner(System.in);
        ch=b.nextInt();

    try{
        switch (ch) {
        case 1:
            System.out.println("enter no. of student:");
            Scanner y=new Scanner(System.in);
            t=y.nextInt();
            for(int i=0;i<t;i++){
            System.out.println("enter student name:");
            Scanner sc=new Scanner(System.in);
            n=sc.next();
            System.out.println("enter the roll no.:");
            Scanner c=new Scanner(System.in);
            roll=c.nextInt();
            System.out.println("enter the marks:");
            Scanner s=new Scanner(System.in);
            m=s.nextInt();
            student S=new student(n, roll, m);
            sm.add(S);
            }break;
        
        case 2:
            System.out.println("Enter the roll no. of student to be searched");
            Scanner d=new Scanner(System.in);
            roll=d.nextInt();
            sm.search(roll);
            break;

        case 3:
            System.out.println("Enter the roll no. of student to be delete");
            Scanner u=new Scanner(System.in);
            roll=u.nextInt();
            sm.del(roll);
            break;

        case 4:
            System.out.println("enter the roll no.:");
            Scanner p=new Scanner(System.in);
            roll=p.nextInt();
            System.out.println("enter student name:");
            Scanner k=new Scanner(System.in);
            n=k.next();
            System.out.println("enter the marks:");
            Scanner l=new Scanner(System.in);
            m=l.nextInt();
            sm.update(roll,n,m);
            break;

        case 5:
            sm.display();
            break;

        default:
            break;
        }
    }
    catch(studexception e){
    e.printStackTrace();
    }
    System.out.println("enter 0 to continue");
    Scanner w=new Scanner(System.in);
    f=w.nextInt();
    }
    while(f==0);
    
        
}}

    
    

    

    

