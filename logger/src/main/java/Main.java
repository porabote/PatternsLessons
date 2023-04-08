import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int listSize;
        int maxValue;
        int filterValue;

        Logger logger = Logger.getInstance();

        Scanner scanner = new Scanner(System.in);

        logger.log("Request for list size");
        System.out.println("Please, enter list size");
        listSize = scanner.nextInt();

        logger.log("Request for list max value");
        System.out.println("Please, enter max value");
        maxValue = scanner.nextInt();

        ArrayList<Integer> list = new ArrayList<>(listSize);

        for (int i = 0; i < listSize; i++) {
            //list.add((int) (Math.random() * maxValue));
            Random random = new Random();
            list.add(random.nextInt(maxValue));

        }

        logger.log("Request for filter value");
        System.out.println("Please, enter filter value");
        filterValue = scanner.nextInt();

        Filter filter = new Filter(filterValue);
        List<Integer> filteredList = filter.filterOut(list);
        System.out.println(filteredList);

    }
}