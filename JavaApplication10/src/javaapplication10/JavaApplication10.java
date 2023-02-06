
package javaapplication10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
 
public class JavaApplication10 {
  public static void main(String[] args) throws MalformedURLException, ProtocolException {
    
      
      //this section connects the program to the website
      URL url = new URL("https://cat-fact.herokuapp.com/facts");
      HttpURLConnection connect = (HttpURLConnection) url.openConnection();
      connect.setRequestMethod("GET");
      connect.setRequestProperty("Accept", "application/json");

      
      //this prepares the program to read the api
      BufferedReader br = new BufferedReader(new InputStreamReader(
          (connect.getInputStream())));

      //this will print out the api to the user
      String output;
      while ((output = br.readLine()) != null) {
            System.out.println(output);
            
          }
      
      //this disconnects the program from the api
      connect.disconnect();

  }
}
