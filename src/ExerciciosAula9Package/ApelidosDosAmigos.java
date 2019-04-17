package ExerciciosAula9Package;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApelidosDosAmigos {
    public static void main(String[] args) {

        Map<String, List<String>> apelidos = new HashMap<>();

        List<String> apelidosJoao = new ArrayList<>();
        apelidosJoao.add("Juan");
        apelidosJoao.add("Fissura");
        apelidosJoao.add("Maromba");

        List<String> apelidosMiguel = new ArrayList<>();
        apelidosMiguel.add("Night Watch");
        apelidosMiguel.add("Bruce Wayne");
        apelidosMiguel.add("Tampinha");

        apelidos.put("Joao", apelidosJoao);
        apelidos.put("Miguel", apelidosMiguel);

        for (String chave : apelidos.keySet()) {
            System.out.println("Apelidos do: " + chave);
            for (String apelido : apelidos.get(chave)) {
                System.out.println("\t" + apelido);
            }
        }
    }
}
