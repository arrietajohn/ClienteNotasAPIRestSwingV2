/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.mintic.misiontic.usa.ciclo3.apirest;

import co.gov.mintic.misiontic.usa.ciclo3.modelo.Estudiante;
import co.gov.mintic.misiontic.usa.ciclo3.modelo.RespuestaJson;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
 //..
/**
 *
 * @author JOHN CARLOS ARRIETA ARRIETA
 */
public class PeticionesApiRestNotasCiclo3 {

    String url = "https://g6c335b483ca254-bdgastosg16.adb.sa-santiago-1.oraclecloudapps.com/ords/admin/notas/retos/";

    public PeticionesApiRestNotasCiclo3() {
    }

    
    public PeticionesApiRestNotasCiclo3(String url) {
        this.url = url;
    }

    public Estudiante consultarNotas(String email) throws Exception {
        try {

            DefaultHttpClient clienteAPIRest = new DefaultHttpClient();
            HttpGet peticionGet = new HttpGet(url + email);
            // HttpPost
            // HttpPut
            // HttpDelete
            // Establecemos el tipo de contenido
            peticionGet.addHeader("accept", "application/json");
            // realizamos la conexion
            HttpResponse respuestaHTTP = clienteAPIRest.execute(peticionGet);
            // verificamos la respuesta
            System.out.println("CODIGO ESTADO: "+respuestaHTTP.getStatusLine().getStatusCode());
            if (respuestaHTTP.getStatusLine().getStatusCode() != 200) {
                throw new RuntimeException("Error: Codigo-HTTP="
                        + respuestaHTTP.getStatusLine().getStatusCode());
            }
            // recuperamos la respueta
            BufferedReader lectura = new BufferedReader(new InputStreamReader(
                    (respuestaHTTP.getEntity().getContent())));
            String entrada;
            System.out.println("Procesando la respuesta \n");
            // leyendo cada caracter
            String respuestaJSON = null;
            while ((entrada = lectura.readLine()) != null) {
                System.out.println(entrada);
                respuestaJSON = entrada;
            }
            clienteAPIRest.getConnectionManager().shutdown();
            Gson gson = new Gson();
            RespuestaJson json = gson.fromJson(respuestaJSON, RespuestaJson.class);
            return json.getItems()[0];
      
        } catch (IOException error) {
            System.out.println("ERROR: Lectura de datos remotos\n" + error.getMessage());
            throw new Exception("ERROR: Lectura de datos remotos\n" + error.getMessage());
        }

    }
}
