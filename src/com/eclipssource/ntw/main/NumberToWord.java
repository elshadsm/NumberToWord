package com.eclipssource.ntw.main;

public class NumberToWord {
	
	
	
	  private static final String[] ones = {
		        " one", " two", " three", " four", " five",
		        " six", " seven", " eight", " nine", " ten",
		        " eleven", " twelve", " thirteen", " fourteen",
		        " fifteen", " sixteen", " seventeen",
		        " eighteen", " nineteen"
		    };
		    private static final String[] tens = {
		        " twenty", " thirty", " fourty", " fifty",
		        " sixty", " seventy", " eighty", " ninety"
		    };
		    // the program does not handle numbers larger than quintillions
		    // this is ok for now

		    private static final String[] groups = {
		        "",
		        " thousand",
		        " million",
		        " billion",
		        " trillion",
		        " quadrillion",
		        " quintillion"
		    };
	
	
		    public static void main(String[] args) {
		        // TODO code application logic here
		    	NumberToWord javaTest = new NumberToWord();

		        System.out.println(numberToWord(45213));

		    }

		    public static String numberToWord(long n) {

		        String string = "";

		        if (n == 0) {
		            string = "zero";
		            return string;
		        } else if (n < 0) {
		            string = " minus";
		            n = -n;

		        }

		        boolean putTree = false;

		        // Go through the number one group at a time.
		        for (int i = groups.length - 1; i >= 0; i--) {

		            // Is the number as big as this group?
		            long cutoff = (long) Math.pow(10,
		                    i * 3);

		            if (n >= cutoff) {

		                int thisPart = (int) (n / cutoff);

		                // Use the ones[] array for both the
		                // hundreds and the ones digit. Note
		                // that tens[] starts at "twenty".
		                if (thisPart >= 100) {
		                    string
		                            += ones[thisPart / 100 - 1]
		                            + " hundred";
		                    thisPart = thisPart % 100;
		                }
		                if (thisPart > 19) {
		                    string += tens[thisPart / 10 >= 2 ? thisPart / 10 - 2 : thisPart / 10];
		                    thisPart = thisPart % 10;

		                    putTree = true;
		                }
		                if (thisPart >= 1) {

		                    if (putTree) {

		                        string += "-" + ones[thisPart - 1].substring(1);

		                    } else {
		                        string += ones[thisPart - 1];

		                    }

		                    putTree = false;

		                }

		                string += groups[i];

		                n = n % cutoff;

		            }
		        }
		        string = string.substring(1);

		        return string;
		    }
	
	
	

}
