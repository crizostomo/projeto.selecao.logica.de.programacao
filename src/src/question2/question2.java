package src.question2;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class question2 {

    public static boolean
    isValidPassword(String password)
    {

        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[!@#$%^&*()+-])"
                + "(?=\\S+$).{6,20}$";

        Pattern p = Pattern.compile(regex);

        if (password == null) {
            return false;
        }

        Matcher m = p.matcher(password);

        return m.matches();
    }

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu password: ");

        String str1 = scanner.next();
        System.out.println("PASSWORD Digitado: "+str1+",\nRESULTADO: "+ isValidPassword(str1)+ "\nSe o resultado deu TRUE, o password é VÁLIDO, se o resultado deu FALSE, favor " +
                "verificar os requerimentos para deixar seu password forte");
    }
}
