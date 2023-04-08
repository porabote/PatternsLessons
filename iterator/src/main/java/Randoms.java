import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int max;
    protected int min;

    public Randoms(int min, int max) {
        this.random = new Random(min);
        this.max = max;
        this.min = min;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            int next;

            public boolean hasNext() {
                return true;
            }

            public Integer next() {
                this.next = random.nextInt(max + 1 - min) + min;
                return this.next;
            }
        };

    }

}