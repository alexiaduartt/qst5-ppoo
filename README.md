# 🧩 Padrões de Projeto Orientados a Objetos  
## Prática – Padrão Composite (Carro)

### 👩‍💻 Autoras
**Alexia Alves**  
**Maria Vitória Melo**

---

## 📘 Descrição da Questão

O exercício propôs implementar um modelo simplificado de **carro** utilizando o **Padrão de Projeto Composite**.  
O objetivo foi criar uma estrutura hierárquica onde o carro é composto por partes menores, que podem ser simples (folhas) ou compostas (conjuntos de partes).  
O sistema deve calcular o **peso total do carro**, exibindo mensagens a cada soma parcial.

### Estrutura do problema:
- O **Carro** é composto por:
  - **Carroceria** → para-lamas, portas, painéis, porta-malas e capô.  
  - **Chassi** → trem de força e suspensão.  
- O **Trem de Força** é composto por:
  - **Motor**, **Transmissão**, **Diferencial** e **Rodas**.

Cada parte possui **nome** e **peso**, e o sistema deve exibir:
Somando agora o peso de MOTOR: 80.0. Total parcial: 80.0
Somando agora o peso de CHASSI: 200.0. Total parcial: 280.0

O código final aplica o **Composite Pattern**, permitindo o tratamento uniforme de partes simples e compostas, e o cálculo recursivo do peso total do carro.

---

## 🧠 Uso da Inteligência Artificial (IA)

Durante o desenvolvimento, a IA foi utilizada para definir as classes, métodos e estrutura hierárquica seguindo o **Padrão Composite**.  
Todos os prompts, respostas e decisões foram documentados nos commits correspondentes, feitos na **branch master**.

---

### 🪶 Prompt 1 – Definição da Interface Base do Composite
> **Objetivo:** Criar a interface que define o contrato comum para todas as partes do carro.  
> **Solução sugerida pela IA:**
> - Criar a interface `ParteCarro` com o método `getPesoTotal()`.  
>
> **Justificativa:**  
> Estabelece o contrato unificado que garante que partes simples e compostas possam ser tratadas de forma polimórfica, seguindo o padrão Composite.  
>
> ✅ **Resultado:** Implementação funcional e coerente com o design desejado.

---

### 🪶 Prompt 2 – Implementação da Classe Folha (`ParteSimples`)
> **Objetivo:** Criar a classe que representa partes individuais (sem filhos), como motor, porta ou capô.  
> **Solução sugerida pela IA:**
> - Implementar `ParteSimples` com os atributos `nome` e `peso`.  
> - Implementar `getPesoTotal()` exibindo o peso da peça e retornando seu valor.  
>
> **Justificativa:**  
> Representa os objetos terminais da composição (folhas), cumprindo o papel fundamental do padrão Composite.  
>
> ✅ **Resultado:** Código pronto e sem ajustes manuais necessários.

---

### 🪶 Prompt 3 – Implementação da Classe Composta (`ParteComposta`)
> **Objetivo:** Criar a classe que pode conter outras partes (como carroceria e chassi).  
> **Solução sugerida pela IA:**
> - Implementar `ParteComposta` com uma lista de `ParteCarro`.  
> - Criar o método `adicionar(ParteCarro p)` e sobrescrever `getPesoTotal()` para somar recursivamente os pesos das partes.  
> - Exibir mensagens de soma parcial durante o cálculo.  
>
> **Justificativa:**  
> Permite a montagem hierárquica do carro e o cálculo recursivo do peso total, eliminando duplicações e mantendo o código reutilizável.  
>
> ✅ **Resultado:** Implementação concluída sem necessidade de ajustes adicionais.

---

### 🪶 Prompt 4 – Montagem e Execução (Classe Principal `Main`)
> **Objetivo:** Criar a classe `Main` que monta a estrutura completa do carro e executa o cálculo do peso total.  
> **Solução sugerida pela IA:**
> - Montar a hierarquia com `Carroceria`, `Chassi`, `Trem de Força` e partes simples.  
> - Invocar `getPesoTotal()` e exibir o resultado final.  
>
> **Justificativa:**  
> Demonstra a aplicação prática do padrão Composite, com cálculo recursivo e relação "todo–parte" bem definida.  
> Garante que o código atenda ao enunciado e imprima corretamente o processo de soma.  
>
> ✅ **Resultado:** Código funcional e fiel à proposta do exercício.

---

## 🧩 Histórico de Commits Principais (Branch master)

| Data | Commit | Descrição |
|------|---------|-----------|
| 07/10/2025 | `a13fea8` | Criando a interface base `ParteCarro` |
| 07/10/2025 | `9e3b3f2` | Implementando a classe folha `ParteSimples` |
| 07/10/2025 | `418e359` | Implementando a classe composta `ParteComposta` |
| 07/10/2025 | `e6b7c40` | Criando o `Main.java` para montagem e execução do cálculo de peso total |

> ⚙️ Outros commits menores foram feitos para ajustes e refinamentos.

---

## 🧭 Diagrama de Classes

![Diagrama de Classes](diagrama%20de%20classes/DiagramadeClassesqst5.png)
