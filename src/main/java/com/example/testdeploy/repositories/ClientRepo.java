package com.example.testdeploy.repositories;

import com.example.testdeploy.entiies.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepo extends JpaRepository<Client , Long> {
}
