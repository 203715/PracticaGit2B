public class Main {
    public static void main (String[] args) throws Exception{ 
		Pila pila  =  new Pila(10);
		Pila pila1 = new Pila(10);
		Pila pila2 = new Pila(10);
		MyQueue caja = new MyQueue(10);	
		caja.enqueue(new CajaFrutas("Fresa", 3));
		caja.enqueue(new CajaFrutas("Manzana", 10));
		caja.enqueue(new CajaFrutas("Membrillo", 9));
		caja.enqueue(new CajaFrutas("Fresa", 3));
		caja.enqueue(new CajaFrutas("Manzana", 5));
		caja.enqueue(new CajaFrutas("Membrillo", 8));
		caja.enqueue(new CajaFrutas("Fresa", 6));
		caja.enqueue(new CajaFrutas("Manzana", 3));
		caja.enqueue(new CajaFrutas("Membrillo", 5));
		caja.enqueue(new CajaFrutas("Fresa", 6));	
		System.out.println("Almacen:");
		
		do{
			CajaFrutas fruta = caja.dequeue();
			if(fruta.getFrutas().equals("Fresa")){
			pila.push(fruta);
			}
			if(fruta.getFrutas().equals("Manzana")){
				pila1.push(fruta);
			}
			if(fruta.getFrutas().equals("Membrillo")){
				pila2.push(fruta);
			}
		}while(!caja.isEmpty());
		
	
		System.out.println("Caja Fresas"+"\n");
			CajaFrutas caja1;
		do{
			caja1 = pila.pop();
			System.out.println("Fruta: " +caja1.getFrutas()+ " Peso " +caja1.getPesoFrutas());
		}while(!pila.isEmpty());
			
		System.out.println("Caja Manzanas\n");
		do{
			caja1 = pila1.pop();
			System.out.println("Fruta: " +caja1.getFrutas()+ " Peso" +caja1.getPesoFrutas());
		}while(!pila1.isEmpty());
			
		System.out.println("Caja Membrillo\n");
		do{
			caja1 = pila2.pop();
			System.out.println("Fruta: " +caja1.getFrutas()+ " Peso" +caja1.getPesoFrutas());
		}while(!pila2.isEmpty());
	}
} 