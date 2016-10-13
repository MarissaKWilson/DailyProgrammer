import java.util.Scanner;

public class translator {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		MorseDictionary dictionary = new MorseDictionary();
		
		System.out.print("Enter text or morse code to be translated: ");
		String str = scan.nextLine();
		String translation = "Unable to translate";
		if (str.startsWith(".") || str.startsWith("-")){
			translation = TranslateFromMorse(str, dictionary);
		} else{
			translation = TranslateFromEnglish(str, dictionary);
		}
		System.out.println(translation);
	}
	
	public static String TranslateFromMorse(String str, MorseDictionary dictionary){
		String[] phrase = str.split("\\s");
		String translation = "";
		for (int i = 0; i < phrase.length; i++){
			String key = phrase[i];
			if (key.startsWith(" ")){
				translation.concat(" ");
				key = key.trim();
			}
			translation.concat(dictionary.get(key));
		}	
		return translation;
	}
	
	public static String TranslateFromEnglish(String str, MorseDictionary dictionary){
		str = str.toUpperCase();
		char[] letter = str.toCharArray();
		String translation = "";
		for (int i = 0; i < letter.length; i++){
			
			char key = letter[i];
			if (key == ' '){
				translation.concat(" ");
			} else {
				translation.concat(dictionary.get(key));
			}
			translation.concat(" ");
		}
		return translation;
	}
}
