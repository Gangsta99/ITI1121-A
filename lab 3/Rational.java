public class Rational {

    private int numerator;
    private int denominator;

    // constructors

    public Rational(int numerator) {
	     // Your code here
    }

    public Rational(int numerator, int denominator) {
	     // Your code here
    }

    // getters

    public int getNumerator() {
	     return numerator;
    }

    public int getDenominator() {
	     return denominator;
    }

    // instance methods

    public Rational plus(Rational other) {
	     // Your code here
    }

    public static Rational plus(Rational a, Rational b) {
    	// Your code here
    }

    // Transforms this number into its reduced form

    private void reduce() {
      // Your code here
    }

    // Euclid's algorithm for calculating the greatest common divisor
    private int gcd(int a, int b) {
    	while (a != b)
    	    if (a > b)
    		     a = a - b;
    	    else
    		     b = b - a;
    	return a;
    }

    public int compareTo(Rational other) {
      // Your code here
    }

    public boolean equals(Rational other) {
      // Your code here
    }

    public String toString() {
    	String result;
    	if (denominator == 1) {
    	    // Your code here
    	} else {
    	    // Your code here
    	}
    	return result;
    }

}