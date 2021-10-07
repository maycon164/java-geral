package com.app.grades;

import com.app.models.GradeBook;

public class Main {

    public static void main(String[] args) {
        int [] grades = {87, 12, 45, 89, 76, 100, 100, 34, 43, 32, 31, 38};
        GradeBook gradeBook = new GradeBook("Sistemas", grades);

        gradeBook.processGrade();

    }
}
