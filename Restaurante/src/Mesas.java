
public class Mesas {
	public static final int TAMANO_BUFFER=6;
	private final int PRIMERA_POSICION_ESCRIBIBLE=0;
	private char buffer[]=new char[TAMANO_BUFFER];
	private int siguientePosicionEscribir;
	private boolean bufferLleno;
	private boolean bufferVacio=true;

	public synchronized char obtenerCaracter() {
		while(bufferVacio){
			try{
				wait();
			}catch(InterruptedException e){
				;
			}
		}
		siguientePosicionEscribir--;
		if(siguientePosicionEscribir==PRIMERA_POSICION_ESCRIBIBLE)
			bufferVacio=true;
		bufferLleno=false;
		notify();
		return(buffer[siguientePosicionEscribir]);
	}

	public synchronized void agregaCaracter(char c){
		while(bufferLleno){
			try{
				wait();
			}catch(InterruptedException e){
				;
			}
		}
		buffer[siguientePosicionEscribir] = c;
		siguientePosicionEscribir++;
		if(siguientePosicionEscribir==TAMANO_BUFFER)
			bufferLleno=true;
		bufferVacio=false;
		notify();
	}
}
