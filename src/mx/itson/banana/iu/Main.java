package mx.itson.banana.iu;

import java.util.Scanner;
import mx.itson.banana.alumnos.Register;

/**
 *
 * @author yols
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Write the name of students ");
        String students = sc.nextLine();
        
        String[] result = new Register().order(students);
        for( String a: result){
            String[] orderStudent = new Register().list(a);
            System.out.println("-Id: " +orderStudent[0]+ " -Name: "+orderStudent[1]+" -Lastname: "+orderStudent[3]);
        
        }

    }

}
