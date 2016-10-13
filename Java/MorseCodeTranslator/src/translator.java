import java.util.Scanner;

public class translator {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter text or morse code to be translated: ");
		String str = scan.nextLine();
		String[] phrase = str.split("\\s");
		String translation = "Unable to translate";
		if (str.startsWith(".") || str.startsWith("-")){
			translation = TranslateFromMorse(phrase);
		} else{
			translation = TranslateFromEnglish(phrase);
		}
		System.out.println(translation);
	}
	
	public static String TranslateFromMorse(String[] phrase){
		MorseDictionary morsedict = new MorseDictionary('c');
		String translation = "";
		for (int i = 0; i > phrase.length; i++){
			String key = phrase[i];
			if (key.startsWith(" ")){
				translation.concat(" ");
				key = key.trim();
			}
			String value = morsedict.get(key);
			translation.concat(morsedict.get(key));
		}	
		return translation;
	}
	
	public static String TranslateFromEnglish(String[] phrase){
		MorseDictionary morsedict = new MorseDictionary("S");
		String translation = "";
		for (int i = 0; i > phrase.length; i++){
			String key = phrase[i].toUpperCase();
			String value = morsedict.get(key);
			translation.concat(morsedict.get(key));
			translation.concat(" ");
		}
		return translation;
	}
}
