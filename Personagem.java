package br.com.rpg.modelo;

public abstract class Personagem {
    protected String nome;
    protected int nivel;
    protected int vida;
    protected int vidaMaxima;
    protected int mana;
    protected int manaMaxima;
    protected int ataque;
    protected int defesa;
    protected int experiencia;

    public Personagem(String nome, int vida, int mana, int ataque, int defesa) {
        this.nome = nome;
        this.nivel = 1;
        this.experiencia = 0;
        this.vida = vida;
        this.vidaMaxima = vida;
        this.mana = mana;
        this.manaMaxima = mana;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public void exibirStatus() {
        System.out.println("==== " + nome + " (" + getTipo() + ") ====");
        System.out.println("Nível: " + nivel);
        System.out.println("Vida: " + vida + "/" + vidaMaxima);
        System.out.println("Mana: " + mana + "/" + manaMaxima);
        System.out.println("Ataque: " + ataque + " | Defesa: " + defesa);
        System.out.println("XP: " + experiencia);
        System.out.println();
    }

    public boolean receberDano(int dano) {
        int danoReal = dano - (defesa / 2);
        if (danoReal < 0) danoReal = 0;

        vida -= danoReal;
        if (vida < 0) vida = 0;

        System.out.println(nome + " recebeu " + danoReal + " de dano!");

        return vida == 0;
    }

    public void curar(int quantidade) {
        vida = Math.min(vida + quantidade, vidaMaxima);
    }

    public void ganharExperiencia(int exp) {
        experiencia += exp;
        if (experiencia >= 100) {
            subirNivel();
        }
    }

    public void subirNivel() {
        nivel++;
        vidaMaxima += 20;
        manaMaxima += 10;
        ataque += 5;
        defesa += 3;

        vida = vidaMaxima;
        mana = manaMaxima;
        experiencia = 0;

        System.out.println("✨ " + nome + " subiu para o nível " + nivel + "!");
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public abstract void atacar(Personagem alvo);
    public abstract void usarHabilidadeEspecial(Personagem alvo);
    public abstract String getTipo();
}