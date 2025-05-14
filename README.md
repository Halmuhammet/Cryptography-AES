# 🔐 Asymmetric Encryption System (AES Demo in Java)

## 📄 Description
This program shows a basic example of how an **Asymmetric Encryption System** works using the `javax.crypto` library in Java.

## 👨‍💻 Author
**Halmuhammet Muhamedorazov**

## 📅 Date
14.05.2025

## 🧠 Summary
You can use the **AES encryption algorithm** using the Java crypto library:

- First, generate an AES secret key  
- Second, pass the secret key to an AES cipher with **`ENCRYPT_MODE`**  
- Finally, pass the byte version of plaintext to the cipher (AES) to encrypt

## 📝 Note
If you want to reverse the process and **decrypt** the encrypted message:

- Use **`DECRYPT_MODE`** with the same secret key  
- Pass the encrypted bytes to the cipher  
- You'll get the original plaintext back
