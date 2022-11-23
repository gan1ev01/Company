import java.time.Period;

public class Student extends Person{
    private double contract;

    public Student(Long id, String fullName, int age, char gender) {
        super(id, fullName, age, gender);
    }

    public double getContract() {
        return contract;
    }

    public void setContract(double contract) {
        this.contract = contract;
    }

    @Override
    public double period(Group group) {
        int peroid = Period.between(group.getDateOfStart(),group.getGetDateOfFinish()).getMonths();
        return peroid*getContract();
    }

    @Override
    public String toString() {
        return "Student{" +
                "contract=" + contract +
                '}';
    }
}
