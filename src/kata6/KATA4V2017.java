package kata6;

import kata6.view.MailList;
import kata6.view.HistogramDisplay;
import kata6.model.Histogram;
import java.io.IOException;
import java.util.List;
import kata6.model.Mail;
import kata6.view.Attribute;
import kata6.view.HistogramBuilder;

public class KATA4V2017 {

    public static void main(String[] args) throws IOException {
        String nameFile = "emailsfile.txt";
        List <String> arrayMail = MailList.readFile(nameFile);
        System.out.println(arrayMail.size());
        
        HistogramBuilder<Mail> builder = new HistogramBuilder<>(arrayMail);
        
        
        Histogram<String> domains =builder.build(new Attribute<Mail, String>() {
            @Override
            public String get(Mail item) {
                return item.getMail().split("@")[1];
            }
        });
        
        new HistogramDisplay(domains,"Dominios").execute();
        
        Histogram<Character> letters=builder.build(new Attribute<Mail, Character>() {
            @Override
            public Character get(Mail item) {
                return item.getMail().charAt(0);
            }
        });
        
        new HistogramDisplay(letters,"Primer Caracter").execute();
                
        
    }
    
}
