# Tradutor de Palavras

Um pequeno projeto em Java que carrega um dicionário de palavras (inglês <-> português) e oferece um menu de console para traduzir palavras, listar palavras disponíveis e visualizar resultados.

## Estrutura do projeto

- `src/TelaTradutor.java` — classe com a interface gráfica (Java Swing) e o método `main` usado para executar a aplicação.
- `src/AplicacaoConsole.java` — aplicação de console usada apenas para testes e exemplos (não é a interface principal).
- `src/Tradutor.java` — lógica de tradução e carregamento das palavras (arquivo de dados).
- `src/TelaTradutor.java` — (interface/auxiliar) tela de interação (se utilizada pelo projeto).
- `src/dados/palavras.txt` — arquivo com as palavras e traduções (dados usados pelo tradutor).

## Formato do arquivo de dados

O arquivo `src/dados/palavras.txt` contém uma tradução por linha no formato:

```
<palavra_em_ingles>/<palavra_em_portugues>
```

Exemplos de linhas válidas:

```
dog/cachorro
cat/gato
run/correr
```

Observação: o arquivo atual contém muitas entradas de exemplo. Cada linha representa uma associação entre a palavra em inglês (antes da barra `/`) e a tradução em português (depois da barra `/`).

## Como compilar e executar (Windows PowerShell)

1. Abra o PowerShell e navegue até a raiz do projeto (onde está o `README.md`).

```powershell
cd 'c:\Users\Windows\Desktop\davi\Sistemas-para-Internet-IFPB\P3\POO\TradutorDePalavras'
```

2. Compile todas as classes Java (gera saída em `out`):

```powershell
javac -d out src\*.java
```

3. Execute a aplicação (interface gráfica) apontando a classe principal `TelaTradutor`:

```powershell
java -cp out TelaTradutor
```

Observação: as classes não estão em um pacote. Se preferir, você pode compilar e rodar diretamente sem o diretório `out`, mas usar `-d out` ajuda a separar fontes da saída compilada.

## Uso

Ao executar, o programa apresenta um menu com as opções (valores observados em `AplicacaoConsole.java`):

- `0` - sair
- `1` - traduzir para português (entrada em inglês)
- `2` - traduzir para inglês (entrada em português)
- `3` - listar palavras em português
- `4` - listar palavras em inglês

O programa solicita a entrada pelo teclado e exibe as traduções encontradas (ou uma mensagem se não houver correspondência).

## Observações e dicas

- Certifique-se de que o arquivo `src/dados/palavras.txt` esteja presente e com codificação UTF-8 para evitar problemas com acentuação.
- O arquivo `palavras.txt` pode conter entradas duplicadas ou pequenas inconsistências — se quiser, corrija manualmente o arquivo para melhorar os resultados.
- Recomendado Java 8 ou superior.

## Contribuindo

Para adicionar novas palavras, edite `src/dados/palavras.txt` seguindo o formato `ingles/portugues`. Abra um pull request com suas alterações.


