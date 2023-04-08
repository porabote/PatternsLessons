import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {

        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();

        logger.log("Starting filtering");
        return source.stream()
                .filter(val -> {
                    boolean res = val >= this.treshold;
                    if (res) {
                        logger.log(val + " it's ok!");
                    } else {
                        logger.log(val + " it's NOT ok!");
                    }
                    return res;
                })
                .collect(Collectors.toList());
    }
}