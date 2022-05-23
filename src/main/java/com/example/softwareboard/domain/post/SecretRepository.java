package com.example.softwareboard.domain.post;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SecretRepository extends JpaRepository<Secret, Long> {
}

