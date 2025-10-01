public class Encript {
    private static final int[] CHIAVE = {3, 1, 4, 2};

    public static String encrypt(String testo){
        StringBuilder risultato = new StringBuilder();
        int keylen = CHIAVE.length;
        int keyindex = 0;

        for (int i = 0; i < testo.length(); i++) {
            char c = testo.charAt(i);
            if(c>= 'A' && c<= 'Z'){
                int shift = (c- 'A' + CHIAVE[keyindex % keylen]) % 26;
                risultato.append((char)('A' + shift));
                keyindex++;
            }else{
                risultato.append(c);

            }

        }
        return risultato.toString();
    }
    public static String Decrypt(String testo){

        StringBuilder risultato = new StringBuilder();
        int keylen = CHIAVE.length;
        int keyindex = 0;

        for (int i = 0; i < testo.length(); i++) {
            char c = testo.charAt(i);
            if(c >= 'A' && c<= 'Z'){
                int shift = (c- 'A' - CHIAVE[keyindex % keylen]) % 26;
                if(shift < 0) shift += 26;
                risultato.append((char)('A' + shift));
                keyindex++;
            }else{
                risultato.append(c);
            }
        }
        return risultato.toString();
    }
}
