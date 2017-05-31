package dsa.eetac.upc.edu.minim2dsa.Backend;

import android.app.Application;
import android.content.res.Configuration;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by Carlos on 31/05/2017.
 */

public class GlobalData extends Application {


    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

}
