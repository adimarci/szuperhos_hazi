import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Kepregeny {


    private static ArrayList<Szuperhos> szuperhosLista = new ArrayList<>();

    public static void szereplok(String eleresiut) throws Exception {
        File file = new File(eleresiut);
        Scanner sc = new Scanner(file);

        String sor = sc.nextLine();
        while (sc.hasNextLine()) {
            String[] split = sor.split(",");
            if (split[0] == "Batman") {
                Batman Batman1 = new Batman();
                for (int i = 0; i < Integer.parseInt(split[1]); i++) {
                    Batman1.kutyutKeszit();
                }
                szuperhosLista.add(Batman1);
            } else if (split[0] == "Vasember") {
                Vasember Vasember1 = new Vasember();
                for (int i = 0; i < Integer.parseInt(split[1]); i++) {
                    Vasember1.kutyutKeszit();
                }
                szuperhosLista.add(Vasember1);

            }
        }
        return;
    }

    public static void szuperhosok() {

        for (var a : szuperhosLista) {
            System.out.println(a);
        }
        return;
    }

    public static void main(String[] args) throws Exception {

        try {
            szereplok("szuperhosok.txt");
            szuperhosok();
        } catch (IOException e) {
            e.getCause();

        }
    }
}
