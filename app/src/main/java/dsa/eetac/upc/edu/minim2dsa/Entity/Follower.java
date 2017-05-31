package dsa.eetac.upc.edu.minim2dsa.Entity;

/**
 * Created by Carlos on 31/05/2017.
 */

public class Follower {

    private String followername;
    private String urlfollowerimage;

    public Follower(String followername, String urlfollowerimage) {
        this.followername = followername;
        this.urlfollowerimage = urlfollowerimage;
    }
    public Follower(){}

    public String getFollowername() {
        return followername;
    }

    public void setFollowername(String followername) {
        this.followername = followername;
    }

    public String getUrlfollowerimage() {
        return urlfollowerimage;
    }

    public void setUrlfollowerimage(String urlfollowerimage) {
        this.urlfollowerimage = urlfollowerimage;
    }
}
