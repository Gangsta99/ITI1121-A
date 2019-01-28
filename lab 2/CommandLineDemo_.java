public class CommandLineDemo_{
	public static void main (String[]args){
		System.out.print("My chosen numbers are {");
		for (int i = 0; i < args.length; i++) {
			System.out.print(Integer.parseInt(args[i]));
			// change to System.out.print(Float.parseFloat(args[i])); if the input number is other than integer
			if ( i != args.length - 1)
				System.out.print(" , ");
			else
				System.out.print(" }");
		}
	}
}