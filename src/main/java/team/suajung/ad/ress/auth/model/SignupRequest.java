package team.suajung.ad.ress.auth.model;

import lombok.Data;

@Data
public class SignupRequest {
    private String username;

    private String email;

    private String password;
}

