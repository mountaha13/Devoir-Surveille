package org.example.ds.dao.repositories;

import org.example.ds.dao.entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComputerRepository extends JpaRepository<Computer, Long> {
    public List<Computer> findByProce(String model);
}
