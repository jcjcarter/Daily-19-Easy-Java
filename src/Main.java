import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args){
        long l = 0;
        String line = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader("gutenberg.txt"));

            while ((line = reader.readLine()) != null){
                for (int i = 0; i < line.length(); i++) {
                    if (Character.isAlphabetic(line.charAt(i)) || Character.isDigit(line.charAt(i)) )
                        l++;
                }
            }

        }catch (Exception e){

        }

        System.out.println("Counted alphanumeric characters: " + l);
    }

}
