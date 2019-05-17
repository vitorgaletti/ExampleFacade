
package singleton;

import java.util.ArrayList;
import pojo.Roupa;

public class Biblioteca {
    
    public static ArrayList<Roupa> listaRoupas;
    
    public String precoTotal(double total){   
            Facade.total = total;
          
                for(int i = 0; i < listaRoupas.size(); i++){
                    total += listaRoupas.get(i).getPreco();
                }
		return "Valor a ser pago pelo cliente: R$" + total;
	}
  
    public String realizarPagamento(double valorPago) {
               
                for(int i = 0; i < listaRoupas.size(); i++){
                    Facade.total = listaRoupas.get(i).getPreco();
                }
                if(Facade.total == 0) {
			return "Executar cobrança primeiro";
		}
                else if(Facade.total <= valorPago) { 
                        return "Troco: R$" + (valorPago - Facade.total+ "\nPagamento Efetuado com Sucesso");

                    }
                else if (Facade.total == valorPago){
                       return "\nPagamento Efetuado com Sucesso.";
                }
                
		else {
			return "O valor pago está incorreto. O Valor total é R$:"+ Facade.total + 
					" e o valor pago é R$:" + valorPago;
		}
	}
    
}
