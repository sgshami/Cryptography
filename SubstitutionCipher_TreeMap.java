package SubstitutionCipher;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author s31011
 */
public class SubstitutionCipher_TreeMap {
    public static Map<Character, Character> alpha = new TreeMap<>();
    
    public static String encryption(String msg){
        msg = msg.toLowerCase();
        char[] msgArray = msg.toCharArray();
        String code = "";
        for(int i = 0; i<msgArray.length; i++){
            code += alpha.get(msgArray[i]);
        }
        return code;
    }
    
    public static String decryption(String msg){
        Map<Character, Character> beta = new TreeMap<>();
        msg = msg.toLowerCase();
        String code = "";
        for (char letter : alpha.values()) { 
            beta.put(alpha.get(letter), letter);
        }
        System.out.println(beta);
       char[] msgArray = msg.toCharArray();
       for(int i = 0; i<msgArray.length; i++){
            code += beta.get(msgArray[i]);
        }
        return code;
    }
    
    public static void main(String[] args){
        alpha.put('a', 'r'); //value, key
        alpha.put('b', 'y');
        alpha.put('c', 'x');
        alpha.put('d', 'w');
        alpha.put('e', 'v');
        alpha.put('f', 'u');
        alpha.put('g', 'k');
        alpha.put('h', 's');
        alpha.put('i', 'z');
        alpha.put('j', 'q');
        alpha.put('k', 'p');
        alpha.put('l', 'o');
        alpha.put('m', 'n');
        alpha.put('n', 'h');
        alpha.put('o', 'l');
        alpha.put('p', 't');
        alpha.put('q', 'j');
        alpha.put('r', 'a');
        alpha.put('s', 'm');
        alpha.put('t', 'g');
        alpha.put('u', 'e');
        alpha.put('v', 'f');
        alpha.put('w', 'd');
        alpha.put('x', 'c');
        alpha.put('y', 'b');
        alpha.put('z', 'i');
        System.out.println(alpha);
        System.out.println(encryption("Sami"));
        System.out.println(decryption("nima"));
    }
}
