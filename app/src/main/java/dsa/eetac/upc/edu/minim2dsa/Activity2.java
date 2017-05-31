package dsa.eetac.upc.edu.minim2dsa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import dsa.eetac.upc.edu.minim2dsa.Backend.GlobalData;
import dsa.eetac.upc.edu.minim2dsa.Client.ClientRetrofit;
import dsa.eetac.upc.edu.minim2dsa.Client.RetroClient;
import dsa.eetac.upc.edu.minim2dsa.Entity.Follower;
import dsa.eetac.upc.edu.minim2dsa.Entity.JSONResponse;
import dsa.eetac.upc.edu.minim2dsa.Entity.User;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Activity2 extends AppCompatActivity {

    String name;
    String username;
    String urlimage;
    Integer repositories;
    Integer following;
    String followername;
    String urlfollowerimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        String username = getIntent().getStringExtra("username");

        name = username.getText().toString();

        globalData = (GlobalData) getApplication();
        ClientRetrofit = RetroClient.getClientRetrofit(globalData);

        Call<User> user = ClientRetrofit.user();
        user.enqueue(new Callback<User>() {

            @Override
            public void onResponse(Call<User> call, Response<User> response) {

                User user = response.body();
                username.setText(user.getUsername());
                urlimage.setText(user.getUrlimage());
                repositories = user.getRepositories();
                following = user.getFollowing();

            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                call.cancel();
                Toast.makeText(Activity2.this, "Can't get parameters", Toast.LENGTH_LONG).show();

            }

            Call<Follower> follower = ClientRetrofit.followers();
            follower.enqueue(new Callback<Follower>() {

                @Override
                public void onResponse(Call<Follower> call, Response<Follower> response) {

                    Follower follower = response.body();
                    followername.setText(follower.getUsername());
                    urlfollowerimage.setText(follower.getUrlimage());
                }

                @Override
                public void onFailure(Call<User> call, Throwable t) {
                    call.cancel();
                    Toast.makeText(Activity2.this, "Can't get parameters", Toast.LENGTH_LONG).show();

                }













        });

    }






}
}
