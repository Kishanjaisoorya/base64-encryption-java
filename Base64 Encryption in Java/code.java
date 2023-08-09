import java.util.Base64;

public class Base64EncryptionExample {
    public static void main(String[] args) {
        String originalText = "Hello, Base64 Encryption!";
        
        // Encoding (Encryption)
        byte[] encodedBytes = Base64.getEncoder().encode(originalText.getBytes());
        String encodedText = new String(encodedBytes);
        System.out.println("Encoded Text: " + encodedText);
        
        // Decoding (Decryption)
        byte[] decodedBytes = Base64.getDecoder().decode(encodedBytes);
        String decodedText = new String(decodedBytes);
        System.out.println("Decoded Text: " + decodedText);
    }
}
