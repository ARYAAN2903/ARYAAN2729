import java.util.Scanner;
class Teacher{
    String name;
    String course;
    String department;
    String designation;
    int teacher_id;
    public Teacher(String name,String course,String department,String designation,int teacher_id){
        this.name=name;
        this.course=course;
        this.department=department;
        this.designation=designation;
        this.teacher_id=teacher_id;

    }
    public void display(){
        System.out.println("Name : "+this.name);
        System.out.println("Designation: "+this.designation);
        System.out.println("Course : "+ this.course);
        System.out.println("Department : "+this.department);
        System.out.println("Teacher ID : "+this.teacher_id);
    }

}
    class Professor extends Teacher{
        public Professor(String name, String course, String department, String designation, int teacher_id) {
            super(name, course, department, "Professor", teacher_id);
        }


    }
    class Associate_Professor extends Teacher{
        public Associate_Professor(String name, String course, String department, String designation, int teacher_id) {
            super(name, course, department, "Associate_Professor", teacher_id);
        }
    }
    class Assistant_Professor extends Teacher{
        public Assistant_Professor(String name, String course, String department, String designation, int teacher_id) {
            super(name, course, department, "Assistant_Professor", teacher_id);
        }
    }


public class Teach {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name=null; String course=null;String department=null;String designation=null;int tid=0,choice;
        while(true)
    }
}
