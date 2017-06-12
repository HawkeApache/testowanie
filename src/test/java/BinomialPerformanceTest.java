import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import java.util.List;

import static com.google.common.math.IntMath.binomial;

public class BinomialPerformanceTest {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        List<TimeStorage> storages = new LinkedList<>();
        TimeStorage timeStorage;
        for (int i = 0; i <= 100000; i= i+100) {
            timeStorage = new TimeStorage();
            try (Timer timer = new Timer(timeStorage)) {
                int a = binomial(i, 0);
            } catch (Exception e) {
                e.printStackTrace();
            }
            storages.add(timeStorage);
        }
        storages.stream().map(TimeStorage::getTime).forEach(System.out::println);
    }
}
