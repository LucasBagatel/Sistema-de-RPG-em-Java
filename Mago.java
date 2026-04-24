package br.com.rpg.modelo;

public class Mago extends Personagem {

    public Mago(String nome) {
        super(nome, 80, 120, 30, 8);
    }

    @Override
    public void atacar(Personagem alvo) {
        int custo = 10;

        if (mana >= custo) {
            System.out.println(nome + " lança uma bola de fogo!");
            mana -= custo;

            int dano = (int)(ataque * 1.5);

            if (alvo.receberDano(dano)) {
                ganharExperiencia(50);
            }
        } else {
            System.out.println("Mana insuficiente!");
        }
    }

    @Override
    public void usarHabilidadeEspecial(Personagem alvo) {
        int custo = 40;

        if (mana >= custo) {
            System.out.println(nome + " invoca METEORO ARCANO!");
            mana -= custo;

            int dano = (int)(ataque * 3.0);
            alvo.receberDano(dano);
        } else {
            System.out.println("Mana insuficiente!");
        }
    }

    public void regenerarMana(int quantidade) {
        mana = Math.min(mana + quantidade, manaMaxima);
    }

    @Override
    public String getTipo() {
        return "Mago";
    }
}