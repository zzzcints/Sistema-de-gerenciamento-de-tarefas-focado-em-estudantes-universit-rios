# Sistema de Gerenciamento de Tarefas para Estudantes Universitários

Este projeto é um sistema simples de gerenciamento de tarefas acadêmicas, desenvolvido em **Java** com suporte a **JUnit** para testes automatizados e documentação gerada via **JavaDoc**.


## Funcionalidades
- Cadastro e login de usuários
- Cadastro de disciplinas
- Cadastro de tarefas vinculadas às disciplinas
- Listagem, busca e remoção de tarefas
- Relatórios de atividades e disciplinas
- Dados em arquivos `.txt`


##  Tecnologias utilizadas
- **Java 17**
- **Maven** (gerenciamento de dependências e build)
- **JUnit 5** (testes automatizados)
- **JavaDoc** (documentação)

## Estrutura do projeto 

```
├── src/
│   ├── main/
│   │   └── java/
│   │       └── br/
│   │           └── ufc/
│   │               ├── Main.java
│   │               ├── Pessoa.java
│   │               ├── Usuario.java
│   │               ├── Disciplina.java
│   │               ├── Tarefa.java
│   │               ├── Sistema.java
│   │               └── Gerenciavel.java
│   │
│   └── test/
│       └── java/
│           ├── UsuarioTest.java
│           ├── DisciplinaTest.java
│           ├── TarefaTest.java
│           └── SistemaTest.java

target/
 ├── classes/              # classes compiladas
 ├── test-classes/         # classes de teste compiladas
 ├── surefire-reports/     # relatórios dos testes
 └── site/apidocs/         # documentação JavaDoc
```

## Como executar
```
Necessário ter instalado: 
Java JDK 17 ou superior
Maven 3.x

Clonar o repositório:
git clone https://github.com/zzzcints/Sistema-de-gerenciamento-de-tarefas-focado-em-estudantes-universit-rios

Compilar:
mvn clean compile

Executar:
mvn exec:java "-Dexec.mainClass=br.ufc.Main"

Executar os testes:
mvn test
```


Projeto desenvolvido por Cíntia Gonçalves Dias, graduanda em Engenharia de Computação - UFC.
Trabalho final da disciplina de Programação Orientada a Objetos. 



