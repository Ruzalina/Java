import java.util.Scanner;

public class stringE {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        System.out.println("Inter a word");
      String str = s.next();
            if(str.length()>=1 && str.length()<=6 && str.contains("e")){
                System.out.println(str+" - "+true);
            }else{
                System.out.println(str+" - "+false);
            }
        }
    }

