package report.generator.jsonparser.test;


import static org.junit.Assert.*;

import java.io.*;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;
import com.google.gson.*;
import java.util.*;

class parserTests {
	

	@Test
	void testForValueMapping() {
		try  {
			JsonObject jsonObject = JsonParser.parseReader(new FileReader("C:\\Users\\jyoth\\Documents\\SE_Project\\report_generator\\Report_Generator\\src\\report\\generator\\jsonparser\\elements.json"))
					.getAsJsonObject();
		
			
			JsonObject data = (JsonObject) jsonObject.get("data");

			
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
	
	
	@Test
	void testForValidChildElement() {
		
		try  {
			JsonObject jsonObject = JsonParser.parseReader(new FileReader("C:\\Users\\jyoth\\Documents\\SE_Project\\report_generator\\Report_Generator\\src\\report\\generator\\jsonparser\\elements.json"))
					.getAsJsonObject();
			JsonObject data = (JsonObject) jsonObject.get("data");
			JsonObject item = (JsonObject) data.get("item");
			JsonObject bug_type = (JsonObject) item.get("bug_type");
			JsonObject access_control = (JsonObject) bug_type.get("access_control");
			List<String> child_elements = new ArrayList<>();
			for (String key: access_control.keySet())
			{
				child_elements.add(key);
			}

			String check_val = "";
			
		    for (int i = 0; i < child_elements.size(); i++) 
		    {
		    	if(child_elements.get(i).equalsIgnoreCase("reported_by")) {
		    		check_val = child_elements.get(i);
		    		break;
		    	}
		    }
		    
		    assertEquals("reported_by", check_val);

		}catch(FileNotFoundException e) {}
			
	}
	
	@Test
	void testForInValidChildElement() {
		
		try  {
			JsonObject jsonObject = JsonParser.parseReader(new FileReader("C:\\Users\\jyoth\\Documents\\SE_Project\\report_generator\\Report_Generator\\src\\report\\generator\\jsonparser\\elements.json"))
					.getAsJsonObject();
			JsonObject data = (JsonObject) jsonObject.get("data");
			JsonObject item = (JsonObject) data.get("item");
			JsonObject bug_type = (JsonObject) item.get("bug_type");
			JsonObject access_control = (JsonObject) bug_type.get("access_control");
			List<String> child_elements = new ArrayList<>();
			for (String key: access_control.keySet())
			{
				child_elements.add(key);
			}

			String check_val = "";
			
		    for (int i = 0; i < child_elements.size(); i++) 
		    {
		    	if(child_elements.get(i).equalsIgnoreCase("reported_by")) {
		    		check_val = child_elements.get(i);
		    		break;
		    	}
		    }
		    
		    assertNotEquals("hello world", check_val);

		}catch(FileNotFoundException e) {}
			
	}
}



