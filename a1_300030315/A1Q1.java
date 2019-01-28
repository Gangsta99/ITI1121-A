public class A1Q1 {
	public static int countPositive(double[] arys) {
		int result;
		result = 0;
		for (int i = 0; i < arys.length; i++){
			if (arys[i] > 0.0) {
				result++;
			}
		}
		return result; 
	}
}