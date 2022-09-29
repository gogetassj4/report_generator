package report.generator.jsonparser.test;

import static org.junit.Assert.*;

import java.io.*;

import org.junit.jupiter.api.Test;

import com.google.gson.*;

class parserTests {
	

	@Test
	void testForAllData() {
		try  {
			JsonObject jsonObject = JsonParser.parseReader(new FileReader("C:\\Users\\jyoth\\Documents\\SE_Project\\report_generator\\Report_Generator\\src\\report\\generator\\jsonparser\\elements.json"))
					.getAsJsonObject();
			
			JsonObject data = (JsonObject) jsonObject.get("data");
			
			String checkData = data.isJsonNull() ? "" : data.toString();
			
			assertNotNull(checkData, true);
			
			
		}catch(FileNotFoundException e) {}
			
	}

}

