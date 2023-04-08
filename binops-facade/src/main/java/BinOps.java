public class BinOps {
    public String sum(String a, String b) {
        int operandFirst = Integer.parseInt(a, 2);
        int operandSecond = Integer.parseInt(b, 2);

        int sum = operandFirst + operandSecond;
        return Integer.toBinaryString(sum);
    }

    public String mult(String a, String b) {
        int operandFirst = Integer.parseInt(a, 2);
        int operandSecond = Integer.parseInt(b, 2);

        int mult = operandFirst * operandSecond;
        return Integer.toBinaryString(mult);
    }
}