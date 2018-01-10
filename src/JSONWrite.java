import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONWrite {
	
	
	public static void main(String[] args) {
		
		//cria objeto json
		JSONObject jsonObj = new JSONObject();
		
		FileWriter writeFil = null;
		
		//Armazena dados em Objeto Json
		try {
			jsonObj.put("nome", "Allan");
			jsonObj.put("sobreNome", "Romanato");
			jsonObj.put("país", "Brasil");
			jsonObj.put("estado", "SP");
			
			writeFil = new FileWriter("saida.json");
			writeFil.write(jsonObj.toString());
			writeFil.close(); //fecha arquivo JSON
			
			//imprime resultado na tela
			System.out.println(jsonObj);
			
		} catch (JSONException e) {
			System.out.println("Falha ao gerar arquivo JSON!");
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}	
		
	}
	
	
}
