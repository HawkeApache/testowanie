import com.google.common.math.IntMath;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import java.util.List;

public class PowPerformanceTest {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        List<TimeStorage> storages = new LinkedList<>();
        TimeStorage timeStorage = new TimeStorage();
        for (int i = 0; i <= 35; i++) { //MaxInt = 2^31-1
            try (Timer timer = new Timer(timeStorage)) {
                int a = IntMath.pow(2, i);
            } catch (Exception e) {
                e.printStackTrace();
            }
            storages.add(timeStorage);
        }
        storages.stream().map(TimeStorage::getTime).forEach(System.out::println);
    }
}
