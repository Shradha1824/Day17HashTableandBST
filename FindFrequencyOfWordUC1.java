package hashtable;

import java.util.HashMap;

public class FindFrequencyOfWordUC1 {
		
	public static void main(String[] args) {
		
		String string ="To be or not to be";
		char[] array = string.toCharArray();
		HashMap<Character, Integer> hashMap = new HashMap<>();
		
		for(int i = 0; i < array.length; i++) {
			if(hashMap.containsKey(array[i])) {
				int count = hashMap.get(array[i]);
				hashMap.put(array[i], count+1);
			}
			else {
				hashMap.put(array[i], 1);
			}
		}
		System.out.println(hashMap);
	}
}
