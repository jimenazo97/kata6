package kata6;

import java.io.IOException;
import java.util.ArrayList;

public class KATA4V2017 {

    public static void main(String[] args) throws IOException {
        String nameFile = "emailsfile.txt";
        ArrayList <String> arrayMail = MailList.readFile(nameFile);
        Histogram<String> histogram = MailHistogramBuilder.build(arrayMail);
        new HistogramDisplay(histogram).execute();

        
    }
    
}
