import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {
    public void getSortedStreamList(List<Stream> streams) {
        Collections.sort(streams, new StreamComparator());
    }
}
