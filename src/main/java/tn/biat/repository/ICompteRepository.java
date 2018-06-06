package tn.biat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.biat.entities.Compte;


public interface ICompteRepository extends JpaRepository<Compte,String>{

}
