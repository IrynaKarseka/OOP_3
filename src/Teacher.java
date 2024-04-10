import java.util.Iterator;

public class Teacher extends User implements Comparable<Teacher>{
    private Long teacherId;

    public Teacher(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public int compareTo(Teacher o) {
        return this.teacherId.compareTo(o.teacherId);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                " teacherId= " + teacherId +
                " firstName= " + super.getFirstName() +
                "lastName= " + super.getLastName() +
                "middleName= " + super.getMiddleName() +
                '}';
    }
}