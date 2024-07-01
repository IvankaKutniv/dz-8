package com.itproger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentsGroup {

    private Student headStudent;
    private final List<Student> students;
    private final Map<String, Map<Student, Boolean>> tasks;

    public StudentsGroup(Student headStudent) {
        if (headStudent == null) {
            throw new IllegalArgumentException("Head student must not be null");
        }
        this.headStudent = headStudent;
        this.students = new ArrayList<>();
        this.students.add(headStudent);
        this.tasks = new HashMap<>();
    }

    public Student getHeadStudent() {
        return headStudent;
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public Map<String, Map<Student, Boolean>> getTasks() {
        return new HashMap<>(tasks);
    }

    public void changeHeadStudent(Student newHeadStudent) {
        if (!students.contains(newHeadStudent)) {
            throw new IllegalArgumentException("New head student must be in the group");
        }
        this.headStudent = newHeadStudent;
    }

    public void addStudent(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Cannot add null student");
        }
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void removeStudent(Student student) {
        if (student.equals(headStudent)) {
            throw new IllegalArgumentException("Cannot remove the head student");
        }
        students.remove(student);
    }

    public void addTask(String task) {
        if (!tasks.containsKey(task)) {
            Map<Student, Boolean> taskCompletion = new HashMap<>();
            for (Student student : students) {
                taskCompletion.put(student, false);
            }
            tasks.put(task, taskCompletion);
        }
    }

    public void markTaskCompleted(Student student, String task) {
        if (!tasks.containsKey(task)) {
            throw new IllegalArgumentException("Task not found");
        }
        if (!students.contains(student)) {
            throw new IllegalArgumentException("Student not found in the group");
        }
        tasks.get(task).put(student, true);
    }

    public boolean isTaskCompleted(Student student, String task) {
        if (!tasks.containsKey(task) || !tasks.get(task).containsKey(student)) {
            throw new IllegalArgumentException("Task or student not found");
        }
        return tasks.get(task).get(student);
    }

    @Override
    public String toString() {
        return "StudentsGroup headStudent: " + headStudent + ", students: " + students + ", tasks: " + tasks;
    }

}
