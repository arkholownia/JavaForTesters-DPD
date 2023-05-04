package g_regex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/main/resources/textfiles/materialy.txt");
        List<String> read = Files.readAllLines(path);

//        Pattern pattern = Pattern.compile("\\d\\p{all}*\\.");
//        for (String line : read){
//            Matcher m = pattern.matcher(line);
//            if (m.find()){
//                System.out.println(m.group());
//            }
//        }

//        Pattern patternCountry = Pattern.compile("w\s[A-Z]+[a-z]*");
//        for (String line : read){
//            Matcher m = patternCountry.matcher(line);
//            if (m.find()){
//                System.out.println(m.group());
//            }
//        }
//        System.out.println(read);

        Pattern itemPattern = Pattern.compile("\\p{all}*\\sw\\s");
        for (String line : read){
            Matcher m = itemPattern.matcher(line);
            if (m.find()){
                String result = m.group();
                String res = result.replace(" w ", "");
                System.out.println(res);
            }
        }
        System.out.println(read);
    }
}
