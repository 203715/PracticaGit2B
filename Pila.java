public class Pila{ 
	private CajaFrutas pila[];
	private int tope;
	public Pila(int capacidad){ 
		pila = new CajaFrutas[capacidad];
		tope = -1;
	} 	
	public boolean isEmpty(){
		return tope == -1;
	}	
	public void push(CajaFrutas i){
		if(tope+1 < pila.length)
			pila[++tope] = i;
	}
	public CajaFrutas pop(){
		if(isEmpty())
			return null;
		return 
			pila[tope--];
	}
	public CajaFrutas peek(){
		if(isEmpty())
			return null;
		return pila[tope];
	}   
}
