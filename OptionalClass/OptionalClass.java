package OptionalClass;
import java.util.Optional;
class OptionalCLass{
    public static void main(String[] args) {
        Optional<Double> optionalDouble = getOptionalDouble();
        double value = optionalDouble.orElse(100.0);
        System.out.println("The value is " + value);
    }
    private static Optional<Double> getOptionalDouble() {
        return Optional.of(50.0);
    }
}
// a->a.size();
//(a,b)-> {
// return a+b
// };
