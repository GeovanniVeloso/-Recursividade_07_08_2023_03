package controller;

public class RecursivaFatorial {
	public RecursivaFatorial() {
		super();
	}
	//Explicação: Recebe o valor atual e o multiplica pelo valor anterior.
	//Quando n se torna 1, o limite função é atingido, e a função retorna fazendo a multiplicação.
	public int FFAT(int n){
	       int fat;
	       
	       if(n!=1){
	          fat = n * FFAT(n-1);
	       }else{
	           return n;
	       }
	       return fat;
	   }
}
