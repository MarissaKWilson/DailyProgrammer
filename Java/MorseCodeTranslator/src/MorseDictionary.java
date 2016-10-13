import java.util.HashMap;

public class MorseDictionary{
	HashMap<Object, String> dict = new HashMap<Object,String>();
	
	public HashMap MorseDictionary(){
		//From english to morse
		dict.put('A',".-");
		dict.put('B',"-...");
		dict.put('C',"-.-.");
		dict.put('D',"-..");
		dict.put('E',".");
		dict.put('F',"..-.");
		dict.put('G',"--.");
		dict.put('H',"....");
		dict.put('I',"..");
		dict.put('J',".---");
		dict.put('K',"-.-");
		dict.put('L',".-..");
		dict.put('M',"--");
		dict.put('N',"-.");
		dict.put('O',"---");
		dict.put('P',".--.");
		dict.put('Q',"--.-");
		dict.put('R',".-.");
		dict.put('S',"...");
		dict.put('T',"-");
		dict.put('U',"..-");
		dict.put('V',"...-");
		dict.put('W',".--");
		dict.put('X',"-..-");
		dict.put('Y',"-.--");
		dict.put('Z',"--..");
		dict.put('1',".----");
		dict.put('2',"..---");
		dict.put('3',"...--");
		dict.put('4',"....-");
		dict.put('5',".....");
		dict.put('6',"-....");
		dict.put('7',"--...");
		dict.put('8',"---..");
		dict.put('9',"----.");
		dict.put('0',"-----");
		dict.put(',',"--..--");
		dict.put('.',".-.-.-");
		dict.put('?',"..--..");
		dict.put('/',"-..-.");
		dict.put('-',"-....-");
		
		//From morse to english
		dict.put(".-","A");
		dict.put("-...","B");
		dict.put("-.-.","C");
		dict.put("-..","D");
		dict.put(".","E");
		dict.put("..-.","F");
		dict.put("--.","G");
		dict.put("....","H");
		dict.put("..","I");
		dict.put(".---","J");
		dict.put("-.-","K");
		dict.put(".-..","L");
		dict.put("--","M");
		dict.put("-.","N");
		dict.put("---","O");
		dict.put(".--.","P");
		dict.put("--.-","Q");
		dict.put(".-.","R");
		dict.put("...","S");
		dict.put("-","T");
		dict.put("..-","U");
		dict.put("...-","V");
		dict.put(".--","W");
		dict.put("-..-","X");
		dict.put("-.--","Y");
		dict.put("--..","Z");
		dict.put(".----","1");
		dict.put("..---","2");
		dict.put("...--","3");
		dict.put("....-","4");
		dict.put(".....","5");
		dict.put("-....","6");
		dict.put("--...","7");
		dict.put("---..","8");
		dict.put("----.","9");
		dict.put("-----","0");
		dict.put("--..--",",");
		dict.put(".-.-.-",".");
		dict.put("..--..","?");
		dict.put("-..-.","/");
		dict.put("-....-","-");
		return dict;
	}
	public String get(Object key) {
		String tmp = dict.get(key);
		return tmp;
	}
	
}