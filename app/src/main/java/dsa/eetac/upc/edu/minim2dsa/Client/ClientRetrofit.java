package dsa.eetac.upc.edu.minim2dsa.Client;

import java.util.List;

import dsa.eetac.upc.edu.minim2dsa.Entity.Follower;
import dsa.eetac.upc.edu.minim2dsa.Entity.JSONResponse;
import dsa.eetac.upc.edu.minim2dsa.Entity.User;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Carlos on 31/05/2017.
 */

public interface ClientRetrofit {

    //Get user information
    @GET("/users/:username")
    Call<JSONResponse> user (@Path("username") String username);

    //Get user's followers
    @GET("/users/:username/followers")
    Call<List<Follower>> followers(@Path("username") String username);
}
