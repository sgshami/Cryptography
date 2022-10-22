package VigenereCipher;

/**
 *
 * @author s31011
 */
public class Vigenere_Cipher {
    
    public String encryption(String msg, String key){
        msg = msg.toLowerCase();
        key = key.toLowerCase();
        char[] msgArray = msg.toCharArray();
        int [] keyArray = keyArray(key);
        String code = "";
        int pass = 0;
        for(int i = 0; i<msgArray.length; i++){
            if(keyArray.length == pass){
                pass = 0;
            }
            code += shifter(msgArray[i], keyArray[pass]);
            pass++;
        }        
        return code;
    }
    
    public int[] keyArray(String key){
        char[] alphabet = {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] keyChar = key.toCharArray();
        int [] keyArray = new int[key.length()];
        for(int i = 0; i<keyChar.length; i++){
            for(int j = 0; j<alphabet.length; j++){
                if(alphabet[j] == keyChar[i]){
                    keyArray[i] = j;
                }
            }
        }
        return keyArray;
    }
    
    public char shifter(char c, int shift){
        char[] alphabet = {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for(int i = 0; i<alphabet.length; i++){
            if(c == alphabet[i]){
                return alphabet[(i+shift)%26];
            }
        }
        return 'a';
    }
    
    public static void main (String [] m) {
        Vigenere_Cipher v = new Vigenere_Cipher();
        int [] j = v.keyArray("key");
        for(int x: j){
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println(v.encryption("Sami", "key"));
    }
}
