/**
 * 
 */

/**
 * @author Poornima
 **
 */
public class TypeCastingDemo {
static int a=10;
static long b=a;
static float c=b;
static double d=127.17;
static long e=(long)d;
static int f=(int)e;
	
	public static void main(String[] args) {
		System.out.println("---Implicit type casting---");
		System.out.println("Value of A which is int  is "+a);
		System.out.println("A is type casted to long "+b);
		System.out.println("A is type casted to float "+c);
		System.out.println("Value of D which is double is "+d);
		System.out.println("D is typecasted to long "+e);
		System.out.println("E which is long typecatsed to int "+f);
		
		System.out.println("---Explicit typecasting---");
		System.out.println("F which is int is converted to float "+(float)e);
		System.out.println("d which is double is converted to long "+(long)d);
		
	}

}
