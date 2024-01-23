package part01;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Formatter;

public class Sim8086 {

    /**
     * Main method reads and decodes .asm 16-bit binary.
     * 
     * Note that this involves converting hexadecimal maching code
     * into its corresponding assembly language representation.
     * We are interpreting the binary machine code (represented here
     * in hex) as CPU instructions, rather than as characters in a text
     * encoding like ASCII or Unicode.
     * 
     * This is known as disassembly.
     * @param args - Specifies at least one file to decode
     */
    public static void main(String[] args) {
        File file = new File(args[0]);
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            // Read bytes from file input stream
            int size = fileInputStream.available(); // Size of file in bytes
            byte[] buffer = new byte[size];

            fileInputStream.read(buffer); // Read file data into the buffer

            // Convert byte data into a hexidecimal string
            StringBuilder hexString = new StringBuilder();
            for (byte b : buffer) {
                hexString.append(String.format("%02x", b));

            }

            StringBuilder asciiString = new StringBuilder();
            for (int i = 0; i < hexString.length(); i += 2) {
                // Extracting two characters (a hex digit pair) and parsing into a byte
                String hexPair = hexString.substring(i, i + 2);
                int decimalValue = Integer.parseInt(hexPair, 16);
                char asciiChar = (char) decimalValue;
                asciiString.append(asciiChar);
            }
                
            System.out.println(hexString.toString() + "\t" + asciiString);

        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}