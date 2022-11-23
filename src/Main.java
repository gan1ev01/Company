import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(20L, "Aibek uulu Nursultan", 15, 'M');
        Student student1 = new Student(21L, "Aibekov Nursultan", 16, 'M');
        Student student2 = new Student(22L, "Aibek uulu Nursultan", 17, 'M');
        Student student3 = new Student(23L, "Aibekov Nurik", 18, 'M');

        Student[] students = {student, student1, student2, student3};
        for (Student student4 : students) {
            System.out.println();
            System.out.println(student4);

            System.out.println("----------------------------------------------------------");

            Instructor instructor = new Instructor(24L, "Aibek kyzy Nurkyz", 19, 'F', 35000);
            Instructor instructor1 = new Instructor(25L, "Aibekova Nurkyz", 20, 'F', 38000);
            Instructor instructor2 = new Instructor(26L, "Aibek kyzy Nurgul", 21, 'F', 30000);
            Instructor instructor3 = new Instructor(27L, "Aibekova Nurgul", 22, 'F', 45000);
            Instructor[] instructors = {instructor, instructor1, instructor2, instructor3};
            for (Instructor instructor4 : instructors) ;
            System.out.println();
            System.out.println(instructor);

            System.out.println("------------------------------------------------------------");

            LocalDate dateOfStart = LocalDate.of(2022, 12, 5);
            LocalDate dateOfFinish = LocalDate.of(2021, 5, 12);

            System.out.println("-------------------------------------------------------------");

            Group group = new Group("Java8", students, dateOfStart, dateOfFinish);
            Group group1 = new Group("Java7", students, dateOfStart, dateOfFinish);
            Group[] groups = {group, group1};
            for (Group group2 : groups) {
                System.out.println();
                System.out.println(group);

                System.out.println("----------------------------------------------------------");

                Mentor mentor = new Mentor(28L, "Akmalidinov Nursultan", 23, 'M', 50000);
                Mentor mentor1 = new Mentor(29L, "Akmalidinov Nurik", 24, 'M', 45000);
                Mentor mentor2 = new Mentor(30L, "Akmalidin uulu Nursultan", 25, 'M', 35000);
                Mentor[] mentors = {mentor, mentor1, mentor2};
                for (Mentor mentor3 : mentors) {
                    System.out.println();
                    System.out.println(mentor);

                    System.out.println("---------------------------------------------------------");

                    Course course = new Course("Java(back and)", groups, instructor, mentors);

                    System.out.println("----------------------------------------------------------");

                    Person[] people = {student, student1, student2, student3, student4, instructor, instructor1, instructor2, instructor3, mentor, mentor1, mentor2, mentor3};
                    Person.sortAge(people);

                    System.out.println("-----------------------------------------------------------");

                    System.out.println("Students contract" + Company.income(students));
                    System.out.println("Period entor salary " + mentor.period(group));
                    System.out.println("Period student contracts " + student.period(group));
                }
            }
        }
    }
}







