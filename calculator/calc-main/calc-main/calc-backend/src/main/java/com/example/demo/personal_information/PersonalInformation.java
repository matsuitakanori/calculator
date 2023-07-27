package com.example.demo.personal_information;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.demo.equation_log.EquationLog;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="personal_infomation")
public class PersonalInformation{

    @Id
    @Column(name="id")
    private int id;
 
    @Column(name="name")
    private String name;

    @Column(name="phone_number")
    private String phone_number;

    @Column(name="email")
    private String email;

    @ManyToOne
    @JoinColumn(name="equation_id")
    private EquationLog equation_log;
}