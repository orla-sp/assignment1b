import org.joda.time.*;
import java.util.ArrayList;

public class Driver {
    public static void main(String args[]) {

        // creating course objects
        Course ECE = new Course("ECE", new DateTime(2018, 8, 28, 9, 0 ,0 ,0), new DateTime(2021, 6, 20, 5, 0, 0, 0));
        Course CSIT = new Course("CSIT", new DateTime(2018, 8, 28, 9, 0 ,0 ,0), new DateTime(2021, 6, 20, 5, 0, 0, 0));
        Course BA3 = new Course("BA3", new DateTime(2019, 8, 28, 9, 0 ,0 ,0), new DateTime(2021, 6, 20, 5, 0, 0, 0));

        // initialising course list and adding courses
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(ECE);
        courses.add(CSIT);
        courses.add(BA3);

        // creating student objects
        Student jack = new Student("Jack", 21, "12/05/2000", "112233", ECE);
        Student peter = new Student("Peter", 20, "12/12/2000", "445566", CSIT);
        Student rachel = new Student("Rachel", 19, "11/01/2002", "778899", BA3);
        Student orla = new Student("Orla", 21, "05/04/2000", "665544", ECE);

        // creating module objects
        Module ct417 = new Module("Software Eng", "ct417");
        Module ee451 = new Module("System on Chip 1", "ee451");
        Module ee4101 = new Module("Mobile Networks Eng", "ee4101");
        Module ee445 = new Module("Digital Signal Processing", "ee455");

        Module ba412 = new Module("Politcal Studies", "ba412");
        Module it389 = new Module("IT Infastructure", "it389");
        Module ba441 = new Module("Sociology", "ba441");

     // adding modules to each course
        ECE.addModule(ct417);
        ECE.addModule(ee451);
        ECE.addModule(ee4101);
        ECE.addModule(ee445);

        CSIT.addModule(ct417);
        CSIT.addModule(it389);

        BA3.addModule(ba412);
        BA3.addModule(ba441);

     // looping over students in each course
     // adding course modules to students modules list
        for(Course c : courses) {
            for(Student s : c.getStudents()) {
                for(Module m : c.getModules()) {
                    s.addModule(m);
                }
            }
        }

        // looping over all courses
        for(Course c : courses) {
            String sInfo = "";
            // looping over students in course
            for(Student s : c.getStudents()) {
                // adding student information to a string
                sInfo += "\n\nName: " + s.getName() + "\nUsername: " + s.getUsername() + "\nModules: ";
                // looping over moduels taken by student
                for(Module m : s.getModules()) {
                    // adding modules to student information string
                    sInfo += m.getmName() + ", ";
                }
                sInfo += "\nCourses: ";
                // looping over courses taken by student
                for(Course course : s.getCourses()) {
                    // adding course name to student informatin string
                    sInfo += course.getcName() + ", ";
                }
            }
            // printing out all information
            System.out.println("\n ------------------\nCourse: " + c.getcName() +
                    "\nModules: " + c.printModules() + "\nStudents:" + sInfo);
        }
    }
}

