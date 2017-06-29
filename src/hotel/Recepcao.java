package hotel;

import java.util.ArrayList;

public class Recepcao {
	
	private ArrayList<Estadia> estadias = new ArrayList<>();
		
	public Recepcao(){
		
	}
	
	public void checkIn(String nome, String tipo, int idade, int dias, double valor){
		estadias.add(new Estadia(nome, tipo, idade, dias, valor));
		
	}
	
	public void checkOut(String nome){
		for (int i = 0; i < estadias.size(); i++){
			if ((estadias.get(i).getNome()).equals(nome)){
				estadias.remove(i);
			}
		}
	}
	
	public int getNumDeHospedes(){
		return estadias.size(); 
	}
	
	public double getLucroTotal(){
		double lucro = 0.0;
		for (int i = 0; i < estadias.size(); i++){
			lucro += estadias.get(i).getValor();
		}
		
		return lucro;
	}
	
	public String toString(){
		String retorno = "Estadias: ";
		for (int i = 0; i < estadias.size(); i++){
			retorno += "\n"+(estadias.get(i)).getNome()+" ("+(estadias.get(i)).getValor()
					+"): "+((estadias.get(i)).getDias()).toString()+" dias com o preço de R$ "+estadias.get(i).getValor().toString();
		}
	}
	
	
	
}
