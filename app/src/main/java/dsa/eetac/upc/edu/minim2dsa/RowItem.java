package dsa.eetac.upc.edu.minim2dsa;

/**
 * Created by Carlos on 31/05/2017.
 */

public class RowItem {

    private String title;
    private int imageId;

    public RowItem(String title, int imageId) {
        this.title = title;
        this.imageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }


    @Override
    public String toString() {
        return title +"\n";
    }
}
