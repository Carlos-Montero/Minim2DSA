package dsa.eetac.upc.edu.minim2dsa;

import android.app.Application;
import android.content.res.Configuration;
import java.util.List;
/**
 * Created by Carlos on 31/05/2017.
 */

public class GlobalData extends Application {

    private User user;
    private List<Follower> followerList;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Follower> getFollowerList() {
        return followerList;
    }

    public void setFollowerList(List<Follower> followerList) {
        this.followerList = followerList;
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
