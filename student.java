/*Develop a Java application to manage student records using the Java Collections Framework and
Exception Handling.
a) Create a Student class and use ArrayList to store and manage multiple student records
dynamically.
b) Use HashMap along with generics to store and retrieve student records using a unique student
ID.
c) Implement exception handling to manage invalid inputs, missing records, or runtime errors
during operations such as adding, searching, updating, or deleting student records.
*/

public class student {
    private String name;
    private int rollno;
    private int marks;
    public student(String name,int rollno, int marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }
    public String getName() {
        return name;
    }
    public int getRollno() {
        return rollno;
    }
    public int getMarks() {
        return marks;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    @Override
    public String toString() {
        return "student [name=" + name + ", rollno=" + rollno + ", marks=" + marks + "]";
    }
    }




