package org.example.ds.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ComputerDto {

    private String proce;
    private int ram;
    private int hardDrive;
    private double price;
    private String macAddress;
}
