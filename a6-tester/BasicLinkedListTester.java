/* this is a BASIC tester for your code              */
/* do NOT assume that your code is perfect if you    */
/* pass these tests.                                 */

import java.util.Arrays;

public class BasicLinkedListTester{

	public static String[] words = { "A", "B", "C", "D", "E", "F", "G",
		"H", "I", "J", "K", "L", "M"};
		// "N", "O", "P", "Q", "R", "S", "T", "U",  "V", "W", "X", "Y", "Z"};

	public static void main(String[] args){
		int start = 0, end = words.length;
		
		/* use command line arguments to test */
		if( args.length == 2){
			start = Integer.parseInt(args[0]);
			end = Integer.parseInt(args[1]);
		}
		
		if( 0 <= start && start <= end && end <= words.length){
			
			ALinkedList list, expectedAfterList, expectedReturnedList, returnedList;
			
			list = new LinkedList();
			for(String s : words){
				list.add(s);
			}
			System.out.println("before : " + list);
			
			
			expectedAfterList = new LinkedList();
			for(int i=0; i<start; i++){
				expectedAfterList.add( words[i] );
			}
			for(int i=end; i<words.length; i++){
				expectedAfterList.add( words[i] );
			}

			
			expectedReturnedList = new LinkedList();
			for(int i=start; i<end; i++){
				expectedReturnedList.add( words[i] );
			}
							
			returnedList = list.extract(start, end);
			
			System.out.println("         after : " + list);
			System.out.println("expected after : " + expectedAfterList);
			System.out.println("         returned : " + returnedList);
			System.out.println("expected returned : " + expectedReturnedList);
			
			
		}else{
			System.out.println("you must enter values so that 0 <= start <= end <= " + words.length);
		}
	}

}