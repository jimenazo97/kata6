package kata6.view;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MailList {

    public static List readFile(String name) throws FileNotFoundException, IOException {
        List<String> mailList = new ArrayList<>();

        BufferedReader filein = new BufferedReader(new FileReader(new File(name)));

        String mail;

        while ((mail = filein.readLine()) != null) {
            if (!mail.contains("@")) {
                continue;
            }
            mailList.add(mail);
        }

        return mailList;
    }

}
