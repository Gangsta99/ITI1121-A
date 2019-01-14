public class Q3_ReverseSortDemo {
    public static void main(String[] args){
        char[] unorderedLetters;
        unorderedLetters = new char[]{'b', 'm', 'z', 'a', 'u'};
        reverseSort(unorderedLetters);
        for (int i = 0 ; i < unorderedLetters.length; i++ )
            System.out.print(unorderedLetters[i]);
    }

    //method that sorts a char array into its reverse alphabetical order
    public static void reverseSort(char[] values){
        char aaa,bbb;
        int i,j;
        for (i=0; i<values.length-1; i++) {
            aaa = values[i];
            int k=0;
            for (j=i+1; j<values.length; j++) {
                if (values[j]<aaa){
                    aaa = values[j];
                    k = j;
                }
              }
            values[k] = values[i];
            values[i] = aaa;
        }
    }

}