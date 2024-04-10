import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private final List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    public void createTeacher(String firstName, String lastName, String middleName){
        teachers.add(new Teacher(firstName, lastName, middleName));
    }

    public void updateTeacher(String firstName, String lastName, String middleName,
                              String newFirstName, String newLastName, String newMiddleName){
        for (Teacher teacher: teachers) {
            if (    teacher.getFirstName().equals(firstName) &&
                    teacher.getLastName().equals(lastName) &&
                    teacher.getMiddleName().equals(middleName)) {
                teacher.setFirstName(newFirstName);
                teacher.setLastName(newLastName);
                teacher.setMiddleName(newMiddleName);
            }
        }
    }
}
