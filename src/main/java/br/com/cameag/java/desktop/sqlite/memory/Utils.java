package br.com.cameag.java.desktop.sqlite.memory;

import java.util.Random;

/**
 * @author Carlos Mesquita Aguiar
 * @date 24/06/2022 
 */
public class Utils {
    public static String getNewCPF(){
        String cpf = "";
        for(int i = 1; i <= 11; i++){
            cpf = cpf.concat(String.valueOf(new Random().nextInt(9)));
        }
        return cpf;
    }
    
    public static String getNewNome(){
        
        String[] listaNome = {"Andre","Bruna","Claudia","Denis","Edson","Flavia","Gustavo","Henrique","Inácio","Júlio","Letícia","Marcelo","Nívia","Otávio","Pedro","Roberta","Sandra","Tiago","Welson","Yan"};
        String[] listaSobreNome = {"Assis","Cavalcante","Dagol","Ernanes","Ferreira","François","Guttemberg","Hombre","Iss","Jarbonel","Lessa","Mass","Nessis","Olavo","Pereira","Quadros","Santos","Silva","Tavasso","Willinsan"};
        
        return listaNome[new Random().nextInt(20)].concat(" ").concat(listaSobreNome[new Random().nextInt(20)]);
    }
    
    public static String getNewIdade(){
        return String.valueOf(new Random().ints(15, 25).findFirst().getAsInt());
    }
    
    public static String getNewTelefone(){
        String telefone = "5518";
        for(int i = 1; i <= 9; i++){
            telefone = telefone.concat(String.valueOf(new Random().nextInt(9)));
        }
        return telefone.replaceFirst("(\\d{2})(\\d{2})(\\d{5})(\\d+)", "$1 $2 $3-$4");
    }
}
