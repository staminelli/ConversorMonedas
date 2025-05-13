package principal;

import Modelos.Moneda;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Setting URL
        int opcion = 0;
        String base_code = "USD";
        String target_code = "";
        Double amount = 1.0;
        String apiKey = "b187dfb720fa1391be52491b";
        String url_pair = "";
        String url_str = "https://v6.exchangerate-api.com/v6/"+apiKey+"/latest/USD";

        System.out.println("""
        Tipo de cambio con respecto al dolar
        ************************************
        1. Peso Argentino (ARS)
        2. Real Brasileño (BRL)
        3. Peso Chileno (CLP)
        4. Sol Peruano (PEN)
        5. Bolivar Soberano (VES)
        6. Peso Boliviano (BOB)
        """);
        System.out.print("Ingrese la moneda: ");
        Scanner input = new Scanner(System.in);
        opcion = Integer.valueOf(input.nextLine());
        switch (opcion){
            case 1 -> target_code = "ARS";
            case 2 -> target_code = "BRL";
            case 3 -> target_code = "CLP";
            case 4 -> target_code = "PEN";
            case 5 -> target_code = "VES";
            case 6 -> target_code = "BOB";
            default -> System.out.println("Opcion invalida");
        }
        input.close();
        url_pair = "https://v6.exchangerate-api.com/v6/"+apiKey+"/pair/"+base_code+"/"+target_code+"/"+amount;



        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create (url_pair))
                    .build();
            HttpResponse <String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            Gson gson = new Gson();
/*            System.out.println(gson);
            System.out.println(response.body());*/
            Moneda moneda = new Gson().fromJson(response.body(),Moneda.class);
            System.out.println("$"+amount+" "+base_code+" equivale a $"+moneda.conversion_result()+" "+target_code);
        }
        catch (Exception e){
            throw new RuntimeException("Ocurrió un error");
        }
        //Gson gson = new Gson();

    }
}