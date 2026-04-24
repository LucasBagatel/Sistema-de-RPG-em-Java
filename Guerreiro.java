package br.com.rpg.modelo;

public class Guerreiro extends Personagem {

    public Guerreiro(String nome) {
        super(nome, 150, 30, 25, 20);
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println(nome + " desfere um golpe poderoso!");
        int dano = (int)(ataque * 1.2);

        if (alvo.receberDano(dano)) {
            ganharExperiencia(50);
        }
    }

    @Override
    public void usarHabilidadeEspecial(Personagem alvo) {
        int custo = 20;

        if (mana >= custo) {
            System.out.println(nome + " usa INVESTIDA FURIOSA!");
            mana -= custo;

            int dano = (int)(ataque * 2.5);
            alvo.receberDano(dano);
        } else {
            System.out.println("Mana insuficiente!");
        }
    }

    @Override
    public String getTipo() {
        return "Guerreiro";
    }
}