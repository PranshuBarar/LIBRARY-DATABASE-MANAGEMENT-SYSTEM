package com.example.Library_Database_Management_System.Repositories;

import com.example.Library_Database_Management_System.Models.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card,Integer> {
}
