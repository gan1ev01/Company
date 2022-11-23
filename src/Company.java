import java.util.Arrays;

public class Company {
    private String name;
    private String address;
    private Course[] courses;
    private String languageOfInstruction;


    public Company(String name, String address, Course[] courses, String languageOfInstruction) {
        this.name = name;
        this.address = address;
        this.courses = courses;
        this.languageOfInstruction = languageOfInstruction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public String getLanguageOfInstruction() {
        return languageOfInstruction;
    }

    public void setLanguageOfInstruction(String languageOfInstruction) {
        this.languageOfInstruction = languageOfInstruction;
    }

    public static double income(Student[]students) {
        double summa = 0;
        for (Student student : students) {
            summa=students.length+summa;
        }
        return summa;
    }
}
