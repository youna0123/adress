package team.suajung.ad.ress.auth.model;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;

    private String password;
}

