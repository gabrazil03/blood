package com.gabriel.bloodprojeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabriel.bloodprojeto.domain.CadastrarUsuario;

@Repository
public interface CadastrarURepository extends JpaRepository <CadastrarUsuario, Integer>{

}
