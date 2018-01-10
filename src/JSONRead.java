import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONRead {

	public static void main(String[] args) {
		
		JSONObject jsonObject;
		
		//cria o parse de tratamento
		JSONParser parser = new JSONParser();
		
		//Variaveis que armazenam os dados do arquivo JSON
		String nome;
		String sobreNome;
		String estado;
		String pais;
		
		//Salva no objeto JSONObject o que o parse tratou do arquivo
		try {
			jsonObject = (JSONObject) parser.parse(new FileReader(
					"saida.json"));
			
			//Salva nas variaveis os dados retirados do arquivo
			nome = (String) jsonObject.get("nome");
			sobreNome = (String)jsonObject.get("sobreNome");
			estado = (String)jsonObject.get("estado");
			pais = (String)jsonObject.get("país");
			
			System.out.printf(
					"Nome: %s\nSobrenome: %s\nEstado: %s\nPais: %s\n",
					nome, sobreNome, estado, pais);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
