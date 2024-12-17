package org.example.ds.web.Controllers;

import lombok.AllArgsConstructor;
import org.example.ds.dto.ComputerDto;
import org.example.ds.service.ComputerService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor


@Component

public class ComputerGraphQLController {


    private ComputerService computerService ;



    @QueryMapping
    public List<ComputerDto> getComputerByProce (@Argument String model){
        return computerService.getComputerByProce (model);
    }


    @MutationMapping
    public ComputerDto saveComputer (@Argument ComputerDto computerDto){

        if (computerService == null) {
            throw new IllegalStateException("computerService is not injected");
        }else{
        return computerService.saveComputer(computerDto);}
    }
}
