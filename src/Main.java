import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Prenda p1 = new Prenda("Nike", "PantalonAzul");
        Prenda p2 = new Prenda("Adidas", "RemeraBlanca");

        GuardaRopa gr = new GuardaRopa();

        List<Prenda> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);

        int codigo = gr.guardarPrendas(list);

        gr.mostrarPrendas();

        List<Prenda> listTest = gr.devolverPrendas(codigo);

        for (Prenda p : listTest) {
            System.out.print(p.getMarca() + " " + p.getModelo() + ", ");
        }
    }
}
