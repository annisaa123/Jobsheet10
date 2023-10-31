import java.util.Scanner;
/**
 * Bioskop04_modifNo6
 */
public class Bioskop04_modifNo6 {

    public static void main(String[] args) {
        String[][] penonton = new String [4][2];
        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";

        System.out.println(penonton.length);
        for (String[] barisPenonton : penonton){
            System.out.println("Panjang baris: " + barisPenonton.length);
        }


    }
}