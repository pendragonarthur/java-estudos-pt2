// ---------- ARRAY LIST ----------
// import java.util.ArrayList;

// public class App {
//     public static void main(String[] args)  {
//         // Um array que pode aumentar de tamanho 
//         // Elementos podem ser adicionados ou removidos depois da fase de compilação

//         ArrayList<String> comida = new ArrayList<String>();

//         comida.add("Macarrão");
//         comida.add("Arroz");
//         comida.add("Feijão");

//         comida.set(2, "Sushi");

//         for(int i = 0; i < comida.size(); i++){
//             System.out.println(comida.get(i));
//         }

//     }
// }

// ---------- 2D ARRAY LIST ----------

// import java.util.*;

// public class App { 
//     public static void main (String[] args){

//         // Um array 2D é um array composto por arrays

//         // Arrays sem utilizar o array 2D

//         ArrayList<String> listaPadaria = new ArrayList();
//         listaPadaria.add("Pão");
//         listaPadaria.add("Bolo");
//         listaPadaria.add("Biscoito");

//         ArrayList<String> listaMercado = new ArrayList();
//         listaMercado.add("Arroz");
//         listaMercado.add("Feijão");
//         listaMercado.add("Macarrão");

//         ArrayList<String> listaBebidas = new ArrayList();
//         listaBebidas.add("Coca");
//         listaBebidas.add("Suco");
//         listaBebidas.add("Cerveja");

//         // Utilizando o array 2D

//         ArrayList<ArrayList<String>> listaCompras = new ArrayList();

//         listaCompras.add(listaPadaria);
//         listaCompras.add(listaMercado);
//         listaCompras.add(listaBebidas);


//         // Vai retornar o primeiro array
//         System.out.println(listaCompras.get(0));

//         // Vai retornar o primeiro elemento do primeiro array
//         System.out.println(listaCompras.get(0).get(0));

//     }
// }

// ---------- FOR EACH LOOP ----------
import java.util.ArrayList;

public class App { 
    public static void main (String[] args){
        // FOR EACH é utilizado para iterar sobre elementos num array/collection
        // Menos etapas, mais legível
        // Menos flexivel

        // String[] animais = {"gato", "cachorro", "rato", "papagaio"};
        ArrayList<String> animais = new ArrayList<String>();

        animais.add("gato");
        animais.add("cachorro");
        animais.add("rato");
        animais.add("papagaio");

        for(String i : animais){
            System.out.println(i);
        }
    }
}