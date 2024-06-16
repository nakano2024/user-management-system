package com.example.authentication.utilities;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.stereotype.Component;
import java.util.Date;
import java.util.UUID;

@Component
public class JwtUtil {
    private String secretKey = "ffewaffefsfe";
    public String generateAccessToken(final String uniqueId, String username){
        return JWT.create().
                withIssuedAt(new Date()).
                withExpiresAt(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10)).
                withIssuer("todo-app").
                withSubject(uniqueId).
                withAudience(uniqueId).
                withClaim("username", "name").
                withJWTId(UUID.randomUUID().toString()).
                sign(Algorithm.HMAC256(secretKey));
    }
}
