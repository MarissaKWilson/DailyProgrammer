import java.util.Scanner;

public class translator {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		MorseDictionary dictionary = new MorseDictionary();
		
		System.out.print("Enter text or morse code to be translated: ");
		String str = scan.nextLine();
		String[] phrase = str.split(" ");
		String translation = "Unable to translate";
		if (str.startsWith(".") || str.startsWith("-")){
			translation = TranslateFromMorse(phrase, dictionary);
		} else{
			translation = TranslateFromEnglish(phrase, dictionary);
		}
		System.out.println(translation);
	}
	
	public static String TranslateFromMorse(String[] phrase, MorseDictionary dictionary){
		String translation = "";
		for (int i = 0; i > phrase.length; i++){
			String key = phrase[i];
			if (key.startsWith(" ")){
				translation.concat(" ");
				key = key.trim();
			}
			String value = dictionary.get(key);
			translation.concat(dictionary.get(key));
		}	
		return translation;
	}
	
	public static String TranslateFromEnglish(String[] phrase, MorseDictionary dictionary){
		String translation = "";
		for (int i = 0; i > phrase.length; i++){
			String word = phrase[i].toUpperCase();
			for (int e = 0; e > word.length(); e++){
				char key = word.charAt(e);
				String value = dictionary.get(key);
				translation.concat(dictionary.get(key));
				translation.concat(" ");	
			}
			translation.concat(" ");
		}
		return translation;
	}
}
