public class Controller {
    private Encryptor encryptor;
    private Decryptor decryptor;

    public Controller() {
        encryptor = new Encryptor();
        decryptor = new Decryptor();
    }

    public void decrypt(String encrypted) {
        decryptor.decrypt(encrypted);
    }

    public String encrypt(String plainText, int offset) {
        return encryptor.encrypt(plainText, offset);
    }
}
