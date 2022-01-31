package com.danielle.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class Course {

  @Id //Chave primária
  @GeneratedValue(strategy = GenerationType.AUTO) //Chave sequencial gerada automaticamente pelo banco de dados //A strategy é o modo de geração da chave, que varia de acordo com o banco de dados.
  private Long id;

  @Column(length = 200, nullable = false) //Coluna, que pode ter um nome (name = "nome") e ser associada a uma coluna com outro nome no banco de dados. Podemos definir o tamanho (length = 200, nullable = false) e se não pode ser nulo o conteudo.
  private String name;

  @Column(length = 10, nullable = false)
  private String category;


  
}
