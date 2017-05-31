package dsa.eetac.upc.edu.minim2dsa.Listas_View;

/**
 * Created by Carlos on 31/05/2017.
 */

public class RowItem {

    private String username;
    private String urlimage;

    public RowItem(String username, String urlimage) {
        this.username = username;
        this.urlimage = urlimage;
    }

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


    @Override
    public String toString() {
        return username +"\n" +urlimage;
    }
}
