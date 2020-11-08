package rocks.voss.toniebox.beans.toniebox;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

/**
 * The request did not contain all expected parameters in the documented format. 
 * This is likely a bug in the client implementation, and should be logged client-side, with an apology to the user.
 */
@Data
public class ErrorInfo {
    /**
     * The key in the request that was incorrect (if any)
     */
    private String key;

    /**
     * Machine-readable code for the reason of the error:
     * 
     *  verificationNeeded - Email verification needed before a login can progress. A verification email has been sent.
     *  ssoAuthRequired - Authentication through SSO required.
     *  required - The field was missing in the request and needs to be set.
     *  maxLength - The value is too long, must be shorter
     *  minLength - The value is too short, must be longer
     *  blank - The value must not be empty (same as min_length=1)
     *  invalidChoice - The field is an enum; you must pick one of the declared options.
     *  invalid - Another field validation problem. For instance, an email field may not be a valid email address
     */
    private String code;

    @JsonIgnore
    public String getKey() {
        return key;
    }

    @JsonIgnore
    public String getCode() {
        return code;
    }
}