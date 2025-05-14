import javax.crypto.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // get a text that needs to be encrypted
        String plaintext = "Plaintext Before Encryption: Hello, this is a very sensitive information.";

        // Generate a secret key
        SecretKey cryptoKey = KeyGenerator.getInstance("AES").generateKey();
        // get the enryption algorithm instance (we use Assymmetric Encription System)
        Cipher cipher = Cipher.getInstance("AES");
       
        // Initialize the Cipher with encryption mode and secret key
        cipher.init(Cipher.ENCRYPT_MODE, cryptoKey);

        // Get the byte version of plaintext and pass it to the cipher to encrypt it
        byte[] encryptedBytes = cipher.doFinal(plaintext.getBytes());

        // See the encrypted message (it changes each time we run the program).
        String encryptedText = new String(encryptedBytes);
        System.out.println("Ciphertext After Encryption: " + encryptedText);

        // Now, decrypt the message
        cipher.init(Cipher.DECRYPT_MODE, cryptoKey);
        // Get the decrypted bytes
        byte[] decryptedBytes = cipher.doFinal(encryptedBytes);

        String originalText = new String(decryptedBytes);

        System.out.println("Plaintext After Decryption: " + originalText);


    }
}