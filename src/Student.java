public class Student implements Comparable<Student> {
    private Long studentId =0L;
    private String firstName;
    private String lastName;
    private String middleName;

    static     Long i = 0L;
    public Student( String firstName, String lastName, String middleName) {
        this.studentId = i++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public Student() {
        this.studentId = i + 1L;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.studentId);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                '}';
    }
}
