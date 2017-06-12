import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import java.util.List;

import static com.google.common.math.IntMath.gcd;

public class GcdPerformanceTest {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        List<TimeStorage> storages = new LinkedList<>();
        for (int i = 0; i <= 100000; i= i+100) {
            TimeStorage timeStorage = new TimeStorage();
            try (Timer timer = new Timer(timeStorage)) {
                int a = gcd(i, 1410);
            } catch (Exception e) {
                e.printStackTrace();
            }
            storages.add(timeStorage);
        }
        storages.stream().map(TimeStorage::getTime).forEach(System.out::println);
    }
}
