package org.example.ds.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Computer {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_Pc;
    private String proce;
    private int ram;
    private int hardDrive;
    private float price;
    private String macAddress;



}
