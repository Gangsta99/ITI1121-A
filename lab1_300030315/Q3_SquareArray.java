public class Q3_SquareArray{

	public static int[] createArray(int size) {
			int[] anArray;
		anArray = new int [size];
		for (int i = 0; i<anArray.length; i++) {
			anArray[i] = i*i;
		}
		return anArray;
	}

	public static void main(String[] args){
			int[] arrayToPrint = createArray(13);
		for (int i = 0; i<arrayToPrint.length; i++) {
			System.out.println("value for index " + i +" is: " + arrayToPrint[i]);
		}
	}
}