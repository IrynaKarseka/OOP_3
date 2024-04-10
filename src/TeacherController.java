import java.util.List;

public class TeacherController implements UserController<Teacher> {
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    public void update(String firstName, String lastName, String middleName,
                       String newFirstName, String newLastName, String newMiddleName) {
        teacherService.updateTeacher(firstName, lastName, middleName,
                newFirstName, newLastName, newMiddleName);
    }


    public void sendOnConsole(List<Teacher> list) {
        teacherView.sendOnConsole(list);
    }
    @Override
    public void create(String firstName, String lastName, String middleName) {
        teacherService.createTeacher(firstName, lastName, middleName);
    }
}
