package com.rudra.userservice.Repositories;

import com.rudra.userservice.Models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
    Session save(Session session);
}
