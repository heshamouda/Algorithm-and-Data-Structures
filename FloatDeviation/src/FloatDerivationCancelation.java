import java.util.function.DoubleUnaryOperator;

/*
 * Created on 19.02.2020
 */
/**
 * @author Wolfgang Weck
 */
public class FloatDerivationCancelation {
	public static void main(String[] args) {
		final DoubleUnaryOperator f = x -> x * x;
		final double x = 0.5;
		double d = 1;
		while (x + d > x) {
			double gradient = (f.applyAsDouble(x + d) - f.applyAsDouble(x)) / d;
			System.out.printf("%.5e\t->\t%.8f\n", d, gradient);
			d = d / 2;
		}
	}
}
