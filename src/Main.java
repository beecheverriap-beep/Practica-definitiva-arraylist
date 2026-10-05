import java.util.ArrayList;

public class Main {
    static ArrayList<String> inventario = new ArrayList<>();
    public static void main(String[] args) {

          agregarObjeto("Viajar");
          agregarObjeto("Explorar");
          agregarObjeto("Cantar");
          agregarObjeto("Cantar");

        System.out.println("Inventario:");
        mostrarInventario();

        System.out.println("Retiro Objeto");
        retirarObjeto("Viajar");

        System.out.println("Inventario Actualizado");
        mostrarInventario();

        if(inventario.contains("Benjamin")){
            System.out.println("Usuario no existente");
        } else {
            System.out.println("Usuario existente");
        }

    }





        public static void agregarObjeto(String objeto) {
            inventario.add(objeto);
        }
        public static void mostrarInventario() {
        for (int i = 0; i < inventario.size(); i++) {
            System.out.println(inventario.get(i));
        }
        }
        public static void retirarObjeto(String objeto) {
            inventario.remove(objeto);
        }
}