package br.com.rpg.modelo;

public class Arqueiro extends Personagem {

    private int flechas;

    public Arqueiro(String nome) {
        super(nome, 100, 50, 28, 12);
        this.flechas = 30;
    }

    @Override
    public void atacar(Personagem alvo) {
        if (flechas > 0) {
            System.out.println(nome + " dispara uma flecha certeira!");
            flechas--;

            int dano = (int)(ataque * 1.3);

            if (alvo.receberDano(dano)) {
                ganharExperiencia(50);
            }
        } else {
            System.out.println("Sem flechas!");
        }
    }

    @Override
    public void usarHabilidadeEspecial(Personagem alvo) {
        int custoMana = 15;
        int custoFlechas = 5;

        if (mana >= custoMana && flechas >= custoFlechas) {
            System.out.println(nome + " usa CHUVA DE FLECHAS!");
            mana -= custoMana;
            flechas -= custoFlechas;

            int dano = (int)(ataque * 2.0);

            for (int i = 0; i < 3; i++) {
                alvo.receberDano(dano);
            }
        } else {
            System.out.println("Recursos insuficientes!");
        }
    }

    public void recarregarFlechas(int quantidade) {
        flechas += quantidade;
    }

    @Override
    public String getTipo() {
        return "Arqueiro";
    }
}