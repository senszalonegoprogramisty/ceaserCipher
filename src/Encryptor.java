

public class Encryptor {

    public String encrypt(String plainText, int offset) {

        String encrypted = "";

        if (offset > 26)
            offset %= 26;
        else if (offset < 0)
            offset = (offset%26) + 26;

        for (int i = 0; i < plainText.length(); i++) {
            char ch = plainText.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch)) {
                    char c = (char) (ch+offset); //'Z' 93
                    if (c > 'Z') {
                        encrypted += (char) (ch - (26 - offset));
                    }
                    else
                        encrypted += c;
                }
                else if (Character.isLowerCase(ch)) {
                    char c = (char) (ch+offset);
                    if (c > 'z') {
                        encrypted += (char) (ch - (26 -offset));
                    } else {
                        encrypted += c;
                    }
                }
            } else {
                encrypted += ch;
            }
        }
        return encrypted;
    }
}

