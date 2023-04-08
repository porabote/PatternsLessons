public class Main {

    public static void main(String[] args) {
        BinOps bins = new BinOps();

        // a = 3, b = 4
        String sum = bins.sum("11", "100");
        System.out.println(Integer.parseInt(sum));

        String mult = bins.mult("11", "100");
        System.out.println(Integer.parseInt(mult));

    }
}
