package dsa.eetac.upc.edu.minim2dsa.Client;

import java.io.IOException;

//import edu.upc.eetac.dsa.etackemongo.Backend.GlobalData;
import dsa.eetac.upc.edu.minim2dsa.Backend.GlobalData;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import java.io.IOException;


/**
 * Created by Carlos on 31/05/2017.
 */

public class RetroClient {


    public static final String BASE_URL = "http://api.github.com/";


    //Get Retrofit Instance
    private static Retrofit getRetrofitInstance(final GlobalData global) {


        // Create an instance of our Etackemon API interface.
        //clientRetrofit = retrofit.create(ClientRetrofit.class);

        //Get API service
   /public static ClientRetrofit getClientRetrofit(GlobalData globaldata){


        return getRetrofitInstance(globaldata).create(ClientRetrofit.class);
    }




    }
}