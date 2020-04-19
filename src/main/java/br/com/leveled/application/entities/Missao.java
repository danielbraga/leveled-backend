package br.com.leveled.application.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Missao {

    @Id
    @SequenceGenerator(name = "missaoSequence", sequenceName = "missao_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "missaoSequence", strategy = GenerationType.SEQUENCE)
    private Long id;
    
    private String nome;
    
    private String tipo;
    
    private String descricao;
    
    private String professor;
    
    private String escolaNome;
    
    private String escolaId;
    
    private String usuarioId;
    
    private String usuarioNome;
    }
