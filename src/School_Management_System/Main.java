package School_Management_System;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher Hector = new Teacher(1,"Hector",6000);
        Teacher Julian = new Teacher(2,"Julian",7000);
        Teacher Matt = new Teacher(3,"Matt",8000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Hector);
        teacherList.add(Julian);
        teacherList.add(Matt);

        Student Robel = new Student(1,"Robel",12);
        Student Ozzy = new Student(2,"Ozzy",12);
        Student Keng = new Student(3,"Keng",12);
        List<Student> studentList = new ArrayList<>();

        studentList.add(Robel);
        studentList.add(Keng);
        studentList.add(Ozzy);

        School CTAC = new School(teacherList,studentList);
        Teacher Erin = new Teacher(6,"Erin", 900);

        CTAC.addTeacher(Erin);
        Robel.payFees(5000);
        Ozzy.payFees(6000);
        System.out.println("CTAC has earned $"+ CTAC.getTotalMoneyEarned());

        System.out.println("Making SCHOOL PAY SALARY");
        Hector.receiveSalary(Hector.getSalary());
        System.out.println("CTAC has spent for salary to " + Hector.getName()
        +" and now has $" + CTAC.getTotalMoneyEarned());

        Matt.receiveSalary(Matt.getSalary());
        System.out.println("CTAC has spent for salary to " + Matt.getName()
                +" and now has $" + CTAC.getTotalMoneyEarned());
        System.out.println(Ozzy);

        Julian.receiveSalary(Julian.getSalary());
        System.out.println(Julian);
    }
}
