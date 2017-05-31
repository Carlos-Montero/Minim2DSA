package dsa.eetac.upc.edu.minim2dsa.Entity;

import java.util.List;

/**
 * Created by Carlos on 31/05/2017.
 */

public class User {

    private String username;
    private String urlimage;
    private Integer repositories;
    private Integer following;

    public User(String username, String urlimage, Integer repositories, Integer following, List<Follower> followers) {
        this.username = username;
        this.urlimage = urlimage;
        this.repositories = repositories;
        this.following = following;
    }
    public User(){}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUrlimage() {
        return urlimage;
    }

    public void setUrlimage(String urlimage) {
        this.urlimage = urlimage;
    }

    public Integer getRepositories() {
        return repositories;
    }

    public void setRepositories(Integer repositories) {
        this.repositories = repositories;
    }

    public Integer getFollowing() {
        return following;
    }

    public void setFollowing(Integer following) {
        this.following = following;
    }

}
