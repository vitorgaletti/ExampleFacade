    
package singleton;

public class Facade {
        
        public static double total = 0;
        private CarrinhoDeRoupas carrinho;
        private Biblioteca biblioteca;
        
        public Facade(){
            carrinho = CarrinhoDeRoupas.getInstance();
            biblioteca = new Biblioteca();
        }
        public String cobrar(Double total){
             biblioteca.listaRoupas = carrinho.getListRoupas();
             return  biblioteca.precoTotal(total);
        }
        
        public String pagamento(Double valorPago){
            return biblioteca.realizarPagamento(valorPago);
        } 
        
        public String removerRoupa(int id){
            return carrinho.removeRoupa(id);
        }
    
}
