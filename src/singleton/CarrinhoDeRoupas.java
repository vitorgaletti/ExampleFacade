
package singleton;

import java.util.ArrayList;
import java.util.Random;
import pojo.Roupa;

public class CarrinhoDeRoupas {
     
  private static CarrinhoDeRoupas instance;
  public static ArrayList<Roupa> listaRoupas;
  
  
          
  private CarrinhoDeRoupas(){  
       listaRoupas = new ArrayList<Roupa>();
  } 
  
  public static CarrinhoDeRoupas getInstance(){
      if (CarrinhoDeRoupas.instance == null){  
          CarrinhoDeRoupas.instance = new CarrinhoDeRoupas();
      }    
      return CarrinhoDeRoupas.instance;
  }
 
  public ArrayList<Roupa> getListRoupas(){
      return this.listaRoupas;
      
  }
  
  public void addRoupas(Roupa roupa){
      
     Random r = new Random();
     roupa.setId(r.nextInt(100));   
     double valor = (int) ((Math.random() * 900) + 10000) / 100.0;
     roupa.setPreco(valor);
     listaRoupas.add(roupa);
         
  }
  @Override
  public String toString(){
      String result = "+";
      for (int i = 0; i < listaRoupas.size(); i++){
           result = listaRoupas.get(i).toString();
           System.out.println("\n"+result);
    }
      return result;            
  
  }
  
  public String removeRoupa(int id){
      if (listaRoupas.isEmpty()){
          return "\nCarrinho Vázio!";
      }
      else {
      for (int i = 0; i < listaRoupas.size(); i++){
          if((listaRoupas.get(i)).getId() == id){
              listaRoupas.remove(i);
              return "Roupa Removida com Sucesso";
            }
            
        }
         return "Roupa não encontrada";
      }
      
    }  
}


