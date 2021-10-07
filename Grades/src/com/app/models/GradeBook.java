package com.app.models;

public class GradeBook {

    private String courseName;
    private int[] grades;

    public GradeBook(String courseName, int[] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void processGrade() {
        outputGrades();
        outputBarChart();
    }

    private void outputBarChart() {
        System.out.println("\nGrade Distribution");
        int[] frequency = new int[11];

        for (int grade : grades)
            ++frequency[grade / 10];

        for (int count = 0; count < frequency.length; count++) {

            if (count == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
            }

            for(int stars = 0; stars < frequency[count]; stars++){
                System.out.printf("*");
            }
            System.out.println();
        }

    }

    private void outputGrades() {
        System.out.println("As notas são: ");

        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d: %3d%n", student + 1, grades[student]);
        }
    }


}
