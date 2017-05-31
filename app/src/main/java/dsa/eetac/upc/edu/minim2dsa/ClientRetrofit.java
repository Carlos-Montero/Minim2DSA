package dsa.eetac.upc.edu.minim2dsa;

import java.util.List;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Carlos on 31/05/2017.
 */

public interface ClientRetrofit {

    //Get user information
    @GET("users/{username}")
    Call<User> getUser (@Path("username") String username);

    //Get user's followers
    @GET("users/{username}/followers")
    Call<List<Follower>> getFollowers(@Path("username") String username);
}
