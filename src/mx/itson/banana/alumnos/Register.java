package mx.itson.banana.alumnos;

/**
 * Contiene métodos para ordenar cadenas de texto
 * @author yols
 */
public class Register {

    /**
     * Separa una cadena de texto si se encuentra una coma
     * @param ordenar Lista de alumnos que será ordenada por fracciones
     * @return Array de String en cuyo cada componente será una fracción de la cadena otorgada
     */
    public String[] order(String ordenar) {
        String[] students = ordenar.split(",");
        return students;
    }

    /**
     * Muestra la posición a elegir una cadena de texto si se encuentra vacía " "
     * @param register Se mostrara la posición a elegir 
     * @return Array de string será una fracción de la cadena otorgada
     */
    
    public String[] list(String register) {
        String[] lista = register.split(" ");
        return lista;
    }
}
