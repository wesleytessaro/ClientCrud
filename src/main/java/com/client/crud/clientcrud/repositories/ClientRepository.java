package com.client.crud.clientcrud.repositories;

import com.client.crud.clientcrud.entities.Client;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository <Client, Long>{

}
