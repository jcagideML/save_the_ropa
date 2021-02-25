import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {

    Map<Integer, List<Prenda>> map;
    int contador;

    public GuardaRopa() {
        this.map = new HashMap<>();
        contador = 0;
    }

    public Integer guardarPrendas(List<Prenda> listaDePrendas) {
        this.map.put(contador, listaDePrendas);
        contador++;
        return contador - 1;
    }


    public void mostrarPrendas() {

        for (Map.Entry<Integer, List<Prenda>> e : map.entrySet()) {
            System.out.print("Codigo: " + e.getKey() + "\nPrendas: ");
            for (Prenda p : e.getValue()) {
                System.out.print(p.getMarca() + " " + p.getModelo() + ", ");
            }
            System.out.println();
        }
    }

    public List<Prenda> devolverPrendas(Integer numero) {
        return map.get(numero);
    }
}
