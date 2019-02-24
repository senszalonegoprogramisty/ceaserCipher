public class Decryptor {

    private String decrypt(String encryptedText, int offset) {

        if (offset > 26) {
            offset %= 26;
        } else if (offset < 0) {
            offset = (offset%26) + 26;
        }

        String decrypted = "";

        for (int i = 0; i < encryptedText.length(); i++) {
            char ch = encryptedText.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch)) {
                    char c = (char)(ch-offset);
                    if (c < 'A') {
                        decrypted += (char)(ch + (26 - offset));
                    } else {
                        decrypted += c;
                    }
                } else if (Character.isLowerCase(ch)) {
                    char c = (char) (ch-offset);
                    if (c < 'a') {
                        decrypted += (char)(ch + (26 - offset));
                    } else {
                        decrypted += c;
                    }
                }
            } else {
                decrypted += ch;
            }
        }
        return decrypted;
    }

    public void decrypt(String str) {

        for (int i = 0; i < 26; i++) {
            String decrypted = decrypt(str, i);
            System.out.println("offset "+i+" text -> "+decrypted);
        }
    }
}
