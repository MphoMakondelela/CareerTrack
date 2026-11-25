
package com.mpho.careertrack.auth.dto;

import com.mpho.careertrack.user.entity.User;

import java.time.Instant;
import java.util.UUID;

public record RegisterResponse(
        UUID id,
        String fullName,
        String email,
        Instant createdAt
) {

    public static RegisterResponse from(User user) {
        return new RegisterResponse(
                user.getId(),
                user.getFullName(),
                user.getEmail(),
                user.getCreatedAt()
        );
    }
}
