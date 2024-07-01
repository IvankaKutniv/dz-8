package com.itproger;

public class App 
{
    public static void main( String[] args ) {

        Student student1 = new Student(1, "Ivan", "Franko");
        Student student2 = new Student(2, "Petro", "Sahaidachnyi");
        Student student3 = new Student(3, "Olga", "Karpenko");

        StudentsGroup group = new StudentsGroup(student1);
        group.addStudent(student2);
        group.addStudent(student3);

        group.addTask("Вивчити інкапсуляцію");
        group.markTaskCompleted(student2, "Вивчити інкапсуляцію");

        System.out.println(group.getHeadStudent());
        System.out.println(group.getStudents());
        System.out.println(group.getTasks());

    }
}


