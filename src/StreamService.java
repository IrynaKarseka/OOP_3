import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {
    public List<Stream> getSortedStream(List<Stream> streams) {
        Collections.sort(streams, new StreamComparator());
        return streams;
    }
}
