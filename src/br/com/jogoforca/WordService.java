package br.com.jogoforca;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class WordService {
//fornece uma palvra aleatoria que deve ser advinhada pelo jogador

    private static final String FILE_NAME="words.twt";
    private static final List<String> DEFAULT_WORDS=List.of("Batatinha","Eclipse","Laranja","Programador");

    public WordService() {
        try {
            initializeFile();
        }catch (IOException e){
            throw new RuntimeException("Erro ao iniciar o arquivo de palavras", e);
        }
    }
     private void initializeFile() throws IOException {
         File file = new File(FILE_NAME);
         if (!file.exists()) {
             try (FileWriter writer = new FileWriter(file)) {
                 for (String word : DEFAULT_WORDS) {
                     writer.write(word + System.lineSeparator());
                 }
             }
         }
     }
     public Word getRandomWord(){
        try {
            List<String> words = Files.readAllLines(Paths.get(FILE_NAME));
            Random random = new Random();
            String randomWord = words.get(random.nextInt(words.size()));
            return new Word(randomWord);
        }catch (IOException e){
            throw new RuntimeException("Erro ao ler o arquivo de palavras", e);
        }
     }
}

// O construtor agora vai chamar o método initializeFile, que vai verificar se o
// arquivo words.txt existe caso ele não existir ele cria o arquivo com palavras padrão.
// O método getRandomWord vai lêr todas as palavras do arquivo e sera selecionado aleatoriamente;