package dsa.eetac.upc.edu.minim2dsa.Client;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


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
    public static ClientRetrofit getClientRetrofit(GlobalData globaldata){


        return getRetrofitInstance(globaldata).create(ClientRetrofit.class);
    }




    }
}