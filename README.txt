# 🎮 Sistema de RPG em Java

## 📋 Descrição

Este projeto foi desenvolvido como parte da disciplina de **Programação Orientada a Objetos (POO)**. O objetivo é implementar um sistema de RPG utilizando os principais conceitos da POO em Java, como herança, polimorfismo, encapsulamento e classes abstratas.

O sistema simula personagens com diferentes classes (Guerreiro, Mago e Arqueiro), que podem batalhar entre si, usar habilidades especiais, evoluir de nível e participar de torneios.

---

## 🧠 Conceitos Aplicados

* Classes e Objetos
* Encapsulamento (getters/setters)
* Herança
* Polimorfismo
* Classes e Métodos Abstratos
* Sobrescrita de Métodos (@Override)
* Construtores
* Uso de ArrayList

---

## 🏗️ Estrutura do Projeto

```
src/
└── br/
    └── com/
        └── rpg/
            ├── modelo/
            │   ├── Personagem.java
            │   ├── Guerreiro.java
            │   ├── Mago.java
            │   └── Arqueiro.java
            ├── sistema/
            │   └── Arena.java
            └── principal/
                └── JogoRPG.java
```

---

                            ## ⚔️ Funcionalidades

### 👤 Personagens

* Classe abstrata `Personagem` com atributos e métodos comuns
* Classes concretas:

  * **Guerreiro**: alto dano e defesa
  * **Mago**: alto poder mágico e consumo de mana
  * **Arqueiro**: ataques balanceados e uso de flechas

### 💥 Sistema de Combate

* Ataques com cálculo de dano baseado em atributos
* Redução de dano por defesa
* Verificação de vida e morte

### ✨ Habilidades Especiais

* Cada classe possui uma habilidade única
* Consumo de recursos (mana/flechas)

### 📈 Sistema de Evolução

* Ganho de experiência ao derrotar inimigos
* Level up automático ao atingir 100 de XP
* Aumento de atributos ao subir de nível

### 🏟️ Arena

* Batalha 1x1 entre personagens
* Sistema de torneio eliminatório
* Declaração de vencedor e campeão

---

## ▶️ Como Executar

### 🔧 Pré-requisitos

* Java JDK 8 ou superior
* IDE (IntelliJ, Eclipse, VS Code) ou terminal

### 🚀 Passos

1. Clone ou baixe o projeto:

```
git clone <link-do-repositorio>
```

2. Compile os arquivos:

```
javac br/com/rpg/principal/JogoRPG.java
```

3. Execute o programa:

```
java br.com.rpg.principal.JogoRPG
```

---

## 🧪 Demonstrações no Main

O programa principal (`JogoRPG.java`) inclui:

* Criação de personagens
* Exibição de status (polimorfismo)
* Uso de habilidades especiais
* Teste de métodos exclusivos (mana e flechas)
* Sistema de experiência e level up
* Batalha individual
* Torneio com múltiplos personagens

---

## 📌 Observações

* O sistema foi desenvolvido com foco educacional
* As fórmulas de dano podem ser ajustadas conforme desejado
* O código segue boas práticas de organização e legibilidade

---

## 👥 Integrantes do Grupo

* Daniel da Silva Dornelas
* Kauan Garcia Dias de Oliveira
* Lucas Eduardo Malachias Bagatela
* Murilo da Silva Cardoso
* Ricardo Aguilar Arapa
* Yago Gabriel Leal Firmino

---

## 📄 Licença

Este projeto é de uso acadêmico e não possui fins comerciais.

---

## 💡 Considerações Finais

Este projeto demonstra na prática como os conceitos de Programação Orientada a Objetos podem ser aplicados na construção de sistemas mais organizados, reutilizáveis e escaláveis.

---