package org.example.ds.service;

import org.example.ds.dto.ComputerDto;

import java.util.List;

public interface ComputerService {
    public ComputerDto saveComputer (ComputerDto computerDto);
    public List<ComputerDto> getComputerByProce (String model);
}
