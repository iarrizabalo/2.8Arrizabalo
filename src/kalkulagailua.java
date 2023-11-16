public class kalkulagailua {
    public double inversoa(double a) {
    if (a != 0) {
        return 1 / a;
    } else {
        throw new ArithmeticException("Zero division error");
    }
}

}
