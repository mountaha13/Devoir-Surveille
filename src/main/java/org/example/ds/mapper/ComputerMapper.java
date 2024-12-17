package org.example.ds.mapper;

import org.example.ds.dao.entities.Computer;
import org.example.ds.dto.ComputerDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {

    private ModelMapper mapper = new ModelMapper();
    public Computer fromComputerDtoToComputer(ComputerDto computerDto){
        return mapper.map(computerDto,Computer.class);
    }

    public ComputerDto fromComputerToComputerDto(Computer computer){

        return mapper.map(computer, ComputerDto.class);
    }

}
