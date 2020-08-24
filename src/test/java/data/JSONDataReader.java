package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class JSONDataReader {

public String username, password , email, text;
	
	public void jsonReader() throws FileNotFoundException, IOException, ParseException {
		
		String filePath = System.getProperty("user.dir")+"/src/test/java/data/UserData.json";
		File srcFile = new File(filePath);
		JSONParser parser = new JSONParser();
		JSONArray jArray = (JSONArray) parser.parse(new FileReader(srcFile));
		for (Object jsonObj : jArray) {
			
			JSONObject user =  (JSONObject) jsonObj;


			username = (String) user.get("username");
			System.out.println(username);
			
			password = (String) user.get("password");
			System.out.println(password);
			
			email = (String) user.get("email");
			System.out.println(email);
		}

	}
	
	
	public void jsonReadertext() throws FileNotFoundException, IOException, ParseException {
		
		String filePath = System.getProperty("user.dir")+"/src/test/java/data/UserData.json";
		File srcFile = new File(filePath);
		JSONParser parser = new JSONParser();
		JSONArray jArray = (JSONArray) parser.parse(new FileReader(srcFile));
		for (Object jsonObj : jArray) {
			
			JSONObject user =  (JSONObject) jsonObj;


			text = (String) user.get("text");
			System.out.println(text);
		}

	}
}
