package br.com.rpg.sistema;

import br.com.rpg.modelo.*;
import br.com.rpg.principal.Arena;
import java.util.ArrayList;

public class JogoRPG {

    public static void main(String[] args) {

        Personagem g = new Guerreiro("Thorin");
        Personagem m = new Mago("Gandalf");
        Personagem a = new Arqueiro("Legolas");

        ArrayList<Personagem> lista = new ArrayList<>();
        lista.add(g);
        lista.add(m);
        lista.add(a);

        for (Personagem p : lista) {
            p.exibirStatus();
        }

        g.usarHabilidadeEspecial(m);
        m.usarHabilidadeEspecial(g);
        a.usarHabilidadeEspecial(g);

        ((Mago)m).regenerarMana(30);
        ((Arqueiro)a).recarregarFlechas(10);

        g.ganharExperiencia(120);

        Arena.batalhar(g, m);

        ArrayList<Personagem> torneio = new ArrayList<>();
        torneio.add(new Guerreiro("A"));
        torneio.add(new Mago("B"));
        torneio.add(new Arqueiro("C"));
        torneio.add(new Guerreiro("D"));

        Arena.torneio(torneio);
    }
}