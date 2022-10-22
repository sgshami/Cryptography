package Caesar;
import java.lang.Object;
/**
 *
 * @author s31011
 */
public class Caesar_Cipher {
    
    public String cipher(String plain, int shift){
        plain = plain.toLowerCase();
        char[] plainArray = plain.toCharArray();
        String msg = "";
        for(int i = 0; i<plain.length(); i++){
            msg += shifter(plainArray[i], shift);
        }
        return msg;
    }
    
    public char shifter(char c, int shift){
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for(int i = 0; i<alphabet.length; i++){
            if(c == alphabet[i]){
                return alphabet[(i+shift)%26];
            }
        }
        return 'a';
    }
    
    public void cracker(String msg){
        msg = msg.toLowerCase();
        char[] msgArray = msg.toCharArray();
        for(int i = 0; i<26; i++){
            String code = "";
            for(int m = 0; m<msg.length(); m++){
                code += shifter(msgArray[m], i);
            }
            System.out.println(code);
            System.out.println("----------");
        }
    }
    
    public static void main (String [] m) {
        Caesar_Cipher t = new Caesar_Cipher();
        System.out.println(t.cipher("Sami", 1));
        System.out.println();
        System.out.println("Code Cracker begins here:");
        System.out.println("--------------------------------------------------");
        t.cracker("Xfrn");
        
        /*String code = t.cipher("Howslife", 3);
        System.out.println(code);
        System.out.println("----------");
        System.out.println();
        t.cracker(code);
*/
    }
}
