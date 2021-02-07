
public class MyQueue {
	public static final int DEFAULT_SIZE=10;
	private CajaFrutas data[];
	private int index;
	public MyQueue(){
		data=new CajaFrutas[DEFAULT_SIZE];
	}
	public MyQueue(int s){
		data=new CajaFrutas[s];
	}	
	public boolean isEmpty(){
		return index==0;
	}
	public void enqueue(CajaFrutas obj) throws Exception{
		if(index == DEFAULT_SIZE){
			throw new Exception("Queue is full. Dequeue some objects");
		}
		this.data[index]=obj;
		this.index++;
	}	
	public CajaFrutas dequeue() throws Exception{
		if(isEmpty())throw new Exception("Queue is empty");
		CajaFrutas obj=this.data[0];
		for(int i =0; i<this.index-1; i++){
			data[i]=data[i+1];
		}
		this.index--;
		return obj;
	}	
	public CajaFrutas peek() throws Exception{
		if(isEmpty())throw new Exception("Queue is empty");
			return this.data[0];
	}
}