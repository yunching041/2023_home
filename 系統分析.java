
abstract class CShape{
    protected String color;
    public void setColor(String str){
        color = str;
    }


    public abstract void show();
}



class CTriangle extends CShape{
    double ca, cb, cc;
    public CTriangle(double a, double b, double c){
        ca=a;
        cb=b;
        cc=c;
    }
   
    public void show() {
       
        System.out.print("color="+color+"  ");
        System.out.print("area="+0.5*ca*cb);
    }
   
}


public class Student {
    import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public boolean addCourse(Course course) {
        if (courses.size() < 10) {
            courses.add(course);
            return true;
        }
        return false;
    }

    public boolean removeCourse(Course course) {
        return courses.remove(course);
    }

    public List<Course> getCourses() {
        return courses;
    }

    // Other getters, setters, and relevant methods
}

public class Course {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    // Getters, setters, and other relevant methods
}

    
}

public class app11 {
   public static void main(String[] args) {
    CTriangle ct = new CTriangle(3, 4, 5);
    ct.setColor("red");
    ct.show();
    }
}













