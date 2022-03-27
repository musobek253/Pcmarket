package uz.pdp.pcmarket.pyload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse {
    private String message;
    private Boolean isSuccess;
    private Object object;

    public ApiResponse(String message, Boolean isSuccess) {
        this.message = message;
        this.isSuccess = isSuccess;
    }
}
