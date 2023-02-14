package village.farmer.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VerifyDTO {
    @Schema(example = "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IlJTQSJ9.eyJhdWQiOiJhZG1pbiIsInVzZXJuYW1lIjoidGVzdCIsImV4cCI6MTY3NjQ1MDk3MSwianRpIjoiTUhDeklDV3ZfbDYzTDFwYUJoWWNwdyIsImlzcyI6IlZpbGxhZ2UgT2ZmaWNlciIsInN1YiI6Ijk4NTllNmQ5ZDhiNzcwNWMxNjFkY2UxNDQxODhhY2ZiNzE2N2Q3OGY4YTlhMjNhYzZjYjc3ZDUxNGRjNWNjYTMifQ.yoa2aexE5YyMxUSWCS_kw2TyJaI7DkEc5rV1zooBff6Ikt4F0oNQD2ETooIC1PYV0Q7sZmcI8pKvN4SNm3e11DxTt7eazw3PSk11YbEKLcDR2_oP5FPikuUbrKFuDBSgtSn3DRizaclqYOS0tdfyNX9UDrbiMQgSVbVrt5_a6UmN81n5G2GjI0v0ea_G60Qv_bSAtPVegoFr5KJHM6KRFSWxnArQfVsHAIBBKYpDoPBla9JuiotN8KuvsAbXl-Y8mFgxVJGYIcRjUFYcidZG7rgq6yFRDZBD0SQ9zIIpVR4UCdMsqXN_ZUXUjdOY_LzBlIwhyLv38KIK1heGAOnDtg",
        description = "token from login"
    )
    private String token;
}
