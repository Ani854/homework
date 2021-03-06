public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private char gender;
    private double mark;


    public void printInfo() {
        System.out.printf("Full name: %s %s, ", firstName, lastName);
        System.out.printf("Year: %d, ", year);
        System.out.printf("Gender: %s, ", gender == 'm' ? "Male" : "Female");
        System.out.printf("Mark: %.1f,\n ", mark);
        System.out.println("---------------------");
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
}
