import com.google.common.math.IntMath;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class testyWydajnosci {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

        /*//List<TimeStorage> storages = new LinkedList<>();
        String fileName = "Reports/binomial.csv";
        PrintWriter writer = new PrintWriter(fileName, "UTF-8");
        int j = 1;
        for (int i = 0; i <= 2147300000; i= i+100000) {
            TimeStorage timeStorage = new TimeStorage();
            try (Timer timer = new Timer(timeStorage)) {
                int a = IntMath.binomial(i, 0);
            } catch (Exception e) {
                e.printStackTrace();
            }
            writer.println(timeStorage.getTime());
            j++;
            //storages.add(timeStorage);
        }
        //storages.stream().map(TimeStorage::getTime).forEach(System.out::println);*/


        //todo sprawdzić przy jakiej wartości i wynik przekroczy wartość int.maxvalue
        //List<TimeStorage> storages = new LinkedList<>();
        String fileName = "Reports/pow.csv";
        PrintWriter writer = new PrintWriter(fileName, "UTF-8");
        int j = 1;
        for (int i = 0; i <= 2147300000; i= i+100000) {
            TimeStorage timeStorage = new TimeStorage();
            try (Timer timer = new Timer(timeStorage)) {
                int a = IntMath.pow(2, i);
            } catch (Exception e) {
                e.printStackTrace();
            }
            writer.println(timeStorage.getTime());
            j++;
            //storages.add(timeStorage);
        }
        //storages.stream().map(TimeStorage::getTime).forEach(System.out::println);

    }
}
