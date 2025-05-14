/**
 * Description: This program shows a basic example of how Assymetric Encription System works using crypto library in Java
 * Author: Halmuhammet Muhamedorazov
 * Date: 14.05.2025
 * Summary: You can use AES encription algorithm using crypto library
 *          First, generate a AES secret key
 *          Second, pass the secret key to AES cipher to with encrypt mode
 *          Finally, pass the byte version of plaintext to the cipher (AES) to encrypt
 * Note: If you want to reverse the process and decrypt the encrypted message, 
 *       use DECRYPT_MODE with the same secret key and pass the enrypted bytes to the cipher.
 */

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