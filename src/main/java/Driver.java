import org.joda.time.*;
import java.util.ArrayList;

public class Driver {
    public static void main(String args[]) {

        Course ECE = new Course("ECE", new DateTime(2018, 8, 28, 9, 0 ,0 ,0), new DateTime(2021, 6, 20, 5, 0, 0, 0));
        Course CSIT = new Course("CSIT", new DateTime(2018, 8, 28, 9, 0 ,0 ,0), new DateTime(2021, 6, 20, 5, 0, 0, 0));
        Course BA3 = new Course("BA3", new DateTime(2019, 8, 28, 9, 0 ,0 ,0), new DateTime(2021, 6, 20, 5, 0, 0, 0));

        ArrayList<Course> courses = new ArrayList<>();
        courses.add(ECE);
        courses.add(CSIT);
        courses.add(BA3);

        Student jack = new Student("Jack", 21, "12/05/2000", "112233", ECE);
        Student peter = new Student("Peter", 20, "12/12/2000", "445566", CSIT);
        Student rachel = new Student("Rachel", 19, "11/01/2002", "778899", BA3);
        Student orla = new Student("Orla", 21, "05/04/2000", "665544", ECE);

        Module ct417 = new Module("Software Eng", "ct417");
        Module ee451 = new Module("System on Chip 1", "ee451");
        Module ee4101 = new Module("Mobile Networks Eng", "ee4101");
        Module ee445 = new Module("Digital Signal Processing", "ee455");

        Module ba412 = new Module("Politcal Studies", "ba412");
        Module it389 = new Module("IT Infastructure", "it389");
        Module ba441 = new Module("Sociology", "ba441");

        ct417.getStudents().add(jack);
        ct417.getStudents().add(orla);
        ct417.getStudents().add(peter);

        ee451.getStudents().add(jack);
        ee451.getStudents().add(orla);

        ee4101.getStudents().add(jack);
        ee4101.getStudents().add(orla);

        ee445.getStudents().add(jack);
        ee445.getStudents().add(orla);

        it389.getStudents().add(peter);

        ba441.getStudents().add(rachel);
        ba412.getStudents().add(rachel);

        ECE.getModules().add(ct417);
        ECE.getModules().add(ee451);
        ECE.getModules().add(ee4101);
        ECE.getModules().add(ee445);

        CSIT.getModules().add(ct417);
        CSIT.getModules().add(it389);

        BA3.getModules().add(ba441);
        BA3.getModules().add(ba412);


        for(Course c : courses) {
            String sInfo = "";
            for(Student s : c.getStudents()) {
                sInfo += "\n\nName: " + s.getName() + "\nUsername: " + s.getUsername() + "\nModules: ";
                for(Module m : s.getModules()) {
                    sInfo += m.getmName() + ", ";
                }
                sInfo += "\nCourses: ";
                for(Course course : s.getCourses()) {
                    sInfo += course.getcName() + ", ";
                }
            }
            System.out.println("\n ------------------\nCourse: " + c.getcName() +
                    "\nModules: " + c.printModules() + "\nStudents:" + sInfo);
        }
    }
}

