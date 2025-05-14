```markdown
# 🔐 Asymmetric Encryption System (AES Demo in Java)

## 📄 Description
This program demonstrates a basic example of how an **Asymmetric Encryption System** works using the `javax.crypto` library in Java. Specifically, it shows how to encrypt and decrypt messages using the **AES** algorithm.

---

## 👨‍💻 Author
**Halmuhammet Muhamedorazov**  
📅 **Date:** 14.05.2025

---

## 🧠 Summary

This program follows the basic steps of AES encryption:

1. **Generate AES Secret Key**  
   Use Java's `KeyGenerator` to create a 128-bit AES key.

2. **Encrypt the Message**  
   - Initialize a cipher in `ENCRYPT_MODE`
   - Pass the secret key to the cipher
   - Provide a plain text string (converted to bytes)
   - Get the encrypted byte array

3. **Decrypt the Message**  
   - Initialize a cipher in `DECRYPT_MODE`  
   - Use the same secret key  
   - Pass the encrypted byte array  
   - Retrieve the original plaintext message

---

## 📌 Note
If you want to **reverse the process** and **decrypt** the encrypted message:
- Switch the cipher to `DECRYPT_MODE`
- Use the **same AES secret key**
- Pass the encrypted bytes back into the cipher
- You’ll get the original text as output

---

## 🛠️ Requirements
- Java 8 or higher
- `javax.crypto` library (comes with standard Java SDK)

---

## ✅ Example Output

```
Original Text: hello world
Encrypted Text: 5f3e... (byte array)
Decrypted Text: hello world
```

---

This is a basic but solid starting point for understanding symmetric encryption (AES) in Java. Great for learning and experimenting with crypto!
```
