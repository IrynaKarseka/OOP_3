import java.util.List;

public class Controller {
    private StreamService streamService;
    private final StudentGroupService studentGroupService = new StudentGroupService();
    public void removeStudentByFIO(String firstName, String lastName, String middleName) {
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }

    public List<Student> getSortedStudentList() {
        return studentGroupService.getSortedStudentList();
    }

    public List<Student> getSortedStudentByID() {
        return studentGroupService.getSortedStudentByID();
    }
    public void sortedStreames(List<Stream> streams){
        streamService.getSortedStreamList(streams);
    }
}
