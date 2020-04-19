package br.com.leveled.application.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Escola {

    @Id
    @SequenceGenerator(name = "escolaSequence", sequenceName = "escola_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "escolaSequence", strategy = GenerationType.SEQUENCE)
    private Long id;
    
    private String nome;
    
    private String email;
    }
