import java.util.Scanner;
/**
 * Bioskop04_modifNo5
 */
public class Bioskop04_modifNo5 {

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
        for (int i = 0; i < penonton.length; i++){
            System.out.println("panjang baris ke-" + (i+1) + ": " + penonton[i].length);
        }

        System.out.println(penonton.length);
        System.out.println(penonton[0].length);
        System.out.println(penonton[1].length);
        System.out.println(penonton[2].length);
        System.out.println(penonton[3].length);

    }
}