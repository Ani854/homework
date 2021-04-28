import com.sun.deploy.util.StringUtils;

public class StudentConvertor {
    public static Student[] makeStringsToStudents(String[] strings) {
        Student[] student = new Student[strings.length];
        for (int i = 0; i < strings.length; i++) {
            student[i] = new Student();
            String[] split = strings[i].split(",");
            student[i].setFirstName(split[0]);
            student[i].setLastName(split[1]);
            student[i].setYear(Integer.parseInt(split[2]));
            student[i].setGender(split[3].charAt(0));
            student[i].setMark(Double.parseDouble(split[4]));

        }
        return student;
    }
}
