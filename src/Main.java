import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    ArrayList<String> inventario = new ArrayList<>();

    inventario.add("Viajar");
    inventario.add("Explorar");
    inventario.add("Cantar");

    for(int indice = 0; indice < inventario.size(); indice++){
        System.out.println(inventario.get(indice));
    }

    inventario.set(1, "nuevoValor");

        System.out.println(inventario.size());

        for(int indice = inventario.size() -1; indice >= 0; indice--){
            System.out.println(inventario.get(indice));
        }
    }
}