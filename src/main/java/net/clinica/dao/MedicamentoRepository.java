package net.clinica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import net.clinica.entity.Medicamento;



public interface MedicamentoRepository extends JpaRepository<Medicamento, Integer>{
	
	
}
