package br.com.leveled.application.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Usuario {

    @Id
    @SequenceGenerator(name = "usuarioSequence", sequenceName = "usuario_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "usuarioSequence", strategy = GenerationType.SEQUENCE)
    private Long id;
    
    private String nome;
    
    private String email;
    
    private String senha;
    
    private String perfil;
}
