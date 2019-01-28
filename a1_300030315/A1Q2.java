public class A1Q2 {
    public static boolean hasLengthTwoRun(double[] arys) {
      if (arys.length < 2) {
          return false;
      }
      else {
        int numb;
          numb = 0;

        for (int i = 0; i < arys.length-1; i++){
            for (int j = i+1; j<arys.length; j++){
                if (arys[i] == arys[j]){
                	numb++;
                }
            }
        }
          return (numb >= 1);
      }
    }
}