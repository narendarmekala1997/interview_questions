package epam;

import java.util.HashMap;
import java.util.Map;

public class Most_Frequent_Letter {

	public static void main(String[] args) {

		String input = " example String with letters";
		char mostFrequent = findMostFrequent(input);
		
		if ( mostFrequent!= '\0' ) {
			System.out.println("The First most Frequent letter is :"+mostFrequent);
		}
		else {
			System.out.println("No letter found in the input");
		}
	}

	private static char findMostFrequent(String input) {

		Map<Character, Integer> frequencyMap = new HashMap<>();
		char mostFrequentChar = '\0';
		int maxFrequency =0;
		
		for( char c : input.toCharArray()) {
			if(Character.isLetter(c)) {
				c = Character.toLowerCase(c);
				frequencyMap.put(c,frequencyMap.getOrDefault(c,0)+1);
				
				if( frequencyMap.get(c)>maxFrequency) {
					maxFrequency = frequencyMap.get(c);
					mostFrequentChar = c;
				}
				else if (frequencyMap.get(c) == maxFrequency && mostFrequentChar=='\0') {
					mostFrequentChar = c;
				}
			}
		}
		return mostFrequentChar;
	}

}
