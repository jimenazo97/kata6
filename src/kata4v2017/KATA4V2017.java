package kata4v2017;

import java.io.IOException;
import java.util.ArrayList;

public class KATA4V2017 {

    public static void main(String[] args) throws IOException {
        System.out.println("Inicio");
        String nameFile = "/Users/ejrbalma/Google Drive/Curso 2017 2018/ISII/KATA/Data/emailsfile.txt";
        ArrayList <String> arrayMail = MailList.readFile(nameFile);
        Histogram<String> histogram = MailHistogramBuilder.build(arrayMail);
        new HistogramDisplay(histogram).execute();

        System.out.println("Fin");
        
    }
    
}
