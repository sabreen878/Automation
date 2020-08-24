package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONDataReader1 {

public String username, password;
	
	public void jsonReader1() throws FileNotFoundException, IOException, ParseException {
		
		String filePath = System.getProperty("user.dir")+"/src/test/java/data/UserData1.json";
		File srcFile = new File(filePath);
		JSONParser parser = new JSONParser();
		JSONArray jArray = (JSONArray) parser.parse(new FileReader(srcFile));
		for (Object jsonObj : jArray) {
			
			JSONObject user =  (JSONObject) jsonObj;


			username = (String) user.get("username");
			System.out.println(username);
			
			password = (String) user.get("password");
			System.out.println(password);
		}

	}

}
