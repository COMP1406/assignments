public class TempTester{

	public static void test(String expected, String actual){
		System.out.println("Test------------------------------");
		System.out.println("Expected : " + expected);
		System.out.println("Actual   : " + actual);
	}
	
	public static void main(String[] args){
		
		/* test Temperature.java */
		
		System.out.println("==========Temperature==========");
		Temperature t = new Temperature(10.1);
		test("C", ""+t.getScale());  
		test("10.100000000000023C", ""+t.temp()); 
		
		t.setScale("F");
		test("F", ""+t.getScale()); 
		test("50.18000000000001F", ""+t.temp());
		
		t.setScale("K");
		test("K", ""+t.getScale());
		t.setTemp(0);
		t.setScale("C");
		test("-273.15C", ""+t.temp());
		
		/* test MaxTemp.java */
		System.out.println("==========MaxTemp==========");
		Temperature[] temps = {new Temperature(100,"C"),
													 new Temperature(132.1, "C") };
		MaxTemp mt = new MaxTemp(temps);
		
		double[] result = mt.getMax();
		test("405.25", ""+result[0]);
		test("1.0", ""+ result[1]);
		
		temps = new Temperature[]{
		new Temperature(100.01,"K"),
		new Temperature(100.0101, "K"),new Temperature(99.9999999, "K"), new Temperature(-279.652, "F")		};
		mt = new MaxTemp(temps);
		result = mt.getMax();
		test("100.0101", ""+result[0]);
		test("3.0", ""+ result[1]);
		
		
		
	}


}