package iteration.JsonIter;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        JSONParser parser = new JSONParser();
    	try {
    		 
            Object obj = parser.parse(new FileReader(
                    "/home/khaja/Downloads/companies.json"));
 
            JSONObject jsonObject = (JSONObject) obj;
 
            JSONArray productslist= (JSONArray) jsonObject.get("products");
            Iterator<ArrayList> iterator = productslist.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
 
        } catch (Exception e) {
            e.printStackTrace();
        }   
    }
}
