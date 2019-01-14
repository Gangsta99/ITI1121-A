import java.util.Scanner;

public class Qq6{
    public static void main(String[] args){

        int theclass=10;
        double[] studentgrades;
        studentgrades = new double [theclass];

        for (int i=0; i<theclass; i++) {
            System.out.print("Please enter the grade of the student:");
            Scanner grades = new Scanner(System.in);
            studentgrades[i] = grades.nextDouble();
        }
        System.out.println("The average is " + calculateAverage(studentgrades));
        System.out.println("The median is " + calculateMedian(studentgrades));
        System.out.println("The Number of student failed is "+calculateNumberFailed(studentgrades));
        System.out.println("The Number of student passed is "+calculateNumberPassed(studentgrades));
    }

    public static double calculateAverage(double[] notes) {
        double resulta;
        resulta = 0.0;
        for (int i=0; i<notes.length; i++) {
            resulta = resulta + notes[i];
        }
        resulta = resulta / notes.length ;
        return resulta;
    }

    public static double calculateMedian(double[] notes) {
        double median =0;
        int a;
        double b;
        for (int i = 0; i<notes.length; i++) {
            a = i;
            for (int j=i+1; j<notes.length; j++) {
                if (notes[j]<notes[a]) {
                    a=j;
                }
            }
            b=notes[a];
            notes[a]=notes[i];
            notes[i]=b;
        }
        if (notes.length%2==1) {
          median = notes[notes.length/2];
        }
        else {
          double c = notes[notes.length/2];
          double d = notes[(notes.length-1)];
          median = (c+d) / 2;
        }
        return median;
    }

    public static int calculateNumberFailed(double[] notes) {
        int a=0;
        for (int i=0; i<notes.length; i++) {
            if (notes[i]<50) {
                a=a+1;
            }
        }
        return a;
    }

    public static int calculateNumberPassed(double[] notes) {
        int b=0;
        for (int i=0; i<notes.length; i++) {
            if (notes[i]>50) {
                b=b+1;
            }
        }
        return b;
    }
}