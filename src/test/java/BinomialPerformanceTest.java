import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import java.util.List;

import static com.google.common.math.IntMath.binomial;

public class BinomialPerformanceTest {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        List<TimeStorage> storages = new LinkedList<>();
        TimeStorage timeStorage;
        for (int i = 20; i <= 100020; i= i+100) {
            timeStorage = new TimeStorage();
            try (Timer timer = new Timer(timeStorage)) {
                int a = binomial(i, 20);
            } catch (Exception e) {
                e.printStackTrace();
            }
            storages.add(timeStorage);
        }
        storages.stream().map(TimeStorage::getTime).filter(s -> s < 1000).forEach(System.out::println);
    }
}
