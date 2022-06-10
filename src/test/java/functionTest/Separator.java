package functionTest;

public class Separator {

    public static double getNumber(int a, int b) throws ArithmeticException {
        if (a > b)
            return (a - b) / 2.0;
        if (a < b) {
            if (Double.valueOf((double) b / a).isInfinite()) {
                throw new ArithmeticException("Ошибка при делении на ноль");
            } else {
                return (double) b / a;
            }
        }
        return a;
    }
}
