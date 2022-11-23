import java.time.LocalDate;
import java.util.Arrays;

public class Group {
    private String name;
    private Student[] students;
    private LocalDate dateOfStart;
    private LocalDate getDateOfFinish;

    public Group(String name, Student[] students, LocalDate dateOfStart, LocalDate getDateOfFinish) {
        this.name = name;
        this.students = students;
        this.dateOfStart = dateOfStart;
        this.getDateOfFinish = getDateOfFinish;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public LocalDate getGetDateOfFinish() {
        return getDateOfFinish;
    }

    public void setGetDateOfFinish(LocalDate getDateOfFinish) {
        this.getDateOfFinish = getDateOfFinish;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name=" + name +
                ", students=" + Arrays.toString(students) +
                ", dateOfStart=" + dateOfStart +
                ", getDateOfFinish=" + getDateOfFinish +
                '}';
    }
}
