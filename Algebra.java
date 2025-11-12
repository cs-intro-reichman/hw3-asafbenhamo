// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operations
	    System.out.println(plus(2,3));   // 2 + 3
	    System.out.println(minus(7,2));  // 7 - 2
   		System.out.println(minus(2,7));  // 2 - 7
 		System.out.println(times(3,4));  // 3 * 4
   		System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
   		System.out.println(pow(5,3));      // 5^3
   		System.out.println(pow(3,5));      // 3^5
   		System.out.println(div(12,3));   // 12 / 3    
   		System.out.println(div(5,5));    // 5 / 5  
   		System.out.println(div(25,7));   // 25 / 7
   		System.out.println(mod(25,7));   // 25 % 7
   		System.out.println(mod(120,6));  // 120 % 6    
   		System.out.println(sqrt(36));
		System.out.println(sqrt(263169));
   		System.out.println(sqrt(76123));
	}  

	// Returns x1 + x2
	public static int plus(int x1, int x2) {
		// Replace the following statement with your code
		if (x2>0){
		for (int i = 0 ; i<x2 ; i++){
			x1++;
		}
	}
	else {
        for (int i = 0; i > x2; i--) {
            x1--;
	}
}
	
		return x1;

	}

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		// Replace the following statement with your code
		if (x2 >0) {
		for (int i = 0 ; i<x2 ; i++){
			x1--;
		}
	}
	else{
		for (int i = 0; i > x2; i--) {
            x1++;
	}
}
		return x1;

	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
		// Replace the following statement with your code
		int t= x1;
        if ((x2 == 0) || (x1 == 0)) return  0;
		if ((x2 > 0) || (x1 > 0)){
		for (int i = 1 ; i<x2 ; i++){
		x1 = plus(x1, t);
			}
		}
		else if ((x2 < 0) && (x1 > 0)){
		for (int i = 0 ; i>x2 ; i--){
		x1 = minus(x1, t);
			}

		}
		else if ((x2 > 0) && (x1 < 0)){
		for (int i = 1 ; i<x2 ; i++){
		x1 = plus(x1, t);
			}

		}
		else if ((x2 < 0) && (x1 < 0)){
			x1 = minus(0, x1);
		    x2 = minus(x2, x2);
		for (int i = 1 ; i<x2 ; i++){
		x1 = plus(x1, t);
			}

		}

		
		return x1;
		
	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		// Replace the following statement with your code
		int o = x;
		if (n == 0) return 1;
		if ( x ==0) return 0;
		for (int p = 1 ; p < n; p++){
			x = times(x, o);
			}
		return x;
	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
		// Replace the following statement with your code
		if (x2 == 0) return 0;
		int count = 0;
		int t = x2;
		if ((x2>0)&&(x1>0)) {
		while (x2<=x1) {
			x2= plus(x2, t);
			count++;
		}
	}
		if ((x2<0)&&(x1>0)) {
		x2 = minus(x2, x2);
		while (x2<=x1) {
			x2= plus(x2, t);
			count++;
		}
		count = minus(0, count);
	}
	if ((x2>0)&&(x1<0)) {
		x1 = minus(0, x1);
		while (x2<=x1) {
			x2= plus(x2, t);
			count++;
		}
		count = minus(0, count);
	}
	if ((x2<0)&&(x1<0)) {
		x1 = minus(0, x1);
		x2 = minus(x2, x2);
		while (x2<=x1) {
			x2= plus(x2, t);
			count++;
		}
	}
		return count;
	}

	// Returns x1 % x2
	public static int mod(int x1, int x2) {
		// Replace the following statement with your code
		int y= div(x1, x2);
		y = times(y, x2);
		int l = minus(x1, y);
		return l;
	}	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {
		// Replace the following statement with your code
		//int epsilon = 1; 
        //int g = x; 
		//int y = times(g, x);
        //while (minus(y, x) > epsilon) {
       //  g = mod(minus(g ,minus(times(g, g), x)), times(2, g) )
	   int p=1;
	   while (pow(p, 2)<=x) {
		p++;
	   }
	   p--;
	   return p;
	}
}