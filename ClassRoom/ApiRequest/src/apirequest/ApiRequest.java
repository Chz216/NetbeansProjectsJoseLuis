/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apirequest;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.*;
import org.json.simple.parser.*;
/**
 *
 * @author NAMAN
 */
public class ApiRequest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        try {
            URL url = new URL("https://api.darksky.net/forecast/d9f330eded1ed92e3f5537d54fd7be48/37.8267,-122.4233");
            HttpURLConnection conn= (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            
            if (conn.getResponseCode() !=200){
                throw new RuntimeException("Falided : HTTP error code: " + conn.getResponseCode());
            }
            
            BufferedReader br = new BufferedReader (new InputStreamReader(conn.getInputStream()));
            String output = "";
            String JsonData = "";
            JSONParser parser = new JSONParser();
            
            while ((output = br.readLine()) !=null){
                JsonData += output;
            }
            Object object = parser.parse(JsonData);
            
            JSONObject jobject = (JSONObject)object;
            Double latitude = (Double)jobject.get("latitude");
            Double longitude = (Double)jobject.get("longitude");
            String timezone = (String)jobject.get("timezone");
            System.out.println(latitude);
            System.out.println(longitude);
            System.out.println(timezone);
            
            JSONObject Object2= (JSONObject) object;
            JSONObject Currently = (JSONObject)Object2.get("currently");
            String summary = (String)Currently.get("summary");
            String icon = (String)Currently.get("icon");
            System.out.println(summary);
            System.out.println(icon);
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(ApiRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ApiRequest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(ApiRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
}
