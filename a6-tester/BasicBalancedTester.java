/* this is a BASIC tester for your code              */
/* do NOT assume that your code is perfect if you    */
/* pass these tests.                                 */

public class BasicBalancedTester{

	public static String[] balP = {
		"()", "()()", "cat", "c(at)", "(hello)(kitty)",
		"if( ((x-y) < 4) || (x > 12))",
		"()(((s)))()()()()(x()((y))(x))()(ccccc(w))ssss()"};

	public static String[] unbalP = { "(",	")", ")(a)", ")a(", "()()((())()" };

	public static String[] bal = { "", 
		"a", "[]", "{}", "[()]", "[]{}({[{}]})",
		"for(int i=0; i<12; i+=1){x[i]+=f(1);}" };	

	public static String[] unbal = {
		"(]", "{)", "[}", "[}", "(]", "({)}h", "[(]())",
		"for(int i=0; i<12; i+=1){" };



	public static void main(String[] args){
		for(String s : balP ){
			if( !Balanced.isBalanced(s) ){
				System.out.println( "failed to detect \"" + s + "\" as balanced");
			}
		}
		for(String s : unbalP ){
			if( Balanced.isBalanced(s) ){
				System.out.println( "failed to detect \"" + s + "\" as unbalanced");
			}
		}
		for(String s : bal ){
			if( !Balanced.isBalanced(s) ){
				System.out.println( "failed to detect \"" + s + "\" as balanced");
			}
		}
		for(String s : unbal ){
			if( Balanced.isBalanced(s) ){
				System.out.println( "failed to detect \"" + s + "\" as unbalanced");
			}
		}
		
		System.out.println("done testing");
		
	}

}