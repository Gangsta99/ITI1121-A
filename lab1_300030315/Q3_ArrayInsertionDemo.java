public class Q3_ArrayInsertionDemo{

	public static int[] insertIntoArray(int[] beforeArray, int indexToInsert, int valueToInsert){
		int[] afterArray;
		afterArray = new int[] {1,1,1,1,1,1,1};
		for (int i=0; i<beforeArray.length + 1; i++) {
			if (i< indexToInsert) {
				afterArray[i]=beforeArray[i];
			}
			else if (i==indexToInsert) {
				afterArray[i]=valueToInsert;
			}
			else {
				afterArray[i]=beforeArray[i-1];
			}
		}
		return afterArray;
	}

	public static void main(String[] args){
		int[] valuesArray;
		valuesArray = new int []{1,5,4,7,9,6};
		int indexToInsert = 3;
		int valueToInsert = 15;
		System.out.println("Array before inserction: ");
		for (int i = 0; i<valuesArray.length; i++) {
			System.out.println(valuesArray[i]);
		} 

		valuesArray = insertIntoArray(valuesArray,3,15);

		System.out.println("Array after insertion of 15 at position 3:");
		for (int i=0; i<valuesArray.length; i++) {
			System.out.println(valuesArray[i]);
		}

	}
}