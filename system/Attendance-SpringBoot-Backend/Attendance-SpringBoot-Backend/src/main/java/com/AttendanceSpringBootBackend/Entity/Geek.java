package com.AttendanceSpringBootBackend.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Geek {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long Id;
    private String geek_name;
    private String geek_surname;
    private Enum status;


}
