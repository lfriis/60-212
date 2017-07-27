/* LARSEN FRIIS
 * ID: 104127870
 * DATE: 2016/09/20
 * PURPOSE: Use a StringTokenizer and command line arguments to solve the tester
 */
public class Ass4 {

	public class MyStringTokenizer { 
	
		private String tokens[]; 
		private int numberTokensRemaining; 
		private String processMetaCharacter(String suppliedDelimiterString){
			String newDelimiterString = "";
			String metaCharacters = "+*.?";
			char currentCharacter; 
			for (int i = 0; i < suppliedDelimiterString.length(); i++){
				currentCharacter = suppliedDelimiterString.charAt(i);
				if (metaCharacters.indexOf(currentCharacter) >= 0){
					newDelimiterString += "\\" + currentCharacter;
				} else {
					newDelimiterString += currentCharacter;
				}
			}
			return newDelimiterString;
		}
		public MyStringTokenizer(String inputString, String suppliedDelimiterString){
			
			String newDelimiterString;
			newDelimiterString = processMetaCharacter(suppliedDelimiterString);
			String regularExpression = "[" + newDelimiterString + "]+"; 
			tokens = inputString.split(regularExpression); 
			if (tokens[0].equals("")){ 
				numberTokensRemaining = tokens.length - 1; } 
			else { 
				numberTokensRemaining = tokens.length; 
			} 
		} 
		public int countTokens(){ 
			return numberTokensRemaining; 
		} 
		public String nextToken(){ 
			String tokenToBeReturned; 
			if (numberTokensRemaining == 0) { 
				return ""; 
			} else { 
				tokenToBeReturned = tokens[tokens.length - numberTokensRemaining]; 
				numberTokensRemaining--; 
				return tokenToBeReturned; 
			} 
		} 
	}
}
