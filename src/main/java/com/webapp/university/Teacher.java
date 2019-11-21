package com.webapp.university;

public class Teacher {
    private String firstName;
    private String lastName;
    private String lesson;

    public Teacher(String firstName, String lastName, String lesson) {
        setFirstName(firstName);
        setLastName(lastName);
        setLesson(lesson);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", lesson='" + lesson + '\'' +
                '}';
    }
}
