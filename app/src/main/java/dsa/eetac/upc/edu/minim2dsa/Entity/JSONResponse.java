package dsa.eetac.upc.edu.minim2dsa.Entity;

/**
 * Created by Carlos on 31/05/2017.
 */

public class JSONResponse {
    // Entity used to create json responses for correct operations
    // Doesn't exist on the database
    // With it's constructors, getters and setters(self-explanatory)

    private String message;
    private Object object;

    public JSONResponse() {
    }

    public JSONResponse(String message) {
        this.message = message;
    }

    public JSONResponse(String message, Object object) {
        this.message = message;
        this.object = object;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
