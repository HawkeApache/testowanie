/**
 * Created by tomasz on 08.06.17.
 */
public class Timer implements AutoCloseable {

    long start;
    TimeStorage timeStorage;

    public Timer(TimeStorage timeStorage) {
        this.start = System.nanoTime();
        this.timeStorage = timeStorage;
    }

    @Override
    public void close() throws Exception {
        this.timeStorage.setTime(System.nanoTime()-start);
    }
}
