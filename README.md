# 📱 Modelagem e Diagramação do Componente iPhone

Este repositório contém a modelagem UML e a implementação em Java das funcionalidades do iPhone, conforme proposto no desafio da **DIO - Trilha Java Básico**.

## 🔥 Desafio

O objetivo deste desafio é representar o componente **iPhone** utilizando UML e, opcionalmente, implementá-lo em Java. O dispositivo deve possuir as seguintes funcionalidades:

- **Reprodutor Musical**
  - `tocar()`
  - `pausar()`
  - `selecionarMusica(String musica)`
  
- **Aparelho Telefônico**
  - `ligar(String numero)`
  - `atender()`
  - `iniciarCorreioVoz()`
  
- **Navegador na Internet**
  - `exibirPagina(String url)`
  - `adicionarNovaAba()`
  - `atualizarPagina()`

## 🎥 Contexto

Com base no vídeo do **lançamento do iPhone em 2007**, foi possível entender os recursos principais do dispositivo e modelá-los utilizando UML e Java.

## 🛠️ Solução

### 🔹 Diagrama UML
O diagrama de classes foi criado utilizando a sintaxe **Mermaid**, representando a relação entre a classe `iPhone` e suas interfaces:

```mermaid
classDiagram
    class iPhone {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }
    
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }
    
    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }
    
    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }
    
    iPhone --|> ReprodutorMusical
    iPhone --|> AparelhoTelefonico
    iPhone --|> NavegadorInternet
