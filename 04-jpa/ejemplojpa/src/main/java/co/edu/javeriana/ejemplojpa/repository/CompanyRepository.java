package co.edu.javeriana.ejemplojpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.javeriana.ejemplojpa.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {
    
}
