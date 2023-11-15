public class kalkulagailua {
    public int batuketa(int a, int b) {
        return a + b;
    }

    public int kenketa(int a, int b){
        return a - b;
    }

    public int biderketa(int a, int b) {
        return a * b;
    }

    public int zatiketa(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Zero division error");
        }
    }
}
