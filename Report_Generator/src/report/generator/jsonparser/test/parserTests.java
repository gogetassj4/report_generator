package report.generator.jsonparser.test;


import static org.junit.Assert.*;

import java.io.*;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

import com.google.gson.*;

class parserTests {
	

	@Test
	void testForValueMapping() {
		try  {
			JsonObject jsonObject = JsonParser.parseReader(new FileReader("C:\\Users\\jyoth\\Documents\\SE_Project\\report_generator\\Report_Generator\\src\\report\\generator\\jsonparser\\elements.json"))
					.getAsJsonObject();
		
			
			JsonObject data = (JsonObject) jsonObject.get("data");
			
			
			String checkData = data.isJsonNull() ? "" : data.toString();
			
			System.out.println("hello" + checkData);
			
			
			assertNotEquals("hello", data);
			
			
			
		}catch(FileNotFoundException e) {}
			
	}
	
	@Test
	void testForValueMappingForData() {
		try  {
			JsonObject jsonObject = JsonParser.parseReader(new FileReader("C:\\Users\\jyoth\\Documents\\SE_Project\\report_generator\\Report_Generator\\src\\report\\generator\\jsonparser\\elements.json"))
					.getAsJsonObject();
			
			JsonObject data = (JsonObject) jsonObject.get("data");
			JsonObject item = (JsonObject) data.get("item");
			JsonObject bug_type = (JsonObject) item.get("bug_type");
			JsonObject assert_state_change = (JsonObject) bug_type.get("assert_state_change");
			String s1 = assert_state_change.get("dasp").getAsString();
			
			
			
			System.out.println(s1);
			assertEquals("Unknown Unknowns"
					+ "", s1);
			
			
		}catch(FileNotFoundException e) {}
			
	}
	
	@Test
	void testForInvalidFile() {
		try  {
			JsonObject jsonObject = JsonParser.parseReader(new FileReader("C:\\Users\\jyoth\\Documents\\SE_Project\\report_generator\\Report_Generator\\src\\report\\generator\\jsonparser\\test.json"))
					.getAsJsonObject();
			
			String s1=jsonObject.toString();
			String assertionError = "empty file";
			try {
				assertEquals(s1,"{}");
			    }
	        catch (NoSuchElementException e) {
	            assertionError = e.toString();
	        }
            System.out.println(assertionError);

			
	        
			
			
		}catch(FileNotFoundException e) {}
			
	}
}



