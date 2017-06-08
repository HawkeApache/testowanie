import com.google.common.math.IntMath;

import java.sql.Time;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by tomasz on 08.06.17.
 */
public class testyWydajnosci {
    public static void main(String[] args) {
        List<TimeStorage> storages = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            TimeStorage timeStorage = new TimeStorage();
            try (Timer timer = new Timer(timeStorage)) {
                int a = IntMath.binomial(i, 5);
            } catch (Exception e) {
                e.printStackTrace();
            }
            storages.add(timeStorage);
        }
        storages.stream().map(timeStorage -> timeStorage.getTime()).forEach(System.out::println);
    }
}
