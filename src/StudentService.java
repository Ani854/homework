public class StudentService {
    public void task1(Student[] student) {
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].getFirstName() + " " + student[i].getLastName());
        }
    }

    public void task2(Student[] students) {
        for (Student student : students) {
            if (student.getGender() == 'm') {
                student.printInfo();
            }
        }
    }

    public void task3(Student[] students) {
        for (Student student : students) {
            if (student.getGender() == 'f' && student.getMark() > 50.4) {
                student.printInfo();
            }
        }
    }

    public void task4(Student[] students) {
        Student studentOfMinimalMark = students[0];
        for (int i = 1; i < students.length; i++) {
            if (studentOfMinimalMark.getMark() > students[i].getMark()) {
                studentOfMinimalMark = students[i];
            }
        }
        studentOfMinimalMark.printInfo();
    }

    public void task5(Student[] students) {
        Student maleStudent = null;
        for (int i = 0; i < students.length; i++) {
            if (maleStudent == null) {
                if (students[i].getGender() == 'm') {
                    maleStudent = students[i];
                }
                continue;
            }

            if (students[i].getGender() == 'm' && students[i].getYear() < maleStudent.getYear()) {
                maleStudent = students[i];
            }
        }
        maleStudent.printInfo();
    }

    public void task6(Student[] students) {
        boolean isActive = true;
        int count = 0;
        while (isActive) {
            isActive = false;
            for (int i = 0; i < students.length - 1 - count; i++) {
                if (students[i].getMark() > students[i + 1].getMark()) {
                    Student temp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = temp;
                    isActive = true;
                }
            }
            count++;
        }
        for (Student student : students) {
            student.printInfo();
        }
    }

    public void task7(Student[] students) {
        int countOfFemales = 0;
        for (Student student : students) {
            if (student.getGender() == 'f') {
                countOfFemales++;
            }
        }
        Student[] femaleStudent = new Student[countOfFemales];
        int j = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGender() == 'f') {
                femaleStudent[j++] = students[i];
            }
        }
        boolean isActive = true;
        int count = 0;
        while (isActive) {
            isActive = false;
            for (int i = 0; i < femaleStudent.length - 1 - count; i++) {
                if (femaleStudent[i].getYear() > femaleStudent[i + 1].getYear()) {
                    Student temp = femaleStudent[i];
                    femaleStudent[i] = femaleStudent[i + 1];
                    femaleStudent[i + 1] = temp;
                    isActive = true;
                }
            }
            count++;
        }
        for (Student student : femaleStudent) {
            student.printInfo();
        }
    }
}
