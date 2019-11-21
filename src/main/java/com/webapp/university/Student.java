package com.webapp.university;

public class Student {
    private String firstName;
    private String lastName;
    private double avg;

    public Student(String firstName, String lastName, double avg) {
        setFirstName(firstName);
        setLastName(lastName);
        setAvg(avg);
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

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", avg=" + avg +
                '}';
    }
}
