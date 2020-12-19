import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ItMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner key = new Scanner(System.in);
        
        String ulang = "n";
        do{
            ulang = JOptionPane.showInputDialog("Apakah anda ingin melakukan pembelian lagi? (y/n)");
        }while(!("n").equals(ulang));
    }
    
}
