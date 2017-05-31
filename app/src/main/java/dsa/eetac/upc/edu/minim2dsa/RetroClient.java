package dsa.eetac.upc.edu.minim2dsa;

import dsa.eetac.upc.edu.minim2dsa.ClientRetrofit;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by Carlos on 31/05/2017.
 */

public class RetroClient {


    public static final String BASE_URL = "https://api.github.com/";

    //Get Retrofit Instance
    private static Retrofit getRetrofitInstance() {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public static ClientRetrofit getClientRetrofit(){


        return getRetrofitInstance().create(ClientRetrofit.class);
    }
}