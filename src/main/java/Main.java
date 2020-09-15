/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    }        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        name.toLowerCase();
        if(name == "alice"){
            System.out.println("Welcome Alice");
            break;
        }else if(name == "bob"){
            System.out.println("Welcome Bob");
            break;
        }
    }
}
