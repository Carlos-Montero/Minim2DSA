package dsa.eetac.upc.edu.minim2dsa;


/**
 * Created by Carlos on 31/05/2017.
 */

public class User {

    private String username;
    private String urlimage;
    private String repositories;
    private String following;

    public User(String username, String urlimage, String repositories, String following) {
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

    public String getRepositories() {
        return repositories;
    }

    public void setRepositories(String repositories) {
        this.repositories = repositories;
    }

    public String getFollowing() {
        return following;
    }

    public void setFollowing(String following) {
        this.following = following;
    }

}
