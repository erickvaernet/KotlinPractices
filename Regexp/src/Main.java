import java.sql.SQLOutput;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        /*
        //1st way
        Pattern p = Pattern.compile(".s");//. represents single character
        Matcher m = p.matcher("as");
        boolean b = m.matches();

        //2nd way
        boolean b2=Pattern.compile(".s").matcher("as").matches();

        //3rd way
        boolean b3 = Pattern.matches(".s", "as");
        */

        boolean p = Pattern.matches(
                "^[A-Za-z0-9ñÑáéíóúÁÉÍÓÚ()\\[\\].,\\s\\\\/]+$"
                , "[asdas]\\\\/ asd ad");

        System.out.println("p = " + p);
    }
}