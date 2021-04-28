import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        FileService.createFolder("Lesson");
        FileService.createFile("Lesson", "students.txt");
        FileService.write("Lesson\\students.txt", "Anna,Aramyan,1999,f,88.6" +
                "\nAnahit,Mesropyan,2000,f,50.0" +
                "\nArmen,Melqumyan,1976,m,76.7" +
                "\nArtur,Babayan,2001,m,60.5");
        String[] strings = FileService.readLines("Lesson\\students.txt");
        Student[] students = StudentConvertor.makeStringsToStudents(strings);
        StudentService studentService = new StudentService();
        Scanner scanner = new Scanner(System.in);
        boolean isMenuActive = true;
        while (isMenuActive) {
            System.out.println("Enter command number");
            System.out.println("1.  Print full name of students.");
            System.out.println("2.  print all male Students.");
            System.out.println("3.  print all female students who has mark greater then 50.4.");
            System.out.println("4.  Print student information having the minimal mark.");
            System.out.println("5.  Print biggest male student information.");
            System.out.println("6.  Print students sorted by mark.");
            System.out.println("7.  Print female students sorted by year.");
            int c = scanner.nextInt();
            switch (c) {
                case 1:
                    studentService.task1(students);
                    break;
                case 2:
                    studentService.task2(students);
                    break;
                case 3:
                    studentService.task3(students);
                    break;
                case 4:
                    studentService.task4(students);
                    break;
                case 5:
                    studentService.task5(students);
                    break;
                case 6:
                    studentService.task6(students);
                    break;
                case 7:
                    studentService.task7(students);
                    break;
                default:
                    System.out.println("Invalid command number");
            }
        }
    }
}
