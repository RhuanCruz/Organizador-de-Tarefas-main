package testes;

import java.io.FileReader;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import java.io.File;
import java.io.FileNotFoundException;
import entidades.ListadeTarefas;
import entidades.Tarefa;


public class lerJson {
    public static void main(String[] args) {

            Tarefa tarefa = null;
        try {
            File arquivo = new File("C:/Users/dados.json");
            Gson gson = new Gson();

            //ler o arquivo ja escrito na maquina
            JsonReader reader;
            reader = new JsonReader(new FileReader(arquivo));

            //transportar o arquivo lido para dentro das casses java
            tarefa = gson.fromJson(reader, Tarefa.java);
            ListadeTarefas.adicionarTarefa(tarefa);
            }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(tarefa);
    }
    
}
