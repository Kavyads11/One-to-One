package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Employe;



@Repository
public interface EmployeRepository extends JpaRepository<Employe, Long> {

}
