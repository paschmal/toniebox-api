package rocks.voss.toniebox.beans.toniebox;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class JWTToken {
    private String jwt;
    private ErrorInfo[] errors;

    @JsonIgnore
    public boolean hasErrors() {
        return errors != null && errors.length != 0;
    }
    @JsonIgnore
    public ErrorInfo[] getErrors() {
        return errors;
    }
}
