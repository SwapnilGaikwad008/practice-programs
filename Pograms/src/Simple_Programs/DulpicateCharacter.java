package Simple_Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DulpicateCharacter {

	public void countDupChars(String str){
	
		//create a HashMap
		Map<Character , Integer> map = new HashMap<Character , Integer>();
		
		  //Convert the String to char array
	    char[] chars = str.toCharArray();
	
	    /* logic: char are inserted as keys and their count
	     * as values. If map contains the char already then
	     * increase the value by 1
	     */
	    for(Character ch:chars){
	    	if(map.containsKey(ch)){
	    		map.put(ch, map.get(ch)+1);
	    	}else{
	    		map.put(ch, 1);
	    	}
	    }
	    
	  //Obtaining set of keys
	    Set<Character> keys = map.keySet();
	 
	    /* Display count of chars if it is
	     * greater than 1. All duplicate chars would be 
	     * having value greater than 1.
	     */
	    for(Character ch:keys){
	    	if(map.get(ch)>1){
	    		System.out.println("Char "+ch+" "+map.get(ch));
	    	}
	    }
	}
	public static void main(String a[]){
	    DulpicateCharacter obj = new DulpicateCharacter();
	    System.out.println("String:SwapnilGaikwad");
	    System.out.println("-------------------------");
	    obj.countDupChars("SwapnilGaikwad");
	}
}
