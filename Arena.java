package br.com.rpg.principal;

import br.com.rpg.modelo.Personagem;
import java.util.ArrayList;

public class Arena {

    public static void batalhar(Personagem p1, Personagem p2) {
        System.out.println("🔥 BATALHA: " + p1.getTipo() + " vs " + p2.getTipo());

        while (p1.estaVivo() && p2.estaVivo()) {

            p1.atacar(p2);
            if (!p2.estaVivo()) {
                System.out.println(p1.getTipo() + " venceu!");
                break;
            }

            p2.atacar(p1);
            if (!p1.estaVivo()) {
                System.out.println(p2.getTipo() + " venceu!");
                break;
            }

            p1.exibirStatus();
            p2.exibirStatus();
        }
    }

    public static void torneio(ArrayList<Personagem> participantes) {
        if (participantes.size() < 2) {
            System.out.println("Participantes insuficientes!");
            return;
        }

        while (participantes.size() > 1) {
            Personagem p1 = participantes.get(0);
            Personagem p2 = participantes.get(1);

            batalhar(p1, p2);

            if (p1.estaVivo()) {
                participantes.remove(p2);
                p1.curar(9999);
            } else {
                participantes.remove(p1);
                p2.curar(9999);
            }
        }

        System.out.println("🏆 Campeão: " + participantes.get(0).getTipo());
    }
}