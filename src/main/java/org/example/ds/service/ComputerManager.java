package org.example.ds.service;

import org.apache.catalina.mapper.Mapper;
import org.example.ds.dao.entities.Computer;
import org.example.ds.dao.repositories.ComputerRepository;
import org.example.ds.dto.ComputerDto;
import org.example.ds.mapper.ComputerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ComputerManager implements ComputerService {

        private ComputerRepository computerRepository;

        @Autowired
        private ComputerMapper mapper; // Si vous utilisez un outil comme MapStruct ou ModelMapper pour les conversions DTO-Entity

    @Override
    public ComputerDto saveComputer(ComputerDto computerDto) {
        Computer computer = mapper.fromComputerDtoToComputer(computerDto);
        computer = computerRepository.save(computer);
        computerDto = mapper.fromComputerToComputerDto(computer);
        return computerDto;
    }


    @Override
    public List<ComputerDto> getComputerByProce(String model) {
        List<Computer> computers = computerRepository.findByProce(model);
        List<ComputerDto> computerDtos = new ArrayList<>();
        for (Computer computer : computers) {
            computerDtos.add(mapper.fromComputerToComputerDto(computer));
        }
        return computerDtos;
    }


}



